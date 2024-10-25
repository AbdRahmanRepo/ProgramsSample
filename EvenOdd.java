package org.programs;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		evenNum();
		oddNum();
		
	}
	public static void evenNum() {
		int sum=0, count=0;
		for(int i=0; i<30; i++) {
			if(i%2==0) {
				System.out.print(i+", ");
				sum=sum+i;
				count=count+1;
			}
		}
		System.out.println("\nsum of the even number from 0 to 30 = "+ sum);
		System.out.println("count of even number from 0 to 30 ="+ count);
	}
	public static void oddNum() {
		int sum=0, count=0;
		for(int i=0; i<30; i++) {
			if(i%2==1) {
				System.out.print(i+", ");
				sum=sum+i;
				count=count+1;
			}
		}
		System.out.println("\nsum of the odd number from 0 to 30 = "+ sum);
		System.out.println("count of odd number from 0 to 30 ="+ count);
	}

}
