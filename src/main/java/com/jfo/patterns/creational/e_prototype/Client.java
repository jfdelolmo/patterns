package com.jfo.patterns.creational.e_prototype;

public class Client {

    public static void main(String[] args) {

        Image image = new Image();
        image.setUrl("dummy_image_url");

        GraphicTool graphicTool = new GraphicTool(image);

        Graphic graphic = graphicTool.createGraphic();
        System.out.println(graphic.getClass().getSimpleName());
        System.out.println(graphic.showUrl());

        image.setUrl("dummy_image_url2");
        graphic = graphicTool.createGraphic();
        System.out.println(graphic.showUrl());


        Video video = new Video();
        video.setUrl("dummy_video_url");
        graphicTool.setPrototype(video);
        graphic = graphicTool.createGraphic();
        System.out.println(graphic.getClass().getSimpleName());
        System.out.println(graphic.showUrl());
    }
}
