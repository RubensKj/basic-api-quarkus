package com.rubenskj.portfolio.service;

import javax.enterprise.context.ApplicationScoped;
import java.util.UUID;

@ApplicationScoped
public class InsideService {

    private String id;

    private InsideService() {
        this.id = UUID.randomUUID().toString();
    }

    public String getServiceId() {
        return "It worked!! Id: " + this.id;
    }
}
