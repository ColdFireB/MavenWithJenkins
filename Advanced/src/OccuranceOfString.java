import java.util.regex.*;

public class OccuranceOfString {

	// Method that returns the count of the given
	// character in the string
	public static long count(String s, String sh) {

		// Use Matcher class of java.util.regex
		// to match the character
		Pattern pat = Pattern.compile(sh);
		Matcher m = pat.matcher(s);

		int res = 0;

		// for every presence of character ch
		// increment the counter res by 1
		while (m.find()) {
			res++;
		}

		return res;
	}

	// Driver method
	public static void main(String args[]) {
		String str = "this is testing of occurances in testing of matcher";
		String sh = "is";
		System.out.println("The occurrence of " + sh + " in " + str + " is " + count(str, sh));
	}
}