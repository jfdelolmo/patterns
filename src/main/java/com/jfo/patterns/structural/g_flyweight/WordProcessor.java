package com.jfo.patterns.structural.g_flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.String.format;

public class WordProcessor {

    private static final String MESSAGE = "Processed message: %s%n";

    private final List<Letter> letterList = new ArrayList<>();

    public void addLetter(Letter letter) {
        letterList.add(letter);
    }

    public void printLetters() {
        String text = letterList.stream()
                .map(Letter::getValue)
                .collect(Collectors.joining());

        System.out.printf(MESSAGE, text);
    }
}
