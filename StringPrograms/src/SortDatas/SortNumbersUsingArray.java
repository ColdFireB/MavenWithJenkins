package SortDatas;

public class SortNumbersUsingArray {

	public static void main(String[] args) {

		int arr[] = { 24, 36, 89, 47, 33, 11 };
		int temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Array in ascending order:   ");
		for (int a : arr) {
			System.out.println(a);
		}

		System.out.println("Array in descending order:   ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
}
