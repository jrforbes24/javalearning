package com.company;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if ((num1<10 || num1>1000) || (num2<10 || num2>1000) || (num3<10 || num3>1000)) {
            return false;
        }
        return ((num1 % 10 == num2 %10) || (num1 % 10 == num3 %10) || (num3 % 10 == num2 %10));
    }

    public static boolean isValid(int num2Test) {
        if (num2Test >= 10 && num2Test <= 1000){
            return true;
        } else {
            return false;
        }

    }

}
