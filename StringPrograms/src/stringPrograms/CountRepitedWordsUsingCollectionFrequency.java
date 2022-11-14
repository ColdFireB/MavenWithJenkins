package stringPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CountRepitedWordsUsingCollectionFrequency {

	
	public static void printNumberOfWords(String[] arr) {
		System.out.println(arr.length);
	}
	
	public static void countFrequency(String[] arr) {
		List<String> list = new ArrayList<>();
		List<Character> list1 = new ArrayList<>();
		HashMap<String, Integer> hp = new HashMap<>();
		
		int freqCount;
		
		for(String s: arr) {
			list.add(s);
		}
		
		System.out.println(list);
		
		System.out.println(list.size());
		
		for(int i=0; i<list.size();i++) {
			freqCount = Collections.frequency(list, list.get(i));
			System.out.println("Count of word: " + list.get(i) +  "----" + freqCount);
			hp.put(list.get(i), freqCount);
		}
		
		
		for(String key: hp.keySet()) {
			System.out.println(key  + "---" + hp.get(key));
		}
	}
	
	public static void main(String[] args) {
		
		String sentence = "This is a   program program program to find number number of words number in a String program";
		
		String[] arr = sentence.split("\\s+");
		
		String newsentence = sentence.replaceAll(" ", "");
		
		System.out.println(newsentence);
		System.out.println("Sentence length without space:   "  + newsentence.length());
		System.out.println("Sentence length with space:    "  + sentence.length());
		
		System.out.println("Total Number of words:   " );
		printNumberOfWords(arr);
		
		//System.out.println("Number of white spaces:  " );
		
		System.out.println("Total space length:     "  + (sentence.length() - newsentence.length()));
		
		countFrequency(arr);
	}
}
