package com.bridgelabz.maximumnumber;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumNumberTest {
    MaximumNumber maximumNumber;

    @Before
    public void setUp() throws Exception {
        maximumNumber = new MaximumNumber();
    }

    //uc1
    @Test
    public void givenMaximumIntegerNumber_AtFirstPosition_ShouldReturnSameNumber() {
        Assert.assertEquals(100, maximumNumber.findMaximumNumber(100, 70, 30));
    }

    @Test
    public void givenMaximumIntegerNumber_AtSecondPosition_ShouldReturnSameNumber() {
        Assert.assertEquals(50, maximumNumber.findMaximumNumber(20, 50, 10));
    }

    @Test
    public void givenMaximumIntegerNumber_AtThirdPosition_ShouldReturnSameNumber() {
        Assert.assertEquals(80, maximumNumber.findMaximumNumber(50, 30, 80));
    }

    //uc2
    @Test
    public void givenMaximumFloatNumber_AtFirstPosition_ShouldReturnSameNumber() {
        Float result = maximumNumber.findMaximumNumber(60.2f, 20.2f, 40.2f);
        Assert.assertEquals(Float.valueOf(60.2f), result);
    }

    @Test
    public void givenMaximumFloatNumber_AtSecondNumber_ShouldReturnSameNumber() {
        Float result = maximumNumber.findMaximumNumber(20.f, 60.2f, 40.2f);
        Assert.assertEquals(Float.valueOf(60.2f), result);
    }

    @Test
    public void givenMaximumNumber_AtThirdNumber_ShouldReturnSameNumber() {
        Float result = maximumNumber.findMaximumNumber(40.2f, 20.2f, 60.2f);
        Assert.assertEquals(Float.valueOf(60.2f), result);
    }

    @Test
    public void givenStringValue_whenAtFirstPosition_ShouldReturnMaxString() {
        String result = maximumNumber.findMaximumString("Plk", "Aaa", "Ccc");
        Assert.assertEquals("Plk", result);
    }

    @Test
    public void giveStringValue_whenAtSecondPosition_ShouldReturnMaxString() {
        String result = maximumNumber.findMaximumString("Aaa", "Plk", "Ccc");
        Assert.assertEquals("Plk", result);
    }

    @Test
    public void givenStringValue_whenAtThirdPosition_ShouldReturnMaxString() {
        String result = maximumNumber.findMaximumString("Aaa", "Cdd", "plk");
        Assert.assertEquals("plk", result);
    }

}