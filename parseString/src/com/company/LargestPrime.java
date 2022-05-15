package com.company;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        /*if (number < 2){
            return -1;
        }
        int biggestPrime = 0;
        for (int i = 1; i <= number; i++) {
            for (int f = 2; f <= number; f++) {
                if(i * f == number) {
                    boolean isPrime = true;
                    for (int j = 2; j <= f/2; j++){
                        if (f % j == 0){
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        biggestPrime = Math.max(f , biggestPrime);
                    }
                }
            }
        }
        if (biggestPrime == 0) {
            return -1;
        } else {
            return biggestPrime;
        }*/
        int counter = 0;
        for(int i = 2; i <= number/2; i++) {
            if (number % i == 0){
                number /= i;
                i--;
            }
        }
        return number <= 1 ? -1 : number;
    }
}
