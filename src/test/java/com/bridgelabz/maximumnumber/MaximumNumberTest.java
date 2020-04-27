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
        int max = maximumNumber.findMaximum(5, 3, 1);
        Assert.assertEquals(5, max);

    }

    @Test
    public void givenMaximumIntegerNumber_AtSecondPosition_ShouldReturnSameNumber() {
        int max = maximumNumber.findMaximum(20, 50, 10);
        Assert.assertEquals(50, max);
    }

    @Test
    public void givenMaximumIntegerNumber_AtThirdPosition_ShouldReturnSameNumber() {
        int max = maximumNumber.findMaximum(50, 30, 80);
        Assert.assertEquals(80, max);
    }

    //uc2
    @Test
    public void givenMaximumFloatNumber_AtFirstPosition_ShouldReturnSameNumber() {
        Float result = maximumNumber.findMaximum(60.2f, 20.2f, 40.2f);
        Assert.assertEquals(Float.valueOf(60.2f), result);
    }

    @Test
    public void givenMaximumFloatNumber_AtSecondNumber_ShouldReturnSameNumber() {
        Float result = maximumNumber.findMaximum(20.f, 60.2f, 40.2f);
        Assert.assertEquals(Float.valueOf(60.2f), result);
    }

    @Test
    public void givenMaximumNumber_AtThirdNumber_ShouldReturnSameNumber() {
        Float result = maximumNumber.findMaximum(40.2f, 20.2f, 60.2f);
        Assert.assertEquals(Float.valueOf(60.2f), result);
    }

    @Test
    public void givenStringValue_whenAtFirstPosition_ShouldReturnMaxString() {
        String result = maximumNumber.findMaximum("Plk", "Aaa", "Ccc");
        Assert.assertEquals("Plk", result);
    }

    @Test
    public void giveStringValue_whenAtSecondPosition_ShouldReturnMaxString() {
        String result = maximumNumber.findMaximum("Aaa", "Plk", "Ccc");
        Assert.assertEquals("Plk", result);
    }

    @Test
    public void givenStringValue_whenAtThirdPosition_ShouldReturnMaxString() {
        String result = maximumNumber.findMaximum("Aaa", "Cdd", "plk");
        Assert.assertEquals("plk", result);
    }

}