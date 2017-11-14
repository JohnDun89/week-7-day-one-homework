package com.example.johnd.wordcounter;

import java.security.KeyStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Map.*;

/**
 * Created by JohnD on 13/11/2017.
 */

class WordCount {

    private String input;
    private HashMap<String, Integer> wordCount;

    public WordCount() {
        this.input = input;
        this.wordCount = new HashMap<>();

    }

    public Integer returnNumberOfCharactersInString(String string) {
        Integer numbers = string.split(" ").length;
        return numbers;

    }

    public String numberToString(Integer number) {
        String result = number.toString();
        return result;
    }

    public String number(String input) {
        Integer numericAmount = returnNumberOfCharactersInString(input);
        return numberToString(numericAmount);
    }

    // following adapted from stack over flow pages.

    public HashMap<String, Integer> returnNUmberOfTimesWordOccurs(String inputText) {
        String[] splitUp = inputText.split(" ");
        for (String word : splitUp)
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);

                }

        return wordCount;
    }
}