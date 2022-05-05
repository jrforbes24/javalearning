package com.company;

public class FactorPrinter {
    public static void printFactors(int num) {
        if (num < 1){
            System.out.println("Invalid Value");
        }
        int i = 1;
        int factorCheck = 0;
        while (i <= num) {
            factorCheck = num % i;
            if (factorCheck == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

}
