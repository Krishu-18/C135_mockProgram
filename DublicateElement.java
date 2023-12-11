package mockinterviewquestion;

import java.util.HashSet;
import java.util.Set;

public class DublicateElement {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 4, 9, 2, 7, 8, 9 };
		Set<Integer> set = new HashSet<>();

		System.out.print("Duplicate elements in the array: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && !set.contains(arr[i])) {
					set.add(arr[i]);
					System.out.print(arr[i] + " ");
				}
			}

		}
	}
}