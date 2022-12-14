package com.basicPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OddorEven {

	public static void findOddOrEven_GivenNum() {
		System.out.println("Enter a number u want to find out whether odd or even---");

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		if (num % 2 == 0) {
			System.out.println("Its Even number!!!");
		} else {
			System.out.println("Its Odd Number!!!");
		}
	}

	public static void findOddOrEven_BetweenNumbers() {
		System.out.println("Enter the limit upto which the odd or even numbers can be find out");

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		List<Integer> odd = new ArrayList<Integer>();
		List<Integer> even = new ArrayList<Integer>();

		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				even.add(i);
			} else {
				odd.add(i);
			}
		}

		System.out.println("The Odd numbers are :   " + odd);
		System.out.println("The even numbers are:   " + even);

	}

	public static void sumOftheInputNumbers() {
		System.out.println("How many numbers you want to enter : ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum = 0;

		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = s.nextInt();
		}

		System.out.println("The Integer numbers you wanted to add and get the sum:   " + Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		System.out.println("The sum of the given numbers are:   " + sum);

	}

	public static void sumOftheNumberTillBoundary() {
		System.out.println("Enter the limit of numbers: ");
		Scanner s = new Scanner(System.in);
		int limit = s.nextInt();
		int sum = 0;
		for (int i = 1; i <= limit; i++) {
			sum = sum + i;
		}

		System.out.println("Sum of the numbers within the limit entered:->  " + sum);

	}

	public static void main(String[] args) {
		// findOddOrEven_BetweenNumbers();
		// sumOftheInputNumbers();
		// sumOftheNumberTillBoundary();
	}

}
