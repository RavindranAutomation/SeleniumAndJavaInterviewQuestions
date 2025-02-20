package javaInterviewPrograms;

public class ExtractNumberFromStringAndAdd {

//	Steps:
//		1. Assume the total is 0
//		2. Iterate with for loop
//		3. Inside the loop fetch the char value and store it in char
//		3. Check if the char value is digit or not using Character.isDigit(charvalue)
//		4. Use if it's digit, get the numerical vale and add with total.

	public static void main(String[] args) {

		String given = "Magesh1999";
		char[] charArray = given.toCharArray();
		int total = 0;

		for (char charValue : charArray) {
			if (Character.isDigit(charValue)) {
				total = total + Character.getNumericValue(charValue);

			}
		}
		
		System.out.println(total);
	}

}
