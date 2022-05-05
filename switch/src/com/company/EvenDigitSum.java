package com.company;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if(number < 0) {
            return -1;
        } else {
            int totalOfEven = 0;
            while (number != 0){
                int tempNumber = 0;
                tempNumber = number % 10;
                if(tempNumber % 2 == 0){
                    totalOfEven += tempNumber;
                }
                number = number / 10;
            }
            return totalOfEven;
        }

    }

}
