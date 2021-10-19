package org.programs;

public class PrimeNumbers {

	public static void main(String[] args) {
		int c=0;
		System.out.println("Prime Numbers");
		for(int n=1; n<10; n++) {
			int count = 0;
			for(int i=2; i< n/2; i++) {
				if(n%i==0) {
					count = 1;
				}
			}
			if(count==0) {
				System.out.print(n+", ");
				c++;
				}	
		}
		System.out.println("\ncount of prime numbers ="+ c);

	}

}
