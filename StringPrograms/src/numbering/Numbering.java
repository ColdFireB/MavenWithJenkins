package numbering;

import java.util.Scanner;

public class Numbering {

	// Scanner s = new Scanner(System.in);
	// int n = s.nextInt();

	public void printNumbers(int number) {
		int n1 = number;

		int num = 0;
		for (int i = ((n1 * n1) + n1 - 1); i >= 1;) {
			System.out.print(i);
			System.out.print(" ");
			i -= 2;
			num++;
			if (num == n1) {
				System.out.println();
				n1 = n1 - 1;
				num = 0;
			}
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int req = s.nextInt();
		Numbering s1 = new Numbering();
		s1.printNumbers(req);
	}

}
