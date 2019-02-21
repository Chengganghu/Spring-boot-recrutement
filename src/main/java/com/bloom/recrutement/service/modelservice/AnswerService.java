package com.bloom.recrutement.service.modelservice;

import com.bloom.recrutement.entity.quzze.Answer;
import com.bloom.recrutement.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService  {
    @Autowired
    AnswerRepository answerRepository;

    public List<Answer> getAll(){
        return answerRepository.findAll();
    }

    public void addAnswer(Answer answer){
        answerRepository.save(answer);
    }

}
