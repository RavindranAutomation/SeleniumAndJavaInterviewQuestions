package javaInterviewPrograms;

import java.util.Arrays;

public class MoveAllZerosToRight {

	public static void main(String[] args) {

		int[] given = { 1, 0, 2, 0, 3 };
		int newIndex = 0;

		int[] newArray = new int[given.length];
		for (int number : given) {
			if (number != 0) {
				newArray[newIndex] = number;
				newIndex++;
			}
		}
		System.out.println(Arrays.toString(newArray));

	}
}
