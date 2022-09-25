package mathPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class PrintMixedOfPositiveNegative {
	static Scanner scan = new Scanner(System.in);

	public static int[] generateAbsArray(int b[]) {
		int c[] = new int[b.length];
		for (int i = 0; i < b.length; i++) {
			c[i] = Math.abs(b[i]);
		}
		return c;
	}

	public static void mixedSigns(int one[], int two[]) {
		int three[] = new int[one.length + two.length];
		int j = 0;
		System.out.println("Length of new array:   " + three.length);
		for (int i = 0; i < three.length; i++) {
			if (i % 2 == 0) {
				three[i] = one[j];

			} else {
				j--;
				three[i] = two[j];
			}
			j++;
		}
		System.out.println(Arrays.toString(three));
	}

	public static int[] getTheArrayValuesfromConsole() {
		System.out.println("Enter the lenth of array:   ");
		int length = scan.nextInt();
		System.out.println("Enter the Elements of array to be included:  ");

		int newArray[] = new int[length];
		for (int i = 0; i < length; i++) {
			newArray[i] = scan.nextInt();
		}

		System.out.println("Array Elements are :" + Arrays.toString(newArray));
		return newArray;
	}

	public static void main(String[] args) {

		int a[] = getTheArrayValuesfromConsole();
		mixedSigns(a, generateAbsArray(a));

	}
}