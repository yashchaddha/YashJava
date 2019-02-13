package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
   private ReverseString reverseString;

    @Before
    public void setUp() throws Exception {
        reverseString=new ReverseString();
    }


    @After
    public void tearDown() throws Exception {
        reverseString=null;
    }

    @Test
    public void doReverse() throws Exception {
        String expectedValue="EVIL";
        String actualValue=reverseString.doReverse("LIVE");
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void notReverse() throws Exception {
        String expectedValue="ELIV";
        String actualValue=reverseString.doReverse("LIVE");
        assertNotEquals(expectedValue,actualValue);
    }
}