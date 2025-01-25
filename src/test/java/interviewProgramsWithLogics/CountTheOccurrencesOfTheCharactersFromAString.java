package interviewProgramsWithLogics;

import java.util.LinkedHashMap;

public class CountTheOccurrencesOfTheCharactersFromAString {

	// Logic:
	// 1. Convert the String into CharArray
	// 2. To maintain insertion order of the given String using LinkedHashMap
	// 3. Create an oject for the LinkedHashmap and pass the generics
	//    with Character,Integer
	// 4. Iterate the charArray isung foreach loop and store
	//     each chars in c variable
	// 5. Put if condition inside the for each loop and mention if that map contains
	//    the char value
	// 6. If NO, use else condition and add that char into map and assign int as one
	// 7. If YES, get the key value of the char and store itb in int variable
	// 8. Then use map.put for add that char and increament the count+1
	// 9. Then print the map.toString()

	public static void main(String[] args) {

		String given = "Ravindran";

		char[] charArray = given.toCharArray();

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char c : charArray) {
			if (map.containsKey(c)) {
				int count = map.get(c);
				map.put(c, count + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map.toString());

	}

}
