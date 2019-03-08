package com.bloom.recrutement.controller.modelcontroller;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("rest")
public class PostController {
    @GET
    @Path("test")
    public String test() {
        return "this is another test";
    }
}
