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

    @Test
    public void givenMaximumIntegerNumber_AtFirstPosition_ShouldReturnSameNumber() {
        Assert.assertSame(100, maximumNumber.findMaximumNumber(100, 70, 30));
    }

    @Test
    public void givenMaximumNumber_AtSecondPosition_ShouldReturnSameNumber() {
        Assert.assertSame(50, maximumNumber.findMaximumNumber(20, 50, 10));
    }

    @Test
    public void givenMaximumNumber_AtThirdPosition_ShouldReturnSameNumber() {
        Assert.assertSame(80, maximumNumber.findMaximumNumber(50, 30, 80));
    }
}
