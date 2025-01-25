package javaInterviewPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		String given = "ele";

		LinkedHashSet<Character> set = new LinkedHashSet<Character>();

		for (int i = 0; i < given.length(); i++) {

			set.add(given.charAt(i));
		}

		for (Character c : set) {
			System.out.print(c);
		}

	}

}
