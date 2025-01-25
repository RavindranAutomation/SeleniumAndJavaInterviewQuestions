package interviewProgramsWithLogics;

public class CountTheVowelsFromAString {
	
//Logic:
//1. Covert the String into  lower or uppercase using toLoweCase()
//2. Assign int counter variable with 0
//3. Convert the transformed string into charArray[]
//4. Use for loop for iterate the charArray[]
//5. Inside the loop use if condition and check the indexes of
//    charArray is having vowels
//6. If yes then increase the counter then outside the loop print output
		
	public static void main(String[] args) {
		String given = "Education";

		String lowerCase = given.toLowerCase();
		int counter = 0;

		char[] charArray = lowerCase.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o'
					|| charArray[i] == 'u') {
				counter++;
			}
		}
		System.out.println("Total number of vowels : " + counter);
	}

}
