package interviewProgramsWithLogics;

public class ReplaceVowelsWithSpecialCharacter {
	//Logic:
	//	1. Use inbuilt replaceAll method from String class
	//	2. Use this regular Expression, replaceAll("[aeiouAEIOU]","*");
	//	3. Store the replace String into variable
	//	4. Then print the replacedString variable

	public static void main(String[] args) {
		String given = "Elephant";
		String replacedString = given.replaceAll("[aeiouAEIOU]", "&");
		System.out.println(replacedString);
	}

}
