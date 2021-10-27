package com.jfo.patterns.creational.a_singleton;

public class Preferences {

    private static Preferences instance;

    protected Preferences() {
        //Private constructor to avoid instantiation
    }

    private synchronized static void createInstance() {
        if (null == instance) {
            instance = new Preferences();
        }
    }

    public static Preferences getInstance(){
        if(null == instance){
            createInstance();
        }
        return instance;
    }

    public void helloSingleton(){
        System.out.println("Hello! I'm a singleton");
    }
}
