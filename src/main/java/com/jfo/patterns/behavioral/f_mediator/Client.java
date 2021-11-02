package com.jfo.patterns.behavioral.f_mediator;

public class Client {

    public static void main(String[] args) {
        MyList myList = new MyList();
        InputText inputText = new InputText();

        ScreenDirectorOne screenDirector = new ScreenDirectorOne();
        screenDirector.setInputText(inputText);

        myList.setScreenDirector(screenDirector);

        myList.getItems().add("Data item one");
        myList.getItems().add("Data item two");
        myList.getItems().add("Data item three");

        myList.selectItem(0);
        System.out.println("Selected value is: " + inputText.getValue());
        myList.selectItem(1);
        System.out.println("Selected value is: " + inputText.getValue());
        myList.selectItem(2);
        System.out.println("Selected value is: " + inputText.getValue());
    }

}
