package com.bloom.recrutement.controller.modelcontroller;


import com.bloom.recrutement.controller.Authentification;
import com.bloom.recrutement.controller.FileUpload;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;


@Configuration
@ApplicationPath("/jersey")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig()
    {
        register(CandidatureController.class);
        register(CORSFilter.class);
        register(FileUpload.class);
        register(PostController.class);
        register(MultiPartFeature.class);
        register(Authentification.class);
    }
}
