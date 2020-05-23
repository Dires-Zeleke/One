package com.Dires;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesTestParametrized {

    private Utilities utilities;
    private String source;
    private String expected;

    public UtilitiesTestParametrized(String source, String expected) {
        this.source = source;
        this.expected = expected;
    }

    @org.junit.Before
    public  void  setup(){
        utilities = new Utilities();
        System.out.println("Running a test . . . ");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCondition(){
        return Arrays.asList(new Object[][]{
                {"ABCDEFF", "ABCDEF"},
                {"AB88EFFG", "AB8EFG"},
                {"112233445566", "123456"},
                {"ZYZQQB", "ZYZQB"},
                {"A", "A"}
        });
    }

    @org.junit.Test
    public void removeChar() {
        assertEquals(utilities.removePairs(source), expected);

    }
}

