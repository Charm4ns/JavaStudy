package com.lhw.Week5;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Please input an integer");
                String userInput = scanner.nextLine(); // Get user input as a string
                Scanner numberScanner = new Scanner(userInput);
                int number = numberScanner.nextInt(); // Try to parse an integer from the input
                System.out.println(number);
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("invalid input");
            }
        }
        scanner.close();
    }
}
