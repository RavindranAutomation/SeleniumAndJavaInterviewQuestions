package interviewProgramsWithLogics;

public class ReverseAStringUsingInbuiltMethod {

//	Logic:
//		1. Create a StringBuilder class object and pass the declared String variable
//		2. Use reversed method of StringBuilder class then print output

		public static void main(String[] args) {
		String given = "Bingo";

		StringBuilder builder = new StringBuilder(given);
		StringBuilder reverse = builder.reverse();
		System.out.println(reverse);

	}

}
