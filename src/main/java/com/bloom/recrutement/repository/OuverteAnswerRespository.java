package com.bloom.recrutement.repository;

import com.bloom.recrutement.entity.quzze.OuverteAnswer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OuverteAnswerRespository extends CrudRepository<OuverteAnswer, Integer> {
    @Override
    List<OuverteAnswer> findAll();
}
