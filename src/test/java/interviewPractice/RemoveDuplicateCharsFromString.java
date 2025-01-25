package interviewPractice;

import java.util.*;

public class RemoveDuplicateCharsFromString {

	public static void main(String[] args) {
		String name ="INDIA";
		char[] charArray = name.toCharArray();

		LinkedHashSet<Character> charset = new LinkedHashSet<Character>();


		for(int i =0;i<name.length();i++) {
			charset.add(charArray[i]);
		}
		for (Character character : charset) {
			System.out.print(character);
		}
	}


}
