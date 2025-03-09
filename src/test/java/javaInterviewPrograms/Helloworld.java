package javaInterviewPrograms;

public class Helloworld {

	public static void main(String[] args) {

		String name ="hello";
		char[] charArray = name.toCharArray();

		for(int i=0;i<charArray.length;i++) {
			charArray[i]=Character.toLowerCase(charArray[i]);


		}

		System.out.println(charArray);
	}

}
