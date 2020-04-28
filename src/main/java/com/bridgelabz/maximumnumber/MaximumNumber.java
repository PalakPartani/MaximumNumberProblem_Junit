package com.bridgelabz.maximumnumber;

import java.util.Arrays;
import java.util.Collections;

public class MaximumNumber<E extends Comparable> {
    private E firstValue;
    private E secondValue;
    private E thirdValue;
    private E[] optionalParameter;

    public MaximumNumber(E firstValue, E secondValue, E thirdValue, E... optionalParameter) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
        this.optionalParameter = optionalParameter;
    }

    public E findMaximum() {
        return findMaximum(firstValue, secondValue, thirdValue);
    }

    public static <E extends Comparable> E findMaximum(E firstValue, E secondValue, E thirdValue, E... optionalParam) {
        E maxValue = firstValue;
        if (maxValue.compareTo(secondValue) < 0) {
            maxValue = secondValue;
        }
        if (maxValue.compareTo(thirdValue) < 0) {
            maxValue = thirdValue;
        }
        if (optionalParam.length != 0) {
            Arrays.sort(optionalParam, Collections.reverseOrder());
            if (maxValue.compareTo(optionalParam[0]) < 0) {
                maxValue = optionalParam[0];
            }
        }
        printMaximum(maxValue);
        return maxValue;
    }

    public static <E extends Comparable> void printMaximum(E maxValue) {
        System.out.println("Maximum value: " + maxValue);
    }
}


 /*   public <E extends Comparable<E>> E findMaximum(E firstValue, E secondValue, E thirdValue) {
        E maxNumber = firstValue;
        if (maxNumber.compareTo(secondValue) < 0) {
            maxNumber = secondValue;
        }
        if (maxNumber.compareTo(thirdValue) < 0) {
            maxNumber = thirdValue;
        }
        return maxNumber;
    }*/
