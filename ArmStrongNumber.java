package org.programs;
import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
//		checkNumberIsAmstrang();
//		countAndPrintAmstrang0to1000();
//		armstrongFourDigit();
		myPractice();
	}
	public static void checkNumberIsAmstrang() {
		int n,a, i=0, j=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		n = input.nextInt();
		a=n;
		while(a>0) {
			i= a % 10;
			j = j+(i*i*i);
			a= a/10;
		}
		if(n==j) {
			System.out.println("ArmStrong Number");
		}
		else {
			System.out.println("Not a ArmStrong Number");
		}
		
		
	}
	public static void countAndPrintAmstrang0to1000() {
		int c=0;
		for(int n=1; n<1000; n++) {
			int a, i, j=0;
			a=n;
			while(a>0) {
				i= a % 10;
				j = j+(i*i*i);
				a= a/10;
			}
				if(j==n) {
					System.out.println("Amstrang Number is ="+j);
					c++;
				}
		}
		System.out.println("count of Amstrang number is ="+ c);
	}

	public static void armstrongFourDigit(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		int originalNumber = number;
		int result = 0;
		int digits = String.valueOf(number).length(); // Get the number of digits

		while (number != 0) {
			int digit = number % 10;
			result += Math.pow(digit, digits);
			number /= 10;
		}

		if (result == originalNumber) {
			System.out.println(originalNumber + " is an Armstrong number.");
		} else {
			System.out.println(originalNumber + " is not an Armstrong number.");
		}
	}

	public static void myPractice() {
		Scanner scan = new Scanner(System.in);
	}

}
