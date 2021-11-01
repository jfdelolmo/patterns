package com.jfo.patterns.behavioral.c_visitor;

public class Engine extends CarPart {

    @Override
    public String whoami() {
        return "Engine " + this.hashCode();
    }
}
