package alphabetPattern;

public class AlphPattern {

	public void printAlphabets() {
		char ch;

		for (ch = 'a'; ch <= 'z'; ch++)
			System.out.println(ch);
	}

	public void alph_pattern1() {
		for (int i = 1; i < 5; i++) {
			int alphabet = 65; // ASCII value of A
			for (int j = 1; j <= i; j++) {
				System.out.print((char) alphabet);
				alphabet++;
			}
			System.out.println();
		}
	}

	public void alph_pattern2() {
		int alphabet = 65; // ASCII value of A
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) alphabet);
				alphabet++;
			}
			System.out.println();
		}
	}

	public void alph_pattern3() {
		int alphabet = 65;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) alphabet);
			}
			System.out.println();
			alphabet++;
		}
	}

	public void alph_pattern4() {
		for (int i = 1; i < 10; i++) // increase count 10 to 27 to print till "z"
		{
			String strChars = "";
			int alphabet = 97; // ASCII value of A = 65 and a=97
			for (int j = 1; j <= i; j++) {
				strChars = strChars + (char) alphabet + " + ";
				alphabet++;
			}
			System.out.println("(" + strChars.substring(0, strChars.length() - 3) + ")");
		}
	}
}
