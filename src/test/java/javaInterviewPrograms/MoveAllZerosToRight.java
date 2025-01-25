package javaInterviewPrograms;

import java.util.Arrays;

public class MoveAllZerosToRight {

	public static void main(String[] args) {

		int [] a = {1,0,2,0,3};
		int newIndex=0;
		
		int [] newArray=new int[a.length];
		for (int number : a) {
			if(number!=0) {
			newArray[newIndex]=number;
			newIndex++;
		}
		}
		System.out.println(Arrays.toString(newArray));
		
	}
}
