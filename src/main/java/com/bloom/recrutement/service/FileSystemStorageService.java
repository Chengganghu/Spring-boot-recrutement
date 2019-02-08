package com.bloom.recrutement.service;

import com.bloom.recrutement.exceptions.StorageException;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
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
    public void store(InputStream inputStream, String type, FormDataContentDisposition fileDetails) {

        String filename = StringUtils.cleanPath(fileDetails.getFileName());
        try {
            if (filename.contains("..")) {
                // This is a security check
                throw new StorageException(
                        "Cannot store file with relative path outside current directory "
                                + filename);
            }
            try {
                String filePath = "src/main/resources/upload/"+type+'/' + filename;
                Path path = Paths.get(filePath);
                if(Files.exists(path)){
                    Random random = new Random();
                    Files.copy(inputStream,Paths.get(filePath+"_"+random.nextInt(100)) ,StandardCopyOption.REPLACE_EXISTING);
                }else
                    Files.copy(inputStream,path,StandardCopyOption.REPLACE_EXISTING);
            }catch(Exception e){

            }
        }
        catch (Exception e) {
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
