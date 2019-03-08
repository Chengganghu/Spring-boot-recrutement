package com.bloom.recrutement.service.modelservice;

import com.bloom.recrutement.entity.quzze.ChoixAnswer;
import com.bloom.recrutement.repository.ChoixAnswerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChoixAnswerService  {
    @Autowired
    ChoixAnswerRespository choixAnswerRespository;

    public List<ChoixAnswer> getAll(){return choixAnswerRespository.findAll();}

    public void addChoixAnswer(ChoixAnswer choixAnswer){choixAnswerRespository.save(choixAnswer);}
}
