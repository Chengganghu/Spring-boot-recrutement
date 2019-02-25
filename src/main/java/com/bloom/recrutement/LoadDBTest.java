package com.bloom.recrutement;

import com.bloom.recrutement.entity.quzze.*;
import com.bloom.recrutement.service.modelservice.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

import static com.bloom.recrutement.entity.quzze.QuestionType.MULTIPLE;

@Component
public class LoadDBTest implements CommandLineRunner {
    @Autowired
    QuestionService questionService;
    @Override
    public void run(String... args) throws Exception {
        QuestionTag questionTag1 = new QuestionTag();
        questionTag1.setName("test1");
        QuestionTag questionTag2 = new QuestionTag();
        questionTag2.setName("essai");
        List<QuestionTag> tags = new LinkedList<>();
        tags.add(questionTag1);
        tags.add(questionTag2);

        OuverteAnswer ouverteAnswer = new OuverteAnswer();
        ouverteAnswer.setAnswerDes("answer description");

        ChoixAnswer choixAnswer = new ChoixAnswer();
        Choix choix1 = new Choix();
        choix1.setDescription("this is choix1 worldline fait");
        choix1.setRightAns(true);
        Choix choix2 = new Choix();
        choix2.setDescription("this is choix2 chengganghu fait");
        choix2.setRightAns(false);


        choixAnswer.getChoixList().add(choix1);
        choixAnswer.getChoixList().add(choix2);

        Question question = new Question();
        question.setDescription("this is a test");
        question.setQuestionType(MULTIPLE);
        question.setTaglist(tags);
        question.setOuverteAnswer(ouverteAnswer);

        Question question1 = new Question();
        question1.setQuestionType(MULTIPLE);
        question1.setDescription("this is a choix question");
        //question1.setTaglist(tags);
        question1.setChoixAnswer(choixAnswer);


        questionService.add(question);
        questionService.add(question1);





    }
}
