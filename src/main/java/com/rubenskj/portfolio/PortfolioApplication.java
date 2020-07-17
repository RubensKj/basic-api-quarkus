package com.rubenskj.portfolio;

import com.rubenskj.portfolio.service.HelloService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class PortfolioApplication {

    @Inject
    HelloService helloService;

    @GET
    @Path("/{name}")
    public String hello(@PathParam("name") String name) {
        return helloService.message(name);
    }
}