package com.company;

public class SumOddRange {
    public static boolean isOdd( int number ) {
        if ( number < 1 ) {
            return false;
        } else if ( number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
    public static int sumOdd( int start, int end) {
        if (end < start || end < 1 || start < 1){
            return -1;
        }
        else {
            int sum = 0;
            for(int i = start; i <= end; i++){
                if(isOdd(i)){
                    sum += i;
                }

            }
            return sum;
        }
    }

}
