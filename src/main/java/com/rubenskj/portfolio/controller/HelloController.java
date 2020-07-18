package com.rubenskj.portfolio.controller;

import com.rubenskj.portfolio.dto.HelloObjectDTO;
import com.rubenskj.portfolio.model.HelloObject;
import com.rubenskj.portfolio.service.HelloService;
import com.rubenskj.portfolio.service.InsideService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @Inject
    HelloService helloService;

    @Inject
    InsideService insideService;

    @GET
    @Path("/{name}")
    public String hello(@PathParam("name") String name) {
        LOGGER.info("Testing creation of service. Service Id: {}", insideService.getServiceId());

        return helloService.message(name);
    }

    @POST
    @Path("/add")
    public HelloObject createHello(HelloObjectDTO helloObjectDTO) {
        return this.helloService.createObject(helloObjectDTO);
    }
}