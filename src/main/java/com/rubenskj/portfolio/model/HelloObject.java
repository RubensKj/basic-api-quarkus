package com.rubenskj.portfolio.model;

import java.util.UUID;

public class HelloObject {

    private String id;
    private String name;

    public HelloObject() {
    }

    public HelloObject(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloObject{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
