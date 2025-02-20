package javaInterviewPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		String [] given = {"Magesh","Ravi","Magesh"};
		
		

		LinkedHashSet<String> set = new LinkedHashSet<String>();

		for (int i = 0; i < given.length; i++) {

			set.add(given[i]);
		}

		for (String c : set) {
			System.out.print(c + ",");
		}

	}

}
