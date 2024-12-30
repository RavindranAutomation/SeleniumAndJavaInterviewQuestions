package javaInterviewPrograms;

public class ReplaceVowelsWithSpecialCharacter {

	public static void usingIteration() {
		String givenText = "I Miss You";
		char[] charArray = givenText.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			if (givenText.charAt(i) == 'a' || givenText.charAt(i) == 'e' || givenText.charAt(i) == 'i'
					|| givenText.charAt(i) == 'o' || givenText.charAt(i) == 'u' || givenText.charAt(i) == 'A'
					|| givenText.charAt(i) == 'E' || givenText.charAt(i) == 'I' || givenText.charAt(i) == 'O'
					|| givenText.charAt(i) == 'U') {

				charArray[i] = '*';

			}
		}
		System.out.println(charArray);

	}

	public static void UsingRegularExpression() {
		String givenText = "I Miss You";
		String replacedText = givenText.replaceAll("[AEIOUaeiou]", "*");
		System.out.println(replacedText);

	}

	public static void main(String[] args) {
		//usingIteration();
		UsingRegularExpression();
	}

}
