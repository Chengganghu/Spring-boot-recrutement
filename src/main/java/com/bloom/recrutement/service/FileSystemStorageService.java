package com.bloom.recrutement.service;

import com.bloom.recrutement.exceptions.StorageException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.*;
import java.util.Random;
import java.util.stream.Stream;

@Service
public class FileSystemStorageService implements StorageService {


    @Override
    public void init() {

    }

    @Override
    public void store(MultipartFile file,String type) {

        String filename = StringUtils.cleanPath(file.getOriginalFilename());
        try {
            if (file.isEmpty()) {
                throw new StorageException("Failed to store empty file " + filename);
            }
            if (filename.contains("..")) {
                // This is a security check
                throw new StorageException(
                        "Cannot store file with relative path outside current directory "
                                + filename);
            }
            try (InputStream inputStream = file.getInputStream()) {
                String filePath = "src/main/resources/upload/"+type+'/' + filename;
                Path path = Paths.get(filePath);
                if(Files.exists(path)){
                    Random random = new Random();
                    Files.copy(inputStream,Paths.get(filePath+"_"+random.nextInt(100)) ,StandardCopyOption.REPLACE_EXISTING);
                }else
                    Files.copy(inputStream,path,StandardCopyOption.REPLACE_EXISTING);
            }
        }
        catch (IOException e) {
            throw new StorageException("Failed to store file " + filename, e);
        }
    }

    @Override
    public Stream<Path> loadAll() {
        return null;
    }

    @Override
    public Path load(String filename) {
        return null;
    }

    @Override
    public Resource loadAsResource(String filename) {
        return null;
    }

    @Override
    public void deleteAll() {

    }
}
