package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RandomNumberTest {
    private RandomNumber randomNumber;

    @Before
    public void setUp() throws Exception {
        randomNumber=new RandomNumber();
    }

    @After
    public void tearDown() throws Exception {
        randomNumber=null;
    }

    @Test
    public void guessMore() throws Exception {
        String expectedValue="Number guessed is more than original number";
        String actualValue=randomNumber.isRandomNumber(50);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void guessLess() throws Exception {
        String expectedValue="Number guessed is less than original number";
        String actualValue=randomNumber.isRandomNumber(50);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void guessMatches() throws Exception {
        String expectedValue="Number guessed matches the original number";
        String actualValue=randomNumber.isRandomNumber(68);
        assertNotEquals(expectedValue,actualValue);
    }
}