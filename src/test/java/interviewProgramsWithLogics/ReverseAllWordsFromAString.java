package interviewProgramsWithLogics;

public class ReverseAllWordsFromAString {

//	Logic:
	// 1. Create a String variable with empty
	// 2. For loop -> Intialization - From the last index of the string
	// 3. For loop -> Condition - i>=0
	// 4. For loop -> Decrement - i--
	// 5. reversed = reversed+given.charAt(i);

	public static void main(String[] args) {
		String given = "I Love Automation";
		String revesed = "";

		for (int i = given.length() - 1; i >= 0; i--) {
			revesed = revesed + given.charAt(i);
		}
		System.out.println(revesed);
	}

}
