import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		String s1 = "i was attending attending java selenium selenium interview";
		String s = "i was attending attending java selenium selenium interview";
		// String output = "I was attending java selenium Interview";

		
		String words[] = s.split(" ");

		LinkedHashSet<String> ls = new LinkedHashSet<>();
		String uni = null;
		for(String a: words) {
			ls.add(a);
		}
		System.out.println(ls);
		System.out.println(uni + ls);

		
		
/*		int len = words.length;
		int count = 0;
		List<Integer> ind = new ArrayList<>();
		String st = null;

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "0";
					ind.add(j);
				}
			}
			if (count > 1 && words[i] != "0") {
				System.out.println(Arrays.toString(words));
				System.out.println("Duplicate words at indexes: " + ind);
				String d = Arrays.toString(words);
				System.out.println(d);
			}
		}*/
	}
}
