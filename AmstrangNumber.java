package org.programs;
import java.util.Scanner;

public class AmstrangNumber {

	public static void main(String[] args) {
		checkNumberIsAmstrang();
		countAndPrintAmstrang0to1000();
	

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
			System.out.println("Amstrang Number");
		}
		else {
			System.out.println("Not amstrang number");
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

}
