package com.bridgelabz.maximumnumber;

public class MaximumNumber {
    public int findMaximumNumber(int num1, int num2, int num3) {
        Integer maxNumber = num1;
        if (maxNumber.compareTo(num2) < 0) {
            maxNumber = num2;
        }
        if (maxNumber.compareTo(num3) < 0) {
            maxNumber = num3;
        }
        return maxNumber;
    }
}
