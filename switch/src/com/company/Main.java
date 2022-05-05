package com.company;

public class Main {

    public static void main(String[] args) {
        /*for (double interest = 8.0; interest > 1.0; interest--){
            System.out.println("10,000 at "+ interest +"% interest = " + String.format("%.2f", calculateInterest(10000.0, interest)));
        }

        System.out.println("--------------------");

        for (double interest = 2.0; interest < 9.0; interest++){
            System.out.println("10,000 at "+ interest +"% interest = " + String.format("%.2f", calculateInterest(10000.0, interest)));
        }*/
        /*int primeNumberCount = 0;

        for(int n=500; n<=1000; n++){
            if(TestForPrime.isPrime(n)){
                System.out.println("Found a prime: " + n);
                primeNumberCount++;
            }
            if(primeNumberCount >= 10){
                System.out.println("Exiting the for loop.");
                break;
            }
        }*/
        /*int sum = 0;
        int count = 0;

        for (int i = 1; i <= 1000; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("Found a number divisible by 3 and 5: " + i);
                sum += i;
                count++;
            }
            if (count == 100){
                break;
            }
        }
        System.out.println("The total of the five numbers is: " + sum);*/
        /*System.out.println(SumOddRange.sumOdd(1, 100));
        System.out.println(SumOddRange.sumOdd(-1, 100));
        System.out.println(SumOddRange.sumOdd(100, 100));
        System.out.println(SumOddRange.sumOdd(13, 13));
        System.out.println(SumOddRange.sumOdd(100, -100));*/
        /*
        System.out.println(SumOddRange.sumOdd(100, 1000));*/
        /*System.out.println( EvenDigitSum.getEvenDigitSum(123456789));
        System.out.println( EvenDigitSum.getEvenDigitSum(252));
        System.out.println( EvenDigitSum.getEvenDigitSum(-22));*/
        /*System.out.println( SharedDigit.hasSharedDigit(12,13));
        System.out.println( SharedDigit.hasSharedDigit(9,99));
        System.out.println( SharedDigit.hasSharedDigit(15,55));*/
        /*System.out.println(LastDigitChecker.hasSameLastDigit(41, 22, 71));
        System.out.println(LastDigitChecker.hasSameLastDigit(23, 32, 42));
        System.out.println(LastDigitChecker.hasSameLastDigit(9, 99, 999));

        System.out.println(LastDigitChecker.isValid(10));
        System.out.println(LastDigitChecker.isValid(468));
        System.out.println(LastDigitChecker.isValid(1051));*/
        /*FactorPrinter.printFactors(6);
        FactorPrinter.printFactors(32);
        FactorPrinter.printFactors(10);
        FactorPrinter.printFactors(-1);*/

        /*NumberToWords.numberToWords(0);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(1000);
        NumberToWords.numberToWords(-12);*/

        }

    public static double calculateInterest(double amount, double interestRate) {
            return (amount *(interestRate/100));
        }
    }



