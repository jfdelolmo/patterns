package com.jfo.patterns.behavioral.b_strategy;

public class Client {

    public static void main(String[] args) {
        Chess chess = new Chess();

        System.out.printf("Calculate next step: %s%n", chess.calculateNextStep());

        chess.setChessAlgorithm(new MediumChessAlgorithm());
        System.out.printf("Calculate next step: %s%n", chess.calculateNextStep());

        chess.setChessAlgorithm(new HardChessAlgorithm());
        System.out.printf("Calculate next step: %s%n", chess.calculateNextStep());
    }
}
