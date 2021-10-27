package com.jfo.patterns.creational.e_prototype;

public class Video extends Graphic {

    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public Graphic clone() {
        Video clone = new Video();
        clone.setUrl(this.url);
        return clone;
    }

    @Override
    public String showUrl() {
        return url;
    }

}
