package com.jfo.patterns.behavioral.c_visitor;

public class Light extends CarPart {

    @Override
    public String whoami() {
        return "Light " + this.hashCode();
    }
}
