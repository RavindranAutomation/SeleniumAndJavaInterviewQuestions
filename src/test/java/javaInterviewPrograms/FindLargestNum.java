package javaInterviewPrograms;

public class FindLargestNum {

	public static void main(String[] args) {
		
		int [] given = {10,52,6,4,18,8};
		
		int largestNum = Integer.MIN_VALUE;
		
		for(int i : given) {
			
			if(given[i]<largestNum) {
				largestNum=given[i];
				break;
			}
			
		}
		System.out.println(largestNum);
		
		
	}
	
	

}
