package javaInterviewPrograms;

public class LengthOfAString {

	public static void UsingInbuiltFucntion() {
		String given = "India";
		System.out.println(given.length());
	}

	public static void UsingForEachLoop() {
		String given = "India";

		char[] charArray = given.toCharArray();
		int length=0;
		for (char c : charArray) {

			length++;
		}
		System.out.println(length);
	}
	
	public static void UsingForLoop() {
		String given = "India";
		char[] charArray = given.toCharArray();
		int length=0;
		for(int i=0;i<charArray.length;i++)
		{
			length++;
		}
		
		System.out.println(length);
	}

	public static void main(String[] args) {
		UsingInbuiltFucntion();
		UsingForEachLoop();
		UsingForLoop();
	}

}
