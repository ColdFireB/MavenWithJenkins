package manipulateStrings;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String firstString = sc.nextLine();
		String secondString = sc.nextLine();

		// String firstString = "Army";
		// String secondString = "mary";

		System.out.println("Check if the firstString and secondString is anagram of each other: "
				+ isAnagram(firstString, secondString));
	}

	public static boolean isAnagram(String firstString, String secondString) {
		char[] firstStringCharArray = firstString.toLowerCase().toCharArray();
		char[] secondStringCharArray = secondString.toLowerCase().toCharArray();
		Arrays.sort(firstStringCharArray);
		Arrays.sort(secondStringCharArray);

		return Arrays.equals(firstStringCharArray, secondStringCharArray);

	}
}
