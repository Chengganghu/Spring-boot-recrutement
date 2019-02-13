package com.bloom.recrutement.controller;

import com.bloom.recrutement.authentication.model.JwtUser;
import com.bloom.recrutement.authentication.security.JwtGenerator;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Component
@Path("token")
public class TokenController {
    private JwtGenerator jwtGenerator;

    public TokenController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }

    @POST
    @Path("/jwt")
    @Consumes(MediaType.APPLICATION_JSON)
    public String generate(JwtUser jwtUser) {

        return jwtGenerator.generate(jwtUser);
    }


}
