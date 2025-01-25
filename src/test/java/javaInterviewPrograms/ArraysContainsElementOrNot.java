package javaInterviewPrograms;

public class ArraysContainsElementOrNot {

	//	1. Assign one number to find variable 
	//	2. Assign boolean valuse as false
	//	3. Iterate given arrayusing for loop
	//	3. If number given[i] is matching with numberToFind
	//	5. Then assigin the boolean value as true

	public static void main(String[] args) {
		int[] givenArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int numberToFind = 0;

		boolean found = false;

		for (int i = 0; i < givenArray.length; i++) {

			if (numberToFind == givenArray[i]) {

				found = true;
				break;

			}

		}

		if (found) {
			System.out.println("Element is found");

		} else {
			System.out.println("Element is not found");
		}

	}

}
