package manipulateStrings;

/*
 * A Java program to remove characters from the String.
 */
public class RemoveCharacters {

	public static void main(String[] args) {

		String specialString = "th?><is is a sp$%^eci(*{}al cha$#@!racter str%%ing%";
		String inputString = "GauravKukade";
		char ch = 'a';
		String result = removeCharacters(inputString, ch); // pass the inputString and char you want to remove

		System.out.println("After removing character '" + ch + "' from the inputString '" + inputString
				+ "' the result will be: \n" + result);
		
		System.out.println("After removing special character:   "   + removeSpecialCharacters(specialString));
	}

	// a method to remove any particular char from the string
	public static String removeCharacters(String str, char ch) {

		String result = str.replace("a", "");
		return result;
	}
	
	public static String removeSpecialCharacters(String str) {
		
		
		return str.replaceAll("[^a-zA-Z0-9$ ]", "");
	}
}