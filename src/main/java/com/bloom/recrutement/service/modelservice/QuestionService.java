package com.bloom.recrutement.service.modelservice;

import com.bloom.recrutement.entity.quzze.Question;
import com.bloom.recrutement.repository.QuestionRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionRespository questionRespository;

    public List<Question> getAll(){
        return questionRespository.findAll();
    }

    public void add(Question question){
        questionRespository.save(question);
    }
}
