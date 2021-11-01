package com.jfo.patterns.behavioral.b_strategy;

public class HardChessAlgorithm implements ChessAlgorithm {

    @Override
    public String calculateNextStep(){
        return "Hard movement";
    }
    
}
