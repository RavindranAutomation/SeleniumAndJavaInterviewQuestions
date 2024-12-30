package javaInterviewPrograms;

public class FindLargestNumberFromArray {

	public static void main(String[] args) {
		int [] givenArray= {10,20,30,40,50,60,70,80,1,2,3,4,5,7};

		int largest=Integer.MAX_VALUE;

		for (int i = 0; i < givenArray.length; i++) {

			if (givenArray[i]>largest) {

				largest=givenArray[i];
			}

		}
		System.out.println("Smallest number  is : " + largest);

	}

}
