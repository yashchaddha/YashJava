package com.stackroute.unittest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomJerryTest {
    private TomJerry tomJerry;

    @Before
    public void setUp() throws Exception {
         tomJerry=new TomJerry();
    }

    @After
    public void tearDown() throws Exception {
        tomJerry=null;
    }

    @Test
    public void WithinRangeEven()throws Exception {


        String expectedValue="Jerry";
        String actualValue=tomJerry.TomAndJerry(26);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void BeforeRange() throws Exception {


        String expectedValue="Jerry";
        String actualValue=tomJerry.TomAndJerry(18);
        assertNotEquals(expectedValue, actualValue);
    }
    @Test
    public void AfterRange() throws Exception {


        String expectedValue="Jerry";
        String actualValue=tomJerry.TomAndJerry(50);
        assertNotEquals(expectedValue, actualValue);
    }

    @Test
    public void  WithinRangeOdd()throws Exception  {


        String expectedValue="Tom";
        String actualValue=tomJerry.TomAndJerry(29);
        assertEquals(expectedValue, actualValue);
    }
}