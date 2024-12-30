package javaInterviewPrograms;

public class ReverseAWordsinASentence {

	public static void main(String[] args) {
		String given = "Iam an Automation Tester";
		String[] splittedString = given.split(" ");

		String reversed = "";

		for (int i = splittedString.length - 1; i >= 0; i--) {
			reversed = reversed + splittedString[i] + " ";
			
		}
		System.out.print(reversed);


	}

}
