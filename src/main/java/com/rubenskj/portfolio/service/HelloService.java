package com.rubenskj.portfolio.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService {

    public String message(String name) {
        return "Hello " + name;
    }
}
