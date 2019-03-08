package com.bloom.recrutement.service.modelservice;

import com.bloom.recrutement.entity.quzze.OuverteAnswer;
import com.bloom.recrutement.repository.OuverteAnswerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OuverteAnswerService {
    @Autowired
    OuverteAnswerRespository ouverteAnswerRespository;

    public List<OuverteAnswer> getAll(){
        return ouverteAnswerRespository.findAll();
    }

    public void add(OuverteAnswer ouverteAnswer){
        ouverteAnswerRespository.save(ouverteAnswer);
    }
}
