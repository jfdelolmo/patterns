package com.jfo.patterns.behavioral.c_visitor;

public class Wheel extends CarPart {

    @Override
    public String whoami() {
        return "Wheel " + this.hashCode();
    }

}
