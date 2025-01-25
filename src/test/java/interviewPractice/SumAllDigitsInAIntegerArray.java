package interviewPractice;

public class SumAllDigitsInAIntegerArray {
	
	public static void main(String[] args) {
		
		int[] given = {10,20,30,40,50};
		
		int total=0;
		
		for(int i=0;i<given.length;i++) {
			
			total=total+given[i];
			
		}
		
		System.out.println(total);
		
	}

}
