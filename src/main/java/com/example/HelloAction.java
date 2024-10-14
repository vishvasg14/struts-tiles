package com.example;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String execute() {
//        System.out.println("Hello " + name);

        return SUCCESS;
    }
}
