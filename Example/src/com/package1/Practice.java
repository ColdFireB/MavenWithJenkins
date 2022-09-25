package com.package1;

public class Practice {

	public static void main(String args[]) {
		String str = "Welcome";
		char[] ch = { 'W', 'e', 'l', 'c', 'o', 'm', 'e' };
		String s = new String(ch);

		// print length of the string
		System.out.println(str.length());

		// print the character based on index in string
		System.out.println(s.charAt(4));
		System.out.println(str.charAt(6));

		// print the character from char array
		System.out.println(ch[6]);

		// Format the string
		String s1 = String.format("%x", 100);
		System.out.println(s1);
	}
}
