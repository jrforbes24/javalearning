package com.company;

public class NumberToWords {

    public static void numberToWords(int number){
        int originalDigitCount = getDigitCount(number);
        int reversedNumber = reverse(number);
        int reverseDigitCount = getDigitCount(reversedNumber);

        if (reverseDigitCount == -1) {
            System.out.println("Invalid Value");
        } else {

            do {
                int num2Print = reversedNumber % 10;
                switch (num2Print) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reversedNumber = reversedNumber / 10;
            } while (reversedNumber > 0);
            if (originalDigitCount > reverseDigitCount) {
                int zeros2Print = originalDigitCount - reverseDigitCount;
                for (int i = 0; i < zeros2Print; i++) {
                    System.out.println("Zero");
                }
            }
        }
    }

    public static int reverse(int number){
        int reverse = 0;
        boolean isNegative = false;

//        if the number is negative set a flag for after the while loop to make it negative, and get abs value of number
        if (number < 0){
            isNegative = true;
            number = Math.abs(number);
        }
        while (number > 0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
//        if isNegative is true then we make the reverse value true. So we can compare.
        if (isNegative){
            reverse *= -1;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        if(number < 0) {
            return -1;
        }
        int i = 0;
        do {
            number = number / 10;
            i++;
        }while(number > 0);
        return i;
    }

}
