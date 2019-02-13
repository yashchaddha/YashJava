package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IncreasingNumberTest {
     private IncreasingNumber increasingNumber;

    @Before
    public void setUp() throws Exception {
        increasingNumber=new IncreasingNumber();
    }

    @After
    public void tearDown() throws Exception {
        increasingNumber=null;
    }

    @Test
    public void sortString() throws Exception {
        char[] expectedValue={'5','4','4','3','3','2'};
        char input[]={'2','3','3','4','4','5'};
        char[] actualValue=increasingNumber.reverseString(input);
        assertArrayEquals(expectedValue,actualValue);

    }

    @Test
    public void evenSum() throws Exception {
        int expectedValue=10;
        char input[]={'5','4','4','3','3','2'};
        int actualValue=increasingNumber.evenSum(input);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void doIncrease()throws Exception  {
        boolean expectedValue=false;
        boolean actualValue=increasingNumber.doIncrease("234534");
        assertEquals(expectedValue,actualValue);
    }
}