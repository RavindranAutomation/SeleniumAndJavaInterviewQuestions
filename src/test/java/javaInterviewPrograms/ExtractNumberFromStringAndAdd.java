package javaInterviewPrograms;

public class ExtractNumberFromStringAndAdd {
	
//	Steps:
//		1. Assume the total is 0
//		2. Iterate with for loop
//		3. Inside the loop fecth the char value and store it in char
//		3. Check if the char value is digit or not using Character.isDigit(charvalue)
//		4. Use if it's digit, get the numerical vale and add with total.

	public static void main(String[] args) {
		String given ="Ravi456";

		int total=0;

		for(int i =0;i<given.length();i++) {

			char charvalue =given.charAt(i);

			if(Character.isDigit(charvalue)) {
				total =total+Character.getNumericValue(charvalue);
			}

		}
		System.out.println(total);

	}

}
