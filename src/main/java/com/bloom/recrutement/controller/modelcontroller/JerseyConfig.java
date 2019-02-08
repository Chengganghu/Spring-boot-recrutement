package com.bloom.recrutement.controller.modelcontroller;


import com.bloom.recrutement.controller.FileUpload;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig()
    {
        register(CandidatureController.class);
//        register(CORSFilter.class);
        register(FileUpload.class);
    }
}
