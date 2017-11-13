package com.example.johnd.wordcounter;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

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


    @Test
    public void canReturnString(){
        WordCount wordCount = new WordCount();
        assertEquals("5",wordCount.numberToString(5));

    }
}
