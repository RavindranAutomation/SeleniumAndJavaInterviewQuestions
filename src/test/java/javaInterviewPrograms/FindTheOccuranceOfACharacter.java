package javaInterviewPrograms;

public class FindTheOccuranceOfACharacter {

	public static void main(String[] args) {
		String given = "elephant";
		String input = given.toLowerCase();
		char chartoFind='e';
		int occurance=0;

		for(int i=0;i<input.length();i++) {
			if (chartoFind==input.charAt(i)) {
				occurance++;
			}
		}

		System.out.println(occurance);
	}

}
