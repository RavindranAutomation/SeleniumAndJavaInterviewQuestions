package interviewPractice;

public class FindMinimumvalueInArray {

	public static void main(String[] args) {

		int[] given = { 1, 2, 3, 0, 2, 3 };

		int smallest = given[0];

		for (int i = 0; i < given.length; i++) {
			if (given[i] < smallest) {
				smallest = given[i];
			}
		}

		System.out.println("Smallest number is :" + smallest);
	}

}
