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
    public void givenMaximumFloatNumber_whenAtFirstPosition_shouldReturnSameNumber() {
        Float result = maximumNumber.findMaximumNumber(60.2f, 20.2f, 40.2f);
        Assert.assertEquals(Float.valueOf(60.2f), result);
    }

    @Test
    public void givenMaximumFloatNumber_whenAtSecondNumber_shouldReturnSameNumber() {
        Float result = maximumNumber.findMaximumNumber(20.f, 60.2f, 40.2f);
        Assert.assertEquals(Float.valueOf(60.2f), result);
    }

    @Test
    public void givenMaximumNumber_whenAtThirdNumber_shouldReturnSameNumber() {
        Float result = maximumNumber.findMaximumNumber(40.2f, 20.2f, 60.2f);
        Assert.assertEquals(Float.valueOf(60.2f), result);
    }
}