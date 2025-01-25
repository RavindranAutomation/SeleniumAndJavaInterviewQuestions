package javaInterviewPrograms;

import java.util.Arrays;

public class DesendingOrder {

	public static void main(String[] args) {
		int [] givenArray = {5,9,8,7,4,1,3,6,5};
		
		Arrays.sort(givenArray);
		
		for(int i=givenArray.length-1;i>=0;i--) {
			System.out.print(givenArray[i]+ " ");
		}

	}

}
