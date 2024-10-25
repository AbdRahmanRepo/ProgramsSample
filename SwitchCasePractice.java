package org.programs;

import java.util.*;

public class SwitchCasePractice {

	public static void main(String[] args) {
		names();

	}
	private static void names() {
		List Cname = new LinkedList();
		System.out.println("Enter the numbrs");
		Scanner name = new Scanner(System.in);
		int s = name.nextInt();
		for(int i=1; i<=s; i++) {
			Cname.add("999499423"+i);
		}
		System.out.println(Cname);
		
		System.out.println("Welcome ");
		System.out.print("\n");
		System.out.println("1.Total Contacts");
		System.out.println("2.To Remove ");
		System.out.println("3.Index Of ");
		System.out.println("4.if Exsisting ");
		System.out.println("5.To Remove All contacts ");
		
		int a = name.nextInt();
		switch(a) {
		case 1:
			int u = Cname.size();
			System.out.println("total contacts is = "+u);
			break;
		case 2:
			System.out.println("which one to remove");
			int m = name.nextInt();
			Cname.remove(m);
			System.out.println(Cname);
			break;
		case 3:
			System.out.println("get number by index");
			int o = name.nextInt();
//			System.out.println(Cname.indexOf(o));
			int d = Cname.indexOf(0);
			System.out.println(d);
			break;
		}
	}

}
