package com.jfo.patterns.structural.g_flyweight;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {

    private final Map<String, Letter> cache = new HashMap<>();

    public Letter createLetter(String key){
        cache.computeIfAbsent(key, Letter::new);
        return cache.get(key);
    }
}
