package javaInterviewPrograms;

import java.util.Arrays;

public class AsendingOrder {
	public static void main(String[] args) {

		int[] givenArray = { 6, 8, 9, 7, 4, 2, 3, 1 };
		Arrays.sort(givenArray);
		for (int i = 0; i < givenArray.length; i++) {
			System.out.print(givenArray[i]);
		}
		System.out.println();
		for(int j=givenArray.length-1;j>=0;j--) {
			System.out.print(givenArray[j]);
		}
	}

}
