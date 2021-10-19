package org.programs;

import java.util.Scanner;

public class SumAndCount {
	public static void main(String[] args) {
		sumOfTwoNum();
		sumOfGivenNum();
		countOfGivenNum();
	}
	private static void sumOfTwoNum() {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter First Num");
		int a = x.nextInt();
		System.out.println("Enter second num");
		int b = x.nextInt();
		int c = a+b;
		System.out.println(c);

	}
	private static void sumOfGivenNum() {
		int a,i,j=0, num = 12345;
		a = num;
		while(a>0) {
			i= a % 10;
			j= j+i;
			a= a/10;
		}
		System.out.println("sum of given numbers = "+j);
	}
	private static void countOfGivenNum() {
		int a,c=0, num=12345;
		a=num;
		while(a>0) {
			a = a/10;
			c++;
		}
		System.out.println("count of given number ="+c);

	}
	

}
