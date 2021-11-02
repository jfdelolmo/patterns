package com.jfo.patterns.behavioral.h_state;

public class TcpConnection implements TcpConnectionState {

    private TcpConnectionState tcpConnectionState = new CloseTcpConnectionState(this);

    public void setTcpConnectionState(TcpConnectionState tcpConnectionState) {
        this.tcpConnectionState = tcpConnectionState;
    }

    @Override
    public void open() {
        tcpConnectionState.open();
    }

    @Override
    public void close() {
        tcpConnectionState.close();
    }

    @Override
    public void acknowledge() throws IllegalAccessException {
        tcpConnectionState.acknowledge();
    }
}
