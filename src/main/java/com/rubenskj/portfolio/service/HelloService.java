package com.rubenskj.portfolio.service;

import com.rubenskj.portfolio.dto.HelloObjectDTO;
import com.rubenskj.portfolio.model.HelloObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class HelloService {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloService.class);

    @Inject
    InsideService insideService;

    public String message(String name) {
        LOGGER.info("Logging a service inside service: {}", insideService.getServiceId());

        return "Hello " + name;
    }

    public HelloObject createObject(HelloObjectDTO helloObjectDTO) {
        LOGGER.info("Receiving HelloObject from body. Body: {}", helloObjectDTO);

        HelloObject helloObject = new HelloObject(helloObjectDTO.getName());

        LOGGER.info("Creting HelloObject with Id: {}", helloObject.getId());

        return helloObject;
    }
}
