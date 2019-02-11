package com.bloom.recrutement.controller;

import com.bloom.recrutement.entity.Candidature;
import com.bloom.recrutement.service.modelservice.CandidatureService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.security.Key;
import java.util.List;

@Component
@Path("authen")
public class Authentification {
    @Autowired
    CandidatureService candidatureService;

//    @CrossOrigin(origins = {"http://localhost:8088"})
//    @PostMapping(value = "authen",consumes = "application/json")
//    public ResponseEntity authentication(@RequestBody Candidature candidature){
//        List<Candidature> list = candidatureService.getAll();
//        String email = candidature.getEmail();
//        String motdepasse = candidature.getMotdepasse();
//        for(Candidature c:list){
//            if(c.getEmail().equals(email)){
//                if(c.getMotdePass().equals(motdepasse)){
//                    Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
//                    String tokenn = Jwts.builder().setSubject(email).signWith(key).compact();
//
//                }
//            }
//        }
//        return null;
//    }

    @POST
    @Consumes("application/json")
    public Response authen(Candidature candidature){
        List<Candidature> list = candidatureService.getAll();
        String email = candidature.getEmail();
        String motdepasse = candidature.getMotdepasse();
        for(Candidature c:list){
            if(c.getEmail().equals(email)){
                if(c.getMotdePass().equals(motdepasse)){
                    Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
                    String token = Jwts.builder().setSubject(email).signWith(key).compact();
                    return Response.ok(token).build();
                }
            }
        }
        return Response.status(Response.Status.BAD_REQUEST).entity("motdepasse pas bon").build();
    }
}
