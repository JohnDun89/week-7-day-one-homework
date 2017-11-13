package com.example.johnd.wordcounter;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by JohnD on 13/11/2017.
 */

public class WordCountTest {

    @Test
    public void canWordCountReturnTwo(){
        WordCount wordCount = new WordCount();
        Integer expected = 2;
        Integer actual = wordCount.returnNumberOfCharactersInString("Hello Buddy");
        assertEquals(expected,actual);
    }
}
