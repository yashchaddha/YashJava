package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringRepetitionTest {
     private StringRepetition stringRepetition;

    @Before
    public void setUp() throws Exception {
        stringRepetition=new StringRepetition();

    }

    @After
    public void tearDown() throws Exception {
        stringRepetition=null;
    }

    @Test
    public void isRepetitionTrue() throws Exception {
        String expectedValue="anuragratnaratnaratnaratnaratnaratna";
        String actualValue=stringRepetition.isRepetition("anuragratna",5);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void isRepetitionFalse() throws Exception {
        String expectedValue="anuragratna";
        String actualValue=stringRepetition.isRepetition("anuragratna",5);
        assertNotEquals(expectedValue, actualValue);
    }
}