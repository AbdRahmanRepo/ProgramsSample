package org.programs;

import java.util.Scanner;

public class PrimeNumbers {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false; // Numbers less than or equal to 1 are not prime
        for (int i = 2; i * i <= number; i++) { // Loop from 2 up to i * i <= number
            if (number % i == 0) return false; // If divisible by any number, it's not prime
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find all prime numbers up to that limit: ");
        int limit = scanner.nextInt();

        System.out.println("Prime numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }


}
