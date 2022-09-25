package com.rationCard;

public class RationCard {

	int rollnum, age;
	String name, address;

	public RationCard(int rollnum, String name, String address, int age) {
		this.rollnum = rollnum;
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public String toString() {
		return this.rollnum + " " + this.name + " " + this.address + " " + this.age;
	}
}