package manipulateStrings;

public class CountCharacterUsingContinue {

	public static void main(String[] args) {

		String inputSttring = "Gaurav Kukade";
		int count = 0;

		for (int i = 0; i < inputSttring.length(); i++) {

			if (inputSttring.charAt(i) != 'a') {
				continue;
			}

			count++;
		}

		System.out.println("We found 'a' in the inputString '" + inputSttring + "', " + count + " times.");
	}

}