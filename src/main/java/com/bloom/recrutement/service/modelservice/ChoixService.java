package com.bloom.recrutement.service.modelservice;

import com.bloom.recrutement.entity.quzze.Choix;
import com.bloom.recrutement.repository.ChoixRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChoixService {
    @Autowired
    ChoixRespository choixRespository;

    public List<Choix> getAll(){return choixRespository.findAll();}

    public void addChoix(Choix choix){choixRespository.save(choix);}
}
