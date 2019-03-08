package com.bloom.recrutement.service.modelservice;

import com.bloom.recrutement.repository.PostDescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostDescriptionService {
    @Autowired
    PostDescriptionRepository postDescriptionRepository;
}
