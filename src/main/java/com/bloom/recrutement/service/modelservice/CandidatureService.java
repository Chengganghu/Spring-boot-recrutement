package com.bloom.recrutement.service.modelservice;

import com.bloom.recrutement.entity.Candidature;
import com.bloom.recrutement.repository.CandidatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatureService {
    @Autowired
    CandidatureRepository candidatureRepository;

    public List<Candidature> getAll(){
        return candidatureRepository.findAll();
    }

    public void addCandidature(Candidature candidature){
        candidatureRepository.save(candidature);
    }
}
