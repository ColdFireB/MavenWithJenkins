package com.rationCard;

import java.util.Comparator;

class SortByName implements Comparator<RationCard> {

	public int compare(RationCard a, RationCard b) {
		// TODO Auto-generated method stub
		return a.name.compareTo(b.name);
	}
}
