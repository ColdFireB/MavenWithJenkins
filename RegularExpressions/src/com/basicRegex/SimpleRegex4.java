package com.basicRegex;

import java.util.regex.Pattern;

public class SimpleRegex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[^a-zA-Z0-9]{6}", "$%^&*_"));// true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));// false (more than 6 char)
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));// true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));// false ($ is not matched)

		System.out.println("by character classes and quantifiers ...");
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));// true
		System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));// true

		System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));// false (11 characters)
		System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));// false (starts from 6)
		System.out.println(Pattern.matches("[789][0-9]{9}", "8653038949"));// true

		System.out.println("by metacharacters ...");
		System.out.println(Pattern.matches("[789]{3}\\D{9}", "887ghtdsjhuf"));// true
		System.out.println(Pattern.matches("[789]{5}\\D{9}", "79988rtyghtght"));// false (starts from 3)
	}

}
