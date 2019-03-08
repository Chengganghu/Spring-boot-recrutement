package com.bloom.recrutement.repository;

import com.bloom.recrutement.entity.Candidature;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CandidatureRepository extends CrudRepository<Candidature, Integer> {
    @Override
    public List<Candidature> findAll();
}
