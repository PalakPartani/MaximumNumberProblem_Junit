package com.bridgelabz.maximumnumber;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {

    //uc1
    @Test
    public void givenMaximumIntegerNumber_AtFirstPosition_ShouldReturnSameNumber() {
        int max = new  MaximumNumber<>(50,20,10).findMaximum();
        Assert.assertEquals(50, max);
    }

    @Test
    public void givenMaximumIntegerNumber_AtSecondPosition_ShouldReturnSameNumber() {

        int max = new  MaximumNumber<>(20,50,10).findMaximum();
        Assert.assertEquals(50, max);
    }

    @Test
    public void givenMaximumIntegerNumber_AtThirdPosition_ShouldReturnSameNumber() {
        int max = new  MaximumNumber<>(20,50,80).findMaximum();
        Assert.assertEquals(80, max);
    }

    //uc2
    @Test
    public void givenMaximumFloatNumber_AtFirstPosition_ShouldReturnSameNumber() {
        float max=new MaximumNumber<>(50.2f, 20.2f, 30.2f).findMaximum();
        Assert.assertEquals(50.2f,max,0.0);

    }

    @Test
    public void givenMaximumFloatNumber_AtSecondNumber_ShouldReturnSameNumber() {
        float result = new MaximumNumber<>(20.f, 60.2f, 40.2f).findMaximum();
        Assert.assertEquals(60.2f, result,0.0);
    }

    @Test
    public void givenMaximumNumber_AtThirdNumber_ShouldReturnSameNumber() {
        float result = new MaximumNumber<>(20.f, 60.2f, 60.2f).findMaximum();
        Assert.assertEquals(60.2f, result,0.0);
    }

    //uc3
    @Test
    public void givenStringValue_whenAtFirstPosition_ShouldReturnMaxString() {
        String result = new MaximumNumber<>("Plk", "Aaa", "Ccc").findMaximum();
        Assert.assertEquals("Plk", result);
    }

    @Test
    public void giveStringValue_whenAtSecondPosition_ShouldReturnMaxString() {
        String result = new MaximumNumber<>("Aaa", "Plk", "Ccc").findMaximum();
        Assert.assertEquals("Plk", result);
    }

    @Test
    public void givenStringValue_whenAtThirdPosition_ShouldReturnMaxString() {
        String result = new MaximumNumber<>("Aaa", "Cdd", "plk").findMaximum();
        Assert.assertEquals("plk", result);
    }
}