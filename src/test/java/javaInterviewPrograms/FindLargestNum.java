package javaInterviewPrograms;

import java.util.Iterator;

public class FindLargestNum {

	public static void main(String[] args) {

		int[] given = { 1, 52, 6, 4, 18, 8 };
		int largest = given[0];

		for (int i = 0; i < given.length; i++) {

			if (given[i] < largest) {
				largest = given[i];
			}

		}
		System.out.println(largest);

	}

}
