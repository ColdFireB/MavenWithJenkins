package com.basicPrograms;

import java.util.Scanner;

public class FactorialPrograms {

	public static void main(String[] args) {

		int num, fact;
		fact = 1;

		Scanner s = new Scanner(System.in);
		num = s.nextInt();

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}

		System.out.println("Factorial number of " + "\"" + "num" + "------" + fact);

	}

}
