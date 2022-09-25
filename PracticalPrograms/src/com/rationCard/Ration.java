package com.rationCard;

import java.util.ArrayList;
import java.util.Collections;

class Ration {

	public static void main(String[] args) {

		ArrayList<RationCard> st = new ArrayList<>();

		st.add(new RationCard(113, "Bala", "Tirunelveli", 31));
		st.add(new RationCard(114, "Sudha", "Madurai", 28));
		st.add(new RationCard(115, "Akshita", "Chennai", 2));
		st.add(new RationCard(111, "Arulsamy", "Tirunelveli", 62));
		st.add(new RationCard(112, "Vairamuthu", "Tirunelveli", 52));

		System.out.println("Before sorting");

		for (int i = 0; i < st.size(); i++) {
			System.out.println(st.get(i));

		}
		System.out.println();
		Collections.sort(st, new SortByRoll());

		System.out.println("After sort by roll");

		for (int i = 0; i < st.size(); i++) {
			System.out.println(st.get(i));
			System.out.println(st.get(i).address);

		}
		System.out.println();
		Collections.sort(st, new SortByName());

		System.out.println("After sort by name");

		for (int i = 0; i < st.size(); i++) {
			System.out.println(st.get(i));

		}
		System.out.println();

		Collections.sort(st, new SortByAge());

		System.out.println("After sort by AGE");

		for (int i = 0; i < st.size(); i++) {
			System.out.println(st.get(i));
		}
	}
}