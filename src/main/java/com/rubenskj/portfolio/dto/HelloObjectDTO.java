package com.rubenskj.portfolio.dto;

public class HelloObjectDTO {

    private String name;

    public HelloObjectDTO() {
    }

    public HelloObjectDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloObjectDTO{" +
                "name='" + name + '\'' +
                '}';
    }
}
