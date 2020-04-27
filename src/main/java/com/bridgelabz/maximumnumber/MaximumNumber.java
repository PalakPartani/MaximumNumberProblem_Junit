package com.bridgelabz.maximumnumber;

public class MaximumNumber {
    public <E extends Comparable<E>> E findMaximum(E firstValue, E secondValue, E thirdValue) {
        E maxNumber = firstValue;
        if (maxNumber.compareTo(secondValue) < 0) {
            maxNumber = secondValue;
        }
        if (maxNumber.compareTo(thirdValue) < 0) {
            maxNumber = thirdValue;
        }
        return maxNumber;
    }
}

