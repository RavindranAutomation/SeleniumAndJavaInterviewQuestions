package javaInterviewPrograms;

import java.util.HashMap;

public class CountEachOccurencesOfWordsInAString {

	public static void main(String[] args) {
		String given = "Hello World World";
		String[] stringArray = given.split(" ");

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (String s : stringArray) {
			if (map.containsKey(s)) {
				int count = map.get(s);
				map.put(s, count + 1);
			} else {
				map.put(s, 1);
			}
		}
		System.out.println(map);
	}

}
