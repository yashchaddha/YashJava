package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    private Palindrome palindrome;

    @Before
    public void setUp() throws Exception {
        palindrome=new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
        palindrome=null;
    }

    @Test
    public void checkPalindrome() throws Exception {
        boolean expectedValue=true;
        boolean actualValue=palindrome.checkPalindrome("123321");
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void palindromeGreaterSum() throws Exception {
        String expectedValue="18283838281 is palindrome and the sum of even numbers is greater than 25";
        String actualValue=palindrome.checkInput("18283838281");
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void palindromeLesserSum()throws Exception  {
        String expectedValue="123321 is palindrome and the sum of even numbers is less than 25";
        String actualValue=palindrome.checkInput("123321");
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void notPalindrome() throws Exception {
        String expectedValue="12332188888 is not palindrome";
        String actualValue=palindrome.checkInput("12332188888");
        assertEquals(expectedValue,actualValue);
    }


}