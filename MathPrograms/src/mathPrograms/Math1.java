package mathPrograms;

import java.util.Scanner;

public class Math1 {

	public static void main(String[] args) {

		System.out.println("Enter two numbers to compare");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();

		System.out.println("Maximum number is" + Math.max(a, b));
		System.out.println("Minimum number is" + Math.min(a, b));

		System.out.println("Enter the number to find Square root:  ");
		int c = s.nextInt();

		System.out.println("Square root of " + c + "is;    " + Math.sqrt(c));

		System.out.println("Enter to find absolute number:  ");
		float d = s.nextFloat();

		System.out.println("Absolute number of : " + d + "is" + Math.abs(d));

		System.out.println("Default math random value:  " + Math.random());

		System.out.println();

	}

}
