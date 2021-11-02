package com.jfo.patterns.behavioral.h_state;

public class CloseTcpConnectionState implements TcpConnectionState{

    private TcpConnection connection;

    public CloseTcpConnectionState(TcpConnection connection) {
        this.connection = connection;
    }

    @Override
    public void open() {
        System.out.println("Opening the connection");
        connection.setTcpConnectionState(new OpenTcpConnectionState(connection));
    }

    @Override
    public void close() {
        System.out.println("Already closed connection");
    }

    @Override
    public void acknowledge() throws IllegalAccessException {
        throw new IllegalAccessException("Invalid usage of ACK, connection is closed");
    }

}
