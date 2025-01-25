package javaInterviewPrograms;

import java.util.Arrays;

public class FindTheSecondLargestNumber {

	public static void main(String[] args) {
		int[] given = { 5, 6, 1, 7, 2, 8, 3 };

		Arrays.sort(given);

		System.out.println(given[given.length - 2]);

	}

}
