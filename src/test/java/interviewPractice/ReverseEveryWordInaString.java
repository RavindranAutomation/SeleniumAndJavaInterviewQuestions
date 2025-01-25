package interviewPractice;

public class ReverseEveryWordInaString {

	public static void main(String[] args) {
		String givenSentence = "India is my country";

		String [] splitedString=givenSentence.split(" ");
		String reversed="";

		for(int i=splitedString.length-1;i>=0;i--) {

			reversed =reversed+splitedString[i]+ " ";

		}
		System.out.println(reversed);
	}

}
