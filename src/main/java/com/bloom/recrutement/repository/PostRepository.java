package com.bloom.recrutement.repository;

import com.bloom.recrutement.entity.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Integer> {
}
