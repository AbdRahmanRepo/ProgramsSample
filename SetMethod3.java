package org.programs;

import java.util.*;

public class SetMethod3 {

	public static void main(String[] args) {
		Set_TreeSet();
	}

	public static void Set_TreeSet() {
		TreeSet<String> attendence = new TreeSet<String>();

		String[] a = { "Ahalya", "Fathima Beevi", "Dhinesh", "Eeshwar", "Balaji", "George", "Abdul Rahman", "Hari",
				"Ismail" };
//		attendence.add(a[1]);
		for (int i = 0; i <= a.length - 1; i++) {
			attendence.add(a[i]);
		}
		System.out.println(attendence); // Ascending order
		SortedSet sort = new TreeSet(Comparator.reverseOrder());
		sort.addAll(attendence);
		System.out.println(sort);

	}
}
