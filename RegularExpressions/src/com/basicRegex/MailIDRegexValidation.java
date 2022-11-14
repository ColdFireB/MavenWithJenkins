package com.basicRegex;

import java.util.regex.Pattern;

public class MailIDRegexValidation {
	
	public static void main(String[] args) {
		System.out.println(Pattern.matches("[^0-9]{1}[a-zA-Z0-9]*[@][a-z]*.[com]+", "balae1@yahoo.com"));// true
		System.out.println(Pattern.matches("[\\d]+", "7234678960"));// true
		System.out.println(Pattern.matches("[\\D \\d]+", "bala 1991"));// true
		
		System.out.println(Pattern.matches("[\\d ]+", "72346  78  9 60"));// true
		System.out.println(Pattern.matches("[^\\s]+", "dgd"));// true
		System.out.println(Pattern.matches("[\\w]+", "&^%"));// true
		System.out.println(Pattern.matches("[\\w]{3,10}+", "b"));// true
		System.out.println(Pattern.matches("^(?!.*\\.\\.)", "."));
		
		
	}
	
}
