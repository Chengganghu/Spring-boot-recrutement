package com.bloom.recrutement.controller.modelcontroller;

import com.bloom.recrutement.entity.Candidature;
import com.bloom.recrutement.service.modelservice.CandidatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/rest")
public class CandidatureController {
    @Autowired
    CandidatureService candidatureService;

    @GetMapping("/candidatures")
    public List<Candidature> getAll(){
        return candidatureService.getAll();
    }

    @PostMapping(value = "candidatures",produces = "application/json",consumes = "application/json")
    public void addCandidature(@RequestBody Candidature candidature){
        candidatureService.addCandidature(candidature);
    }
}
