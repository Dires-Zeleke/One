package com.Dires;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class UtilitiesTest {



    private Utilities utilities;

    @org.junit.Before
    public void setUp(){
        utilities = new Utilities();
    }

    @org.junit.Test
    public void everyNthChar() {
//        fail("This test is not been implemented");
    }

    @org.junit.Test
    public void removePairs() {
        String result = utilities.removePairs("AABCDDEFF");
        assertEquals("ABCDEF", result);

    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void converter() {
       utilities.converter(10, 0);
    }

    @org.junit.Test
    public void nullIfOddLength() {
    }
}