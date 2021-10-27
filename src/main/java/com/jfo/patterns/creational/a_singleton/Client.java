package com.jfo.patterns.creational.a_singleton;

public class Client {

    public static void main(String[] args) {
        Preferences.getInstance().helloSingleton();
        MyPreferences.getInstance().helloSingleton();
    }
}
