package javaInterviewPrograms;

public class ReverseANumber {

	public static void main(String[] args) {

		int given = 156546;
		int reversed = 0;
		while (given != 0) {
			reversed = reversed * 10 + given % 10;
			given = given / 10;
		}
		
		System.out.println(reversed);
	}
}
