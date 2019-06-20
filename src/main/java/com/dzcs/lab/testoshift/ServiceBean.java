package com.dzcs.lab.testoshift;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class ServiceBean {

    public static final String PREFIX = "Hello ";

    public String giveMe(String value) {
        return PREFIX + value;
    }
}
