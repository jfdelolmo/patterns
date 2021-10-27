package com.jfo.patterns.creational.d_abstract_factory;

public class Client {

    private static void initializeGui(WidgetFactory factory) {
        initializeGUI(factory.createScrollBar(), factory.createWindow());
    }

    public static void initializeGUI(ScrollBar bar, Window window){
        System.out.printf(
                "Do initialization logic here with %s and %s%n",
                bar.getClass().getSimpleName(),
                window.getClass().getSimpleName()
                );
    }

    public static void main(String[] args) {

        ScrollBar bar = new YellowThemeScrollBar();
        Window window = new YellowThemeWindow();
        initializeGUI(bar, window);

        bar = new YellowThemeScrollBar();
        window = new PinkThemeWindow();
        initializeGUI(bar, window);

        WidgetFactory factory = new PinkThemeWidgetFactory();
        initializeGui(factory);

        factory = new YellowThemeWidgetFactory();
        initializeGui(factory);
    }
}
