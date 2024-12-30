package javaInterviewPrograms;

public class PyramidPattern {
	
	public static void main(String[] args) {
		
//		String given = "Ravindran";
//		StringBuffer bf = new StringBuffer();
//		StringBuffer reverse = bf.append(given).reverse();
//		System.out.println(reverse);
		
		
		String given = "Ravi";
		
		char[] charArray = given.toCharArray();
		String reversed="";
		
		for(int i =charArray.length-1;i>=0;i--) {
			
			reversed=reversed+charArray[i];
			
		}
		System.out.println(reversed);
		

}
}