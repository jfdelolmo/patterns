package com.jfo.patterns.additional.a_ioc;

public class UnixFileSystem implements FileSystem {

    @Override
    public String readFile() {
        return "Reading Unix file";
    }

}
