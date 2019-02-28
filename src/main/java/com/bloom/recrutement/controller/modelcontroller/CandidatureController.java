package com.bloom.recrutement.controller.modelcontroller;

import com.bloom.recrutement.entity.Candidature;
import com.bloom.recrutement.service.modelservice.CandidatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("")
public class CandidatureController {
    @Autowired
    CandidatureService candidatureService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("candidatures")
    public List<Candidature> getAll() {
        return candidatureService.getAll();
    }


    @POST
    @Path("candidatures")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addCandidature(Candidature candidature) {
        candidatureService.addCandidature(candidature);
    }
}
