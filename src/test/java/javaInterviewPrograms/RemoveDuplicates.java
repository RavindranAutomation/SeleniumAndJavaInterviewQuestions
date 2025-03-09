package javaInterviewPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int [] given = {1,1,2,2,3,3,4,4,5,5};
		
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		for(int intvalue : given) {
			set.add(intvalue);
		}
		
		System.out.println(set.toString());
		

	}

}
