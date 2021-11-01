package com.jfo.patterns.behavioral.d_observer;

public class Client {

    public static void main(String[] args) {
        Button button = new Button();
        InputText inputText = new InputText();
        MyList myList = new MyList();

        button.attachObserver(inputText);
        button.attachObserver(myList);

        button.clicked();
    }

}
