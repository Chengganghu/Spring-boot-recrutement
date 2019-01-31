package com.bloom.recrutement.controller;


import com.bloom.recrutement.service.FileSystemStorageService;
import com.bloom.recrutement.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.Random;

@RestController
public class FileUpload {
    @Autowired
    FileSystemStorageService fileSystemStorageService;

    Logger logger = LoggerFactory.getLogger(FileUpload.class);
    @CrossOrigin(origins = {"http://localhost:8088"})
    @PostMapping(value = "/uploads/cv",consumes = "multipart/form-data")
    public void HandleCVUpload(@RequestParam("cv") MultipartFile cv){
        fileSystemStorageService.store(cv,"cvs");
    }

    @CrossOrigin(origins = {"http://localhost:8088"})
    @PostMapping(value = "/uploads/lettre",consumes = "multipart/form-data")
    public void HandlelettreUpload(@RequestParam("lettre") MultipartFile lettre){
        fileSystemStorageService.store(lettre,"lettres");
    }
}
