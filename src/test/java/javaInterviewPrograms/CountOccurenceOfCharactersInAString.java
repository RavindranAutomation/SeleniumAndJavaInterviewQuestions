package javaInterviewPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountOccurenceOfCharactersInAString {

	public static void main(String[] args) {
		String givenString = "india";

		char[] charArray = givenString.toCharArray();

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (char c : charArray) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}
		System.out.println(givenString + ":" + charMap);
	}

}
