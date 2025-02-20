package javaInterviewPrograms;

import java.util.Arrays;
import java.util.TreeSet;

public class DesendingOrder {

	public static void main(String[] args) {
		int [] givenArray = {5,9,8,7,4,1,3,6,5,9};
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < givenArray.length; i++) {
			set.add(givenArray[i]);
		}
		
		System.out.println(set.toString());

	}

}
