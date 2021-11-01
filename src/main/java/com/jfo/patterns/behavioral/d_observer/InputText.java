package com.jfo.patterns.behavioral.d_observer;

public class InputText implements Observer{

    public void setText(String text){
        System.out.println("Input text set: " +  text);
    }

    @Override
    public void update() {
        this.setText("Button has been clicked");
    }
}
