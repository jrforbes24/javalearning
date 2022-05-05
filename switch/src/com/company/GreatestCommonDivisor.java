package com.company;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int num1, int num2){
        if (num1 < 10 || num2 < 10) {
            return -1;
        }
        int smallestNumber = Math.min(num1, num2);
        int greatestComDiv = 1;
        int i = 1;
        while (i <= smallestNumber){
            if (num1 % i == 0 &&  num2 % i == 0){
                greatestComDiv = i;
            }
            i++;
        }
        return greatestComDiv;
    }

}
