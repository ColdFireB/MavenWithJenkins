package SortDatas;

import java.util.Arrays;

public class SortNumbersUsingArraySort {

	public static void main(String[] args) {
		Integer arr[] = { 69, 78, 21, 36, 11, 77, 00, 02, 870 };

		Arrays.sort(arr);

		for (int a : arr) {
			System.out.println(a);
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

}
