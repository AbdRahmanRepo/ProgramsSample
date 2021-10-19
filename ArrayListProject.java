package org.programs;
import java.util.*;
public class ArrayListProject {
	public static void main(String[] args) {
		contacts();
	}
	private static void contacts() {
		List<Object> names = new ArrayList<Object>();
		Scanner s = new Scanner (System.in);
		System.out.println("enter");
		int m = s.nextInt();
		for(int i=1; i<=m; i++) {
			names.add("name"+i);
		}
		System.out.println(names);
	}
}
