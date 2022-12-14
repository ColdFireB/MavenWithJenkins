package com.basicPrograms;

import java.util.Scanner;

public class Numbers_Magic {

	public static void reverseNumber() {
		System.out.println("Enter a number you want to reverse:   ");
		Scanner s = new Scanner(System.in);
		int no = s.nextInt();
		int r;
		int rev = 0;

		while (no > 0) {
			r = no % 10;
			rev = rev * 10 + r;
			no = no / 10;
		}
		System.out.println("Reverse of the number is:   " + rev);
	}

	public static void findPrimeNumber() {
		System.out.println("Enter the number u want to check whether prime or not");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int i;

		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				// if (num != i) {
				System.out.println(num + "  Is not a Prime number");
				break;
				// }
			}
		}
		if (num == i) {

			System.out.println(num + "is a prime number");

		}
	}

	public static void fibonacci() {
		int a = 0;
		int b = 1;
		int c;

		Scanner s = new Scanner(System.in);
		int count = s.nextInt();

		System.out.println("Fibonacci series are: ");
		System.out.print(a + "," + b);

		for (int i = 1; i <= count; i++) {
			c = a + b;
			a = b;
			b = c;

			System.out.print("," + c);
		}
	}

	public static void armStrong() {
		System.out.println("Enter the number you want to check whether armstrong number or not");
		Scanner s = new Scanner(System.in);
		int no = s.nextInt();
		int arm = 0;
		int original = no;
		int r;

		while (no > 0) {
			r = no % 10;
			no = no / 10;
			arm = arm + r * r * r;
		}

		if (arm == original) {
			System.out.println("is Armstrong number");
		} else {

			System.out.println("not an armstrong number" + arm + no);
		}
	}

	public static void polyndrome() {
		System.out.println("Enter the number you want to find whether polyndrome or not");

		Scanner s = new Scanner(System.in);
		int no = s.nextInt();
		int don = no;
		int temp = 0;
		int r;

		while (no > 0) {
			r = no % 10;
			no = no / 10;
			temp = temp * 10 + r;
		}

		System.out.println("reverese number is" + temp);

		if (temp == don) {
			System.out.println("Entered number is polyndrome");
		} else {
			System.out.println("Entered number is not polyndrome");
		}

	}

	public static void sumOfDigits() {
		System.out.println("Enter the number: ");

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int a;
		int sum = 0;

		while (num > 0) {
			a = num % 10;
			num = num / 10;
			sum = sum + a;
		}

		System.out.println("Sum of digits are:  " + sum);
	}

	public static void countNumberOfDigits() {
		System.out.println("Enter the number u want to count the digit");
		Scanner s = new Scanner(System.in);
		long num = s.nextLong();

		int count = 0;

		if (num < 0) {
			System.out.println("Its negative number, so converting it into poitive number");
			num = Math.abs(num);
		}

		if (num == 0) {
			count++;
		}

		while (num > 0) {
			num = num / 10;
			count++;
		}

		System.out.println("The number of digits are: " + count);
	}

	public static void main(String[] args) {

		// reverseNumber();
		// findPrimeNumber();
		// armStrong();
		// fibonacci();
		// polyndrome();
		// sumOfDigits();
		countNumberOfDigits();
	}

}
