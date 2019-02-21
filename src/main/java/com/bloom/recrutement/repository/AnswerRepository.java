package com.bloom.recrutement.repository;

import com.bloom.recrutement.entity.quzze.Answer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnswerRepository extends CrudRepository<Answer,Integer> {
    @Override
    List<Answer> findAll();
}
