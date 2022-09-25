package manipulateStrings;

import java.util.Arrays;

public class CountWordsUsingSplit {

	public static int countWordsUsingSplit(String inputString) {

		String[] stringArray = inputString.split("\\s+"); // splitting the string using space/spaces

		String[] stringArr = inputString.split(" ");

		return stringArray.length; // returning the length of the array i.e number of words in the string
	}

	public static void main(String[] args) {

		String s1 = "you ! want! to? count words in a string, pls go ahead";

		System.out.println("Number of words in a given string:  " + countWordsUsingSplit(s1));

		String[] stringArray = s1.split("\\s+"); // splitting the string using space/spaces

		String[] stringArr = s1.split(" ");

		System.out.println(Arrays.toString(stringArray));
		System.out.println(Arrays.toString(stringArr));

		if (Arrays.equals(stringArr, stringArray)) {
			System.out.println("Both are equal");
		}

	}
}
