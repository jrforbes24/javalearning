package com.company;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        int tempNumber = 0;
        if (number < 1) {
            return false;
        } else {

            int i = 1;
            while (i < number){
                if(number % i == 0){
                    tempNumber += i;
                }
                i++;
            }
            return tempNumber == number;
        }
    }
}
