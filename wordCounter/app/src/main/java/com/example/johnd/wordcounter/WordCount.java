package com.example.johnd.wordcounter;

/**
 * Created by JohnD on 13/11/2017.
 */

class WordCount {

    private String input;

    public WordCount(){
        this.input = input;
    }

    public Integer returnNumberOfCharactersInString(String string){
        Integer numbers = string.split(" ").length;
        return numbers;

    }

    public String numberToString(Integer number){
       String result = number.toString();
       return result;
    }

    public String number(String input){
        Integer numericAmount = returnNumberOfCharactersInString(input);
        return numberToString(numericAmount);
    }
}

