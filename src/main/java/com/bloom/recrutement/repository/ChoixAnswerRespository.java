package com.bloom.recrutement.repository;

import com.bloom.recrutement.entity.quzze.ChoixAnswer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ChoixAnswerRespository extends CrudRepository<ChoixAnswer,Integer> {

    @Override
    List<ChoixAnswer> findAll();
}
