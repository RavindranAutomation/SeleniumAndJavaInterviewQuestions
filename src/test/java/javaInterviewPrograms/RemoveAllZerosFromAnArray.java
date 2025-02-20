package javaInterviewPrograms;

public class RemoveAllZerosFromAnArray {

	public static void main(String[] args) {

		int[] given = { 2, 0, 5, 7, 10, 0, 0 };
		int length = given.length;
		for (int i = 0; i < length; i++) {
			if (given[i] != 0) {
				System.out.print(given[i] + ",");
			}
		}

	}
}
