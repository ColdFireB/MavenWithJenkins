package com.rationCard;

import java.util.Comparator;

class SortByAge implements Comparator<RationCard> {
	public int compare(RationCard a, RationCard b) {
		return a.age - b.age;
	}
}