package com.bloom.recrutement.repository;

import com.bloom.recrutement.entity.quzze.Choix;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ChoixRespository extends CrudRepository<Choix, Integer> {
    @Override
    List<Choix> findAll();
}
