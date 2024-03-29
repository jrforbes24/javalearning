package com.company;

public class DiagonalStar {
    public static void  printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");

        } else {
            for (int row = 1; row <= number; row++) {
                // printing the first row and last row of stars
                if (row == 1 || row == number) {
                    int star = 1;
                    while (star <= number) {
                        System.out.print("*");
                        star++;
                    }
                    System.out.println("");
                    continue;
                } else {
                    for (int column = 1; column <= number; column++) {
                        if (column == 1 || column == number || row == column || column == number - row + 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }

                    }
                }
                System.out.println("");
            }

        }
    }
}
