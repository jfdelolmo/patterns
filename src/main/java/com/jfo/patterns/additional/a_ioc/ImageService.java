package com.jfo.patterns.additional.a_ioc;

public class ImageService {

    private FileSystem fileSystem;

    public void setFileSystem(FileSystem fileSystem) {
        this.fileSystem = fileSystem;
    }

    public void readImage(){
        System.out.println(fileSystem.readFile());
    }

}
