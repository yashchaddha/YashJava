package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantTest {
    private  VowelConsonant vowelConsonant;

    @Before
    public void setUp() throws Exception {
        vowelConsonant=new VowelConsonant();
    }

    @After
    public void tearDown() throws Exception {
        vowelConsonant=null;
    }
    @Test
    public void isVowelConsonant() throws Exception {
        String expectedValue="vowel consonant ";
        String actualValue=vowelConsonant.isVowelConsonant("aw");
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void isNotVowelConsonant() throws Exception {
        String expectedValue="vowel consonant";
        String actualValue=vowelConsonant.isVowelConsonant("aw");
        assertNotEquals(expectedValue, actualValue);
    }
    @Test
    public void isVowelConsonantNumber() throws Exception {
        String expectedValue="vowel consonant 1 is not a  letter 2 is not a  letter 3 is not a  letter 4 is not a  letter 5 is not a  letter vowel ";
        String actualValue=vowelConsonant.isVowelConsonant("aw12345a");
        assertEquals(expectedValue, actualValue);
    }
}