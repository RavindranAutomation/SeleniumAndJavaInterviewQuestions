package interviewProgramsWithLogics;

public class ReverseEachWordsFromAString {
	
//	Logic:
//		1. Split a given String and store it in String []	              
//		2. Create a for loop and iterate from the end of the array index
		

	public static void main(String[] args) {
		String given = "I Love Automation";
		String[] splittedString = given.split(" ");

		for (int i = splittedString.length - 1; i >= 0; i--) {
			System.out.print(splittedString[i] + " ");
		}

	}

}
