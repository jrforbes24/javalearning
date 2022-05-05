package com.company;

public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber){
        boolean doTheyMatch = false;
        if( (firstNumber < 10 || firstNumber > 99) || (secondNumber < 10 || secondNumber > 99) ){
            return false;
        } else {
            while (firstNumber != 0) {
                int tempNumber = 0;
                tempNumber = firstNumber % 10;
                int tempNumber2 = secondNumber;
                while (tempNumber2 != 0){
                    int compareNumber = 0;
                     compareNumber = tempNumber2 % 10;
                    if( tempNumber == compareNumber) {
                        doTheyMatch = true;
                        break;
                    }
                    tempNumber2 = tempNumber2 / 10;
                }
                if (doTheyMatch){
                    break;
                }
                firstNumber = firstNumber / 10;
            }
            return doTheyMatch;
        }
    }

}
