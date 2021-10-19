package org.programs;
import java.util.Scanner;

public class Multiplictaion {
	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("Enter Table to multiple");
		int a = m.nextInt();
		System.out.println("Till which number to multiple");
		int b = m.nextInt();
		int c;
		for(int i=1; i<=b; i++) {
			c=a*i;
			System.out.println(a+"*"+i+"="+c);
		}
		
		
	}
	

}
