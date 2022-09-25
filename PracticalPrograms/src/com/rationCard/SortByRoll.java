package com.rationCard;

import java.util.Comparator;

class SortByRoll implements Comparator<RationCard> {
	public int compare(RationCard a, RationCard b) {
		return a.rollnum - b.rollnum;
	}
}