package interviewProgramsWithLogics;

public class ReverseAStringUsingCharArray {

	// Logic:
	// 1. Convert a given String in to CharArray() and create a empty string variable
	// 2. for loop,  Initialization - start from last index
	// 3. for loop, Condition checking - i>=0
	// 4. for loop, Decrement - i--
	// 5. rev-rev+charArr[i]

	public static void main(String[] args) {
		String given = "Bingo";
		char[] charArray = given.toCharArray();
		String reversed = "";

		for (int i = charArray.length - 1; i >= 0; i--) {
			reversed = reversed + charArray[i];
		}
		System.out.println(reversed);
	}

}
