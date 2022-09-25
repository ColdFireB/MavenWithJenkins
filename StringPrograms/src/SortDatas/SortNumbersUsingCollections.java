package SortDatas;

import java.util.ArrayList;
import java.util.Collections;

public class SortNumbersUsingCollections {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(33);
		arr.add(34);
		arr.add(36);
		arr.add(38);
		arr.add(39);
		arr.add(77);
		arr.add(11);
		arr.add(9);

		Collections.sort(arr);

		System.out.println(arr);

		Collections.sort(arr, Collections.reverseOrder());

		System.out.println(arr);
	}

}
