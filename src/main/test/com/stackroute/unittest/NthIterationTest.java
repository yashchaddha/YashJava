package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NthIterationTest {
private NthIteration nthIteration;
    @Before
    public void setUp() throws Exception {
        nthIteration=new NthIteration();
    }

    @After
    public void tearDown() throws Exception {
        nthIteration=null;
    }

    @Test
    public void doNthIteration() throws Exception {
        String expectedValue="1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ";
        String actualValue=nthIteration.doNthIteration(5);
        assertEquals(expectedValue,actualValue);

    }
    @Test
    public void doNotNthIteration() throws Exception {
        String expectedValue="1 2 2 3 3 3444 4 5 5 5 5 5 ";
        String actualValue=nthIteration.doNthIteration(5);
        assertNotEquals(expectedValue,actualValue);

    }
}