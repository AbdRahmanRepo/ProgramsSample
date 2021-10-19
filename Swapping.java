package org.programs;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		swappingWithThirdVariable();
		swappingWithoutThirdVariable();
	}
	private static void swappingWithThirdVariable() {
		Scanner z = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = z.nextInt();
		System.out.println("Enter 2nd number");
		int b = z.nextInt();
		System.out.println("Before Swapping");
		System.out.println(a);
		System.out.println(b);
		System.out.println("after Swapping");
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);

	}
	private static void swappingWithoutThirdVariable() {
		Scanner z = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int d = z.nextInt();
		System.out.println("Enter 2nd number");
		int e = z.nextInt();
		d = d+e;
		e = d-e;
		d = d-e;
		System.out.println("after Swapping");
		System.out.println(d);
		System.out.println(e);
		
		
		

	}

}
