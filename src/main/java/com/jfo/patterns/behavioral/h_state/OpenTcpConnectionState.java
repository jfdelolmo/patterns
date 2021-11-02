package com.jfo.patterns.behavioral.h_state;

public class OpenTcpConnectionState implements TcpConnectionState{

    private final TcpConnection connection;

    public OpenTcpConnectionState(TcpConnection connection) {
        this.connection = connection;
    }

    @Override
    public void open() {
        System.out.println("Reinitializing the connection");
    }

    @Override
    public void close() {
        connection.setTcpConnectionState(new CloseTcpConnectionState(connection));
        System.out.println("Closing connection");
    }

    @Override
    public void acknowledge() {
        System.out.println("ACK");
    }

}
