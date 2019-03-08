package com.bloom.recrutement.config;


import com.bloom.recrutement.controller.AuthenticationController;
import com.bloom.recrutement.controller.FileUploadController;
import com.bloom.recrutement.controller.TokenController;
import com.bloom.recrutement.controller.modelcontroller.CandidatureController;
import com.bloom.recrutement.controller.modelcontroller.PostController;
import com.bloom.recrutement.controller.modelcontroller.QuestionController;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;


@Configuration
@ApplicationPath("/jersey")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(CandidatureController.class);
        register(CORSFilter.class);
        register(FileUploadController.class);
        register(PostController.class);
        register(MultiPartFeature.class);
        register(TokenController.class);
        register(AuthenticationController.class);
        register(QuestionController.class);
    }
}
