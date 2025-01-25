package javaInterviewPrograms;

public class FindSmallestNumberFromArray {

	public static void main(String[] args) {
		int [] givenArray= {10,20,30,40,50,60,70,80,4,5,7};

		int smallest=Integer.MAX_VALUE;

		for (int i = 0; i < givenArray.length; i++) {

			if (givenArray[i]<smallest) {

				smallest=givenArray[i];
			}

		}
		System.out.println("Smallest number  is : " + smallest);
	}

}
