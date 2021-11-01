package com.jfo.patterns.behavioral.d_observer;

import java.util.ArrayList;
import java.util.List;

public class Button implements Subject {

    List<Observer> observerList = new ArrayList<>();

    public void clicked(){
        change();
    }

    @Override
    public void attachObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detachObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void change() {
        observerList.forEach(Observer::update);
    }
}
