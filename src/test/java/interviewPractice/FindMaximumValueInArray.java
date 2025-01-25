package interviewPractice;

public class FindMaximumValueInArray {

	public static void main(String[] args) {
		int [] given = {5,8,9,4,7,6,3,1};
		
		int largest = given[0];
		
		for(int i= 0;i<given.length;i++) {
			if(given[i]>largest) {
				largest=given[i];
			}
		}
			
		System.out.println("largest number is :" +largest);

	}

}
