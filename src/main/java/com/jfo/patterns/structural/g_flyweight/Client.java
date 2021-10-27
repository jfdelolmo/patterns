package com.jfo.patterns.structural.g_flyweight;

public class Client {

    public static void main(String[] args) {
        WordProcessor wordProcessor = new WordProcessor();
        LetterFactory letterFactory = new LetterFactory();
        String text = "Hellooooooooooooo I'm aaaaaaaaaaa word processorrrrrrrrrrr";

        text.chars()
                .mapToObj(c -> (char) c)
                .map(String::valueOf)
                .map(letterFactory::createLetter)
                .forEach(wordProcessor::addLetter);

        wordProcessor.printLetters();
    }
}
