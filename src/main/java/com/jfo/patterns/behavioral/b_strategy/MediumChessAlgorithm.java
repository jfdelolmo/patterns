package com.jfo.patterns.behavioral.b_strategy;

public class MediumChessAlgorithm implements ChessAlgorithm {

    @Override
    public String calculateNextStep(){
        return "Medium movement";
    }
    
}
