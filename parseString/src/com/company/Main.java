package com.company;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018.125";
        System.out.println("numberAsString = " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;
        System.out.println(numberAsString);
        System.out.println(number);

        int newNumber = 5678;
        String newString = String.valueOf(newNumber);
        System.out.println("Really new string: " + newString + 159);

    }
}
