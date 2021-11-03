package com.jfo.patterns.additional.a_ioc;

public class Container {

    private ImageService imageService;

    public void init(){
        imageService = new ImageService();
        imageService.setFileSystem(new WindowsFileSystem());
    }

    public ImageService getImageService() {
        return imageService;
    }

    public static void main(String[] args) {
        Container container = new Container();
        container.init();

        ImageService imageService = container.getImageService();
        imageService.readImage();

        imageService.setFileSystem(new UnixFileSystem());
        imageService.readImage();
    }
}
