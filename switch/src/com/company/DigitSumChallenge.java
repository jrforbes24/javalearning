package com.company;

public class DigitSumChallenge {
    public static int sumDigits ( int number ) {
        if ( number < 10 ) {
            return -1;
        } else {
            int digitSum = 0;
            while ( number != 0 ) {
                digitSum += number % 10;
                number = number / 10;
            }
            return digitSum;
        }
    }

}
