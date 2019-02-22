package com.bloom.recrutement.controller.modelcontroller;

import com.bloom.recrutement.entity.quzze.Question;
import com.bloom.recrutement.service.modelservice.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Component
@Path("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("rest/all")
    public List<Question> getAll(){return questionService.getAll();}

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("restful")
    public void add(Question question){
        questionService.add(question);
    }

    @GET
    @Path("test")
    public String test(){
        return "this is a test";
    }
}
