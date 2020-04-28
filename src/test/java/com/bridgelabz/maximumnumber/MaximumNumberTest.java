package com.bridgelabz.maximumnumber;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {

    //uc1
    @Test
    public void givenMaximumIntegerNumber_AtFirstPosition_ShouldReturnSameNumber() {
        int max = new MaximumNumber<>(50, 20, 10).findMaximum();
        Assert.assertEquals(50, max);
    }

    @Test
    public void givenMaximumIntegerNumber_AtSecondPosition_ShouldReturnSameNumber() {

        int max = new MaximumNumber<>(20, 50, 10).findMaximum();
        Assert.assertEquals(50, max);
    }

    @Test
    public void givenMaximumIntegerNumber_AtThirdPosition_ShouldReturnSameNumber() {
        int max = new MaximumNumber<>(20, 50, 80).findMaximum();
        Assert.assertEquals(80, max);
    }

    //uc2
    @Test
    public void givenMaximumFloatNumber_AtFirstPosition_ShouldReturnSameNumber() {
        float max = new MaximumNumber<>(50.2f, 20.2f, 30.2f).findMaximum();
        Assert.assertEquals(50.2f, max, 0.0);
    }

    @Test
    public void givenMaximumFloatNumber_AtSecondNumber_ShouldReturnSameNumber() {
        float max = new MaximumNumber<>(20.f, 60.2f, 40.2f).findMaximum();
        Assert.assertEquals(60.2f, max, 0.0);
    }

    @Test
    public void givenMaximumNumber_AtThirdNumber_ShouldReturnSameNumber() {
        float max = new MaximumNumber<>(20.f, 60.2f, 60.2f).findMaximum();
        Assert.assertEquals(60.2f, max, 0.0);
    }

    //uc3
    @Test
    public void givenStringValue_AtFirstPosition_ShouldReturnMaxString() {
        String max = new MaximumNumber<>("Plk", "Aaa", "Ccc").findMaximum();
        Assert.assertEquals("Plk", max);
    }

    @Test
    public void giveStringValue_AtSecondPosition_ShouldReturnMaxString() {
        String max = new MaximumNumber<>("Aaa", "Plk", "Ccc").findMaximum();
        Assert.assertEquals("Plk", max);
    }

    @Test
    public void givenStringValue_AtThirdPosition_ShouldReturnMaxString() {
        String max = new MaximumNumber<>("Aaa", "Cdd", "plk").findMaximum();
        Assert.assertEquals("plk", max);
    }

    //optional
    @Test
    public void givenMaximumIntegerNumberOptionalParam_AtFirstPosition_ShouldReturnSameNumber() {
        int max = new MaximumNumber<>(50, 20, 10, 5).findMaximum();
        Assert.assertEquals(50, max);
    }

    @Test
    public void givenMaximumFloatNumberOptionalParam_AtFirstPosition_ShouldReturnSameNumber() {
        float max = new MaximumNumber<>(50.2f, 20.2f, 30.2f, 16.18f).findMaximum();
        Assert.assertEquals(50.2f, max, 0.0);
    }

    @Test
    public void givenStringValueOptionalParam_AtFirstPosition_ShouldReturnMaxString() {
        String max = new MaximumNumber<>("Plk", "Aaa", "Kanu", "kg").findMaximum();
        Assert.assertEquals("Plk", max);
    }
}