package com.company;

public class Main {

    public static void main(String[] args) {
	// if else code block
        boolean isAlien = true;
//      while isAlien is true the loop continues.
        while (isAlien){

            if (isAlien) {
                System.out.println("I have never met an alien before.\n");
                isAlien = false;
            } else {
                System.out.println("What's your name?");
            }
        }

//        next lesson
        int topScore = 80;
        if (topScore < 100){
            System.out.println("You got the top score!");
        }

        int secondTopScore = 91;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater then second top score and less than 100");
        }
//        next lesson #37
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println(" Either or both of the conditions are true.");
        }
    }
}
