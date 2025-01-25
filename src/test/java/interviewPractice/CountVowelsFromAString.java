package interviewPractice;

public class CountVowelsFromAString {

	public static void main(String[] args) {
		String given = "Ravindran";
		String modifiedInput = given.toLowerCase();
		int count =0;
		for(int i =0;i<modifiedInput.length();i++) {
			if(given.charAt(i)=='a'||given.charAt(i)=='e'
					||given.charAt(i)=='i'
					||given.charAt(i)=='o'
					||given.charAt(i)=='u') {
				count=count+1;

			}
		}
		System.out.println(count);
	}

}
