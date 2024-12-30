package javaInterviewPrograms;

public class RemoveLeadingANdTrailingSpaces {

	public static void main(String[] args) {
		String given =" I'm Ravindran ";
		String trimmedString = given.trim();
		System.out.println(trimmedString);
		
		
		String given1 =" I'm Ravindran ";
		System.out.println(given.stripLeading());
		System.out.println(given.stripTrailing());
	}

}
