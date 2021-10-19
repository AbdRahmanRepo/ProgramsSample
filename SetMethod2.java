package org.programs;

import java.util.*;

public class SetMethod2 {
	public static void main(String[] args) {
		LinkedHashSet<Integer> primeNum = new LinkedHashSet<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Prime Number");
		int m = s.nextInt();
		int c = 0;
		for (int n = 1; n < m; n++) {
			int count = 0;
			for (int i = 2; i < n / 2; i++) {
				if (n % i == 0) {
					count = 1;
				}
			}
			if (count == 0) {
				primeNum.add(n);
				c++;
			}
		}
		System.out.println(primeNum);
		int PrimeSize = primeNum.size();
		System.out.println("\n Size of prime : " + PrimeSize);

		LinkedHashSet<Integer> fibNum = new LinkedHashSet<Integer>();
		System.out.println("Enter Number 1");
		int a = s.nextInt();
		System.out.println("Enter Number 2");
		int b = s.nextInt();
		for (int i = 0; i < 10; i++) {
			c = a + b;
			fibNum.add(c);
			a = b;
			b = c;
		}
		System.out.println(fibNum);
		int FiboNum = fibNum.size();
		System.out.println("\n Size of prime : " + FiboNum);
		boolean d = primeNum.retainAll(fibNum);
		System.out.println("\n" + d);
		boolean h = primeNum.retainAll(fibNum);
		System.out.println("\n" + h);
		primeNum.clear();
		boolean NowPrime = primeNum.isEmpty();
		System.out.println("\n" + NowPrime);

	}
}