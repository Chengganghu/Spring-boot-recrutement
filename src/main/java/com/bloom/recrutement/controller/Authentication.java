package com.bloom.recrutement.controller;

import com.bloom.recrutement.entity.Candidature;
import com.bloom.recrutement.service.modelservice.CandidatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("authen")
public class Authentication {
    @Autowired
    CandidatureService candidatureService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean authentication(Candidature candidature){
        return checkUser(candidature);
    }

    private boolean checkUser(Candidature candidature){
        List<Candidature> list = candidatureService.getAll();
        for(Candidature c:list){
            if(c.getEmail().equals(candidature.getEmail())){
                if(c.getMotdepasse().equals(candidature.getMotdepasse()))
                    return true;
            }
        }
        return false;
    }
}
