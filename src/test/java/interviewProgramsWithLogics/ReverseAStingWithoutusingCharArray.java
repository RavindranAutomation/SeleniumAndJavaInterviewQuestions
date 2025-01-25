package interviewProgramsWithLogics;

public class ReverseAStingWithoutusingCharArray {

	//	Logic:
	//		1. Create a String variable with empty
	//		2. For loop -> Intialization - From the last index of the string
	//		3. For loop -> Condition - i>=0
	//		4. For loop -> Decrement - i--
	//		5. reversed = reversed+given.charAt(i);

	public static void main(String[] args) {
		String given = "Bingo";
		String reversed = "";

		for (int i = given.length() - 1; i >= 0; i--) {
			reversed = reversed + given.charAt(i);
		}
		System.out.println(reversed);
	}

}
