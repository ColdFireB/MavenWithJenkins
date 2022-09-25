package NumberPatterns;

public class NumPattern1 {

	public void incrementalPattern() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		// ouput
		/*
		 * 1 1 2 1 2 3 1 2 3 4 1 2 3 4 5
		 * 
		 */
	}

	public void printtwobasePatttern() {
		{
			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= i; j++) {
					if (j % 2 == 0) {
						System.out.print(0);
					} else {
						System.out.print(1);
					}
				}
				System.out.println();
			}
		}
		// output
		/*
		 * 1 10 101 1010 10101
		 */
	}

	public void pattern3() {
		for (int i = 1; i <= 6; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		// output
		/*
		 * 1 2 1 3 2 1 4 3 2 1 5 4 3 2 1 6 5 4 3 2 1
		 */
	}

	public void pattern4() {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public void pattern5() {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}

			System.out.println();
		}
	}

	public void pattern6() {
		for (int i = 1; i <= 6; i++) {
			for (int j = 6; j >= i; j--) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}

	public void pattern7() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

		}
	}

	public void pattern8() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >= i; j--) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}

	public void pattern9() {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

		// Printing lower half of the pattern

		for (int i = 6 - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}

	public void pattern10() {
		for (int i = 1; i <= 4; i++) {
			int n = 4;

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
		for (int i = 3; i >= 1; i--) {
			int n = 3;

			for (int j = 0; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
			}

			System.out.println();
		}
	}
}
