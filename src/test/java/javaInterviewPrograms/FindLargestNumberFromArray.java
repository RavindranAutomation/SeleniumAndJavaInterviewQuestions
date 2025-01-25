package javaInterviewPrograms;

import java.util.Arrays;

public class FindLargestNumberFromArray {

	public static void main(String[] args) {
		int [] givenArray= {8,2,3,1,5,79};

		int large = givenArray[0];

		for(int i=0;i<givenArray.length;i++) {
			if(givenArray[i]>large) {
				large=givenArray[i];
			}
		}
		System.out.println(large);
	}

}
