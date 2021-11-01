package com.jfo.patterns.behavioral.b_strategy;

public class EasyChessAlgorithm implements ChessAlgorithm {

    @Override
    public String calculateNextStep(){
        return "Easy movement";
    }
    
}
