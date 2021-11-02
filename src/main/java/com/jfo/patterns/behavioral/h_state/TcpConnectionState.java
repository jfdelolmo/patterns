package com.jfo.patterns.behavioral.h_state;

public interface TcpConnectionState {

    void open();
    void close();
    void acknowledge() throws IllegalAccessException;
}
