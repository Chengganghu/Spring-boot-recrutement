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


        Question question = new Question();
        question.setDescription("this is a test");
        question.setQuestionType(MULTIPLE);
        question.setTaglist(tags);
        question.setAnswer(ouverteAnswer);

        questionService.add(question);






    }
}
