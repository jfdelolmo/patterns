package com.jfo.patterns.behavioral.d_observer;

public class MyList implements Observer {

    public void setMyList(int value){
        System.out.println("Set MyList value: " +  value);
    }

    @Override
    public void update() {
        this.setMyList(1);
    }
}
