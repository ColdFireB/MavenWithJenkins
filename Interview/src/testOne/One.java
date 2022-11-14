package testOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class One {

	public static void main(String args[]) {
		String str = "Today is a Good Day";
		
		System.out.println("Input String is: " + str);

		String rep = str.replace(" ", "");

		//TodayisaGoodDay
		List<Character> uniq = new ArrayList<>();
		List<Character> charList = new ArrayList<>();

		for (char c : rep.toCharArray()) {
			charList.add(c);
		}

		System.out.println(charList);

		Iterator<Character> it = charList.iterator();

		while (it.hasNext()) {
			Character c = it.next();
			if (Collections.frequency(charList, c) == 1) {
				uniq.add(c);
			}
		}
		System.out.println(uniq);				
	}
}
