package javaInterviewPrograms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] given = { 1, 2, 4, 3 };

		int length = given.length;
		int temp = 0;

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length-1; j++) {
				if (given[j] > given[j + 1]) {

					temp = given[j];
					given[j] = given[j + 1];
					given[j + 1] = temp;

				}
			}
		}

		System.out.println("After sorting : " + Arrays.toString(given));
//		System.out.println(given[given.length - 3]);
	}

}
