package manipulateStrings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ManipulateString {

	// 1. Using the Arrays.toString() method
	public static String convertArrayToStringUsingToString(String[] stringArray) {
		return Arrays.toString(stringArray);
	}

	// 2. Using the StringBuilder.append() method
	public static String convertArrayToStringUsingAppend(String[] stringArray) {

		StringBuilder s = new StringBuilder();

		for (String n : stringArray) {
			s.append(n);
		}
		return s.toString();
	}

	// 3. Using the String.join() method
	public static String convertArrayToStringUsingJoin(String[] stringArray) {
		String newString = String.join(" ", stringArray);
		return newString;
	}

	// 4. Using the Collectors.joining() method
	public static String convertArrayToStringUsingJoining(String[] stringArray) {
		String str = Arrays.stream(stringArray).collect(Collectors.joining());
		return str;
	}

	public static void main(String[] args) {

		String[] arrString = { "This", "is", "a", "test", "program", "for", "manipulating" };

		String first = convertArrayToStringUsingToString(arrString);
		System.out.println("Convert array to string using Arrays toString: " + first);

		String second = convertArrayToStringUsingAppend(arrString);
		System.out.println("Convert array to string using StringBuilder append:  " + second);

		String third = convertArrayToStringUsingJoin(arrString);
		System.out.println("Convert array to string using string join method:  " + third);

		String fourth = convertArrayToStringUsingJoining(arrString);
		System.out.println("Convert array to string using joining:  " + fourth);
	}

}
