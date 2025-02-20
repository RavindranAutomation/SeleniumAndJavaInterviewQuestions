package javaInterviewPrograms;

import java.util.ArrayList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int [] given = {1,2,3,4};
		
		
		ArrayList<Integer> set = new ArrayList<Integer>();
		
		for(int i=0;i<given.length;i++) {
			set.add(given[i]);
		}
		
		System.out.println(set.reversed());

	}

}
