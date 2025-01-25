package javaInterviewPrograms;

import java.util.Arrays;

public class CompareTwoArrays {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		int [] b = {1,2,3,5};
		
		boolean arraysEquals = Arrays.equals(a, b);
		
		if (arraysEquals==true) {
			System.out.println("Both arrays are equal");
		}else {
			System.out.println("Both arrays are  NOT equal");
		}
	}

}
