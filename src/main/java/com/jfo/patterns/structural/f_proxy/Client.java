package com.jfo.patterns.structural.f_proxy;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        ImageProxy image1 = new ImageProxy("first dummy url");
        ImageProxy image2 = new ImageProxy("second dummy url");

        List<Image> imageList = new ArrayList<>();
        imageList.add(image1);
        imageList.add(image2);

        Application application = new Application(imageList);
        System.out.println("Application draw");
        application.draw();
    }
}
