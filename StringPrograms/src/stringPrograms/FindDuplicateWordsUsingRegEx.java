package stringPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateWordsUsingRegEx {

	public static void main(String[] args) {

		String exp = "Hello Hello Hello I am Bala Bala Bala from SQA and I am a programmer too Hello Hello";
		int count = 0;
		String[] reg = exp.split("\\W");

		System.out.println(Arrays.toString(reg));

		Set<String> uniq = new HashSet<>();

		HashMap<String, Integer> mp = new HashMap<>();

		for (int i = 0; i < reg.length; i++) {
			count = 0;
			for (int j = 0; j < reg.length; j++) {
				if (reg[i].equals(reg[j])) {
					count++;
					mp.put(reg[i], count);
				}
			}
		}

		System.out.println(mp);

	}

}
