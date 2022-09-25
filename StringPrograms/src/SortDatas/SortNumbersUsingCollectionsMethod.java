package SortDatas;

import java.util.Arrays;
import java.util.Collections;

public class SortNumbersUsingCollectionsMethod {

	public static void main(String[] args) {

		Integer arr[] = { 34, 34, 56, 76, 32, 90, 45, 66 };

		Arrays.sort(arr);
		System.out.printf("Ascending order: %s %n", Arrays.toString(arr));

		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(String.format("Reversed order: %s", Arrays.toString(arr)));
	}

}