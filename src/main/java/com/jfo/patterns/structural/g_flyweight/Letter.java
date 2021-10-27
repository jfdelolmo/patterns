package com.jfo.patterns.structural.g_flyweight;

public class Letter {

    private String value;

    public Letter(String value) {
        System.out.printf("New letter created with value %s%n",value);
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
