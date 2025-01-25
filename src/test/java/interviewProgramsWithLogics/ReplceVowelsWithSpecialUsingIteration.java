package interviewProgramsWithLogics;

public class ReplceVowelsWithSpecialUsingIteration {
	public static void main(String[] args) {
		String given = "Ravindran";

		String lowerCase = given.toLowerCase();
		char specialCharacter = '*';

		char[] charArray = lowerCase.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o'
					|| charArray[i] == 'u') {
				charArray[i]=specialCharacter;
			}
		}
		for (char c : charArray) {
			System.out.print(c);
		}
	}
}
