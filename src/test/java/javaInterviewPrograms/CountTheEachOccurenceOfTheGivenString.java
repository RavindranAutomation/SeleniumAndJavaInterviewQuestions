package javaInterviewPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountTheEachOccurenceOfTheGivenString {

	public static void main(String[] args) {

		String name = "Magesh";
		int count;
		char[] charArray = name.toCharArray();

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char charIndex : charArray) {

			if (map.containsKey(charIndex)) {

				count = map.get(charIndex);
				map.put(charIndex, count + 1);

			} else {
				map.put(charIndex, 1); // i=2, n=1, d=1
			}

		}

		System.out.println(map.toString());

	}

}
