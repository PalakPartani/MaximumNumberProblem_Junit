package com.bridgelabz.maximumnumber;

public class MaximumNumber<E extends Comparable<E>> {
    private E firstValue;
    private E secondValue;
    private E thirdValue;

    public MaximumNumber(E firstValue, E secondValue, E thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public E findMaximum() {
        return findMaximum(firstValue, secondValue, thirdValue);
    }

    public static <E extends Comparable<E>> E findMaximum(E firstValue, E secondValue, E thirdValue) {
        E maxValue = firstValue;
        if (maxValue.compareTo(secondValue) < 0) {
            maxValue = secondValue;
        }
        if (maxValue.compareTo(thirdValue) < 0) {
            maxValue = thirdValue;
        }
          printMax(maxValue);
        return maxValue;
    }

    public static <E extends Comparable<E>> void printMax(E maxValue) {
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
