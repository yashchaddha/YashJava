package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {
     private Addition addition;

    @Before
    public void setUp() throws Exception {
        addition=new Addition();
    }

    @After
    public void tearDown() throws Exception {
        addition=null;
    }

    @Test
    public void doAddition() throws Exception {
        String expectedValue="300";
        String actualValue=addition.doAddition("1 3 100 96 50 1 24 3 22");
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void AdditionFail()throws Exception  {
        String expectedValue="300";
        String actualValue=addition.doAddition("1 3   100 96 50 1 24 3 22");
        assertNotEquals(expectedValue,actualValue);
    }
}