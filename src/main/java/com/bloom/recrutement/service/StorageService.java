package com.bloom.recrutement.service;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.nio.file.Path;
import java.util.stream.Stream;

public interface StorageService {
    void init();

    void store(InputStream inputStream, String type, FormDataContentDisposition fileDetails);

    Stream<Path> loadAll();

    Path load(String filename);

    Resource loadAsResource(String filename);

    void deleteAll();
}
