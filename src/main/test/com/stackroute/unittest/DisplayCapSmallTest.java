package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DisplayCapSmallTest {
    private DisplayCapSmall displayCapSmall;

    @Before
    public void setUp() throws Exception {
        displayCapSmall=new DisplayCapSmall();
    }

    @After
    public void tearDown() throws Exception {
        displayCapSmall=null;
    }

    @Test
    public void displayCapital() throws Exception {
        String expectedValue="Capital Letter";
        String actualValue=displayCapSmall.displayCharacter('A');
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void displaySmall() throws Exception {
        String expectedValue="Small Letter";
        String actualValue=displayCapSmall.displayCharacter('a');
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void displayDigit() throws Exception {
        String expectedValue="Digit";
        String actualValue=displayCapSmall.displayCharacter('1');
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void displaySpecialSymbol() throws Exception {
        String expectedValue="Special Symbol";
        String actualValue=displayCapSmall.displayCharacter('@');
        assertEquals(expectedValue,actualValue);
    }
}