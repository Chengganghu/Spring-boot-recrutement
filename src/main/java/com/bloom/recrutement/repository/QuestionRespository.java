package com.bloom.recrutement.repository;

import com.bloom.recrutement.entity.quzze.Question;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuestionRespository extends CrudRepository<Question, Integer> {
    @Override
    List<Question> findAll();
}
