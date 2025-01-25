package javaInterviewPrograms;

import java.util.HashMap;

public class CountEachOccurencesOfCharactersInAString {

	public static void main(String[] args) {
		String given = "Ravindran";

		char[] charArray = given.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : charArray) {
			if (map.containsKey(c)) {
				int count = map.get(c);
				map.put(c, count + 1);
			} else {
				map.put(c, 1);
			}

		}

		System.out.println(map);

	}

}
