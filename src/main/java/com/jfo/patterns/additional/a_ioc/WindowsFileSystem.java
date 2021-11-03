package com.jfo.patterns.additional.a_ioc;

public class WindowsFileSystem implements FileSystem {

    @Override
    public String readFile() {
        return "Reading Windows file";
    }

}
