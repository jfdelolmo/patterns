package com.jfo.patterns.behavioral.h_state;

public class Client {

    public static void main(String[] args) throws IllegalAccessException {
        TcpConnection connection = new TcpConnection();

        connection.open();

        connection.acknowledge();
        connection.close();

        connection.acknowledge();
    }
}
