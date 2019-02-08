package com.bloom.recrutement.controller.modelcontroller;

import com.bloom.recrutement.entity.Candidature;
import com.bloom.recrutement.service.modelservice.CandidatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("rest")
public class CandidatureController {
    @Autowired
    CandidatureService candidatureService;

//    @GetMapping("/candidatures")
//    public List<Candidature> getAll(){
//        return candidatureService.getAll();
//    }
//
//    @CrossOrigin(origins = {"http://localhost:8088"})
//    @PostMapping(value = "candidatures",produces = "application/json",consumes = "application/json")
//    public void addCandidature(@RequestBody Candidature candidature){
//        candidatureService.addCandidature(candidature);
//    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("candidatures")
    public List<Candidature> getAll(){
        return candidatureService.getAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("candidatures")
    public void addCandidature(Candidature candidature){
        candidatureService.addCandidature(candidature);
    }
}
