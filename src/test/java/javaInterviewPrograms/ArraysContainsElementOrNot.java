package javaInterviewPrograms;

public class ArraysContainsElementOrNot {

	public static void main(String[] args) {
		int [] givenArray= {1,2,3,4,5,6,7,8,9};
		int numberToFind =0;
		
		boolean found = false;

		for(int i=0;i<givenArray.length;i++) {

			if (numberToFind==givenArray[i]) {
				
				found=true;
				break;

			}
			
		}
		
		if (found) {
			System.out.println("Element is found");
			
		}else {
			System.out.println("Element is not found");
		}

	}

}
