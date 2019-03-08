package com.bloom.recrutement.controller;

import com.bloom.recrutement.entity.Candidature;
import com.bloom.recrutement.service.modelservice.CandidatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("authen")
public class Authentication {
    @Autowired
    CandidatureService candidatureService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Candidature authentication(Candidature candidature){
        return checkUser(candidature);
    }

    private Candidature checkUser(Candidature candidature){
        List<Candidature> list = candidatureService.getAll();
        for(Candidature c:list){
            if(c.getEmail().equals(candidature.getEmail())){
                if(c.getMotdepasse().equals(candidature.getMotdepasse()))
                    return c;
            }
        }
        return null;
    }
}
