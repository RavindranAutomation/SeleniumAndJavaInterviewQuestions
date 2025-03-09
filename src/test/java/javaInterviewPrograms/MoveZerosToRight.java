package javaInterviewPrograms;

import java.util.Arrays;

public class MoveZerosToRight {

	public static void main(String[] args) {

		int[] given = { 1, 0, 2, 0, 3 };
		int newIndex = given.length - 1;

		int[] newArray = new int[given.length];
		// Fill the array from right to left, moving non-zero elements to the left
		for (int i = given.length - 1; i >= 0; i--) {
			if (given[i] != 0) {
				newArray[newIndex] = given[i];
				newIndex--;
			}
		}

		System.out.println(Arrays.toString(newArray));
	}

}
