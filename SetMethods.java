package org.programs;

import java.util.*;

public class SetMethods {
	public static void main(String[] args) {
		callAvengers();
	}

	public static void callAvengers() {
		HashSet<Object> heros = new HashSet<Object>();
		heros.add("Iron Man");
		heros.add("Captain America");
		heros.add("Thor");
		heros.add("Hulk");
		heros.add("Natasha");
		heros.add("Hawkeye");
		System.out.println("heros are : " + heros);
		HashSet<Object> enemies = new HashSet<Object>(); // Hash Set
		enemies.add("Loki");
		enemies.add("Ultron");
		enemies.add("Redskull");
		enemies.add("Hela");
		enemies.add("Taskmaster");
		System.out.println("enemies Are : " + enemies);
		System.out.println("Ultron is a leader");
		boolean killUltran = heros.contains("Ironman");
		System.out.println("");
		if (killUltran = true) {
			enemies.remove("Ultron");
			System.out.println("Ironman killed Ultron");
		}
		System.out.println("");
		System.out.println("enemies Now : " + enemies);
		heros.add("Loki");
		System.out.println("\n" + heros);
		boolean x = enemies.retainAll(heros);
		if (x = true) {
			enemies.clear();
		}
		System.out.println("\n enemies Remaining : " + enemies);
		boolean s = enemies.isEmpty();
		System.out.println("");
		if (s = true) {
			System.out.println("Howmany Attackers Need");
			Scanner e = new Scanner(System.in);
			int q = e.nextInt();
			for (int i = 0; i <= q; i++) {
				enemies.add("fly attackers_" + i); // prints Randomly because of set is RIA order
			}
			System.out.println(enemies);

		}
		Scanner l = new Scanner(System.in);
		System.out.println("Press 1 to kill them All");
		int j = l.nextInt();
		if (j == 1) {
			enemies.clear();
		}
		System.out.println("\n enemies Now" + enemies);
		HashSet<Object> Remaining = new HashSet<Object>();
		System.out.println("\n Remaining is :" + Remaining);
		boolean r = enemies.equals(Remaining);
		if (r = true) {
			System.out.println("\n War End......~~Avengers Won~~");
			Remaining.add(null);
			Remaining.add(null);
			System.out.println("\n Enemies Remaining is : " + Remaining);
		}

	}
}
