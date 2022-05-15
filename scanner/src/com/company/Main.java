package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handle next line character.

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        scanner.close();

        System.out.println("Welcome: Big Bad " + name);
        System.out.println( yearOfBirth < 1980 ? "You are very experienced." : "Welcome aboard.");
    }
}
