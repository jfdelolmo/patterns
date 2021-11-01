package com.jfo.patterns.behavioral.b_strategy;

public class Chess {

    private ChessAlgorithm chessAlgorithm = new EasyChessAlgorithm();

    public String calculateNextStep(){
        return chessAlgorithm.calculateNextStep();
    }

    public void setChessAlgorithm(ChessAlgorithm chessAlgorithm) {
        this.chessAlgorithm = chessAlgorithm;
    }
}
