package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        double double1 = 20.00;
        double double2 = 80.00;

        double theBiggerNumber = (double2 + double1) * 100.00;

        double remainder = theBiggerNumber % 40.00;

        System.out.println("Remainder " + remainder);

        boolean isItZero = (remainder == 0) ? true:false;

        System.out.println("isItZero: " + isItZero);

        if (!isItZero) {
            System.out.println("Got some remainder");
        }

    }
}
