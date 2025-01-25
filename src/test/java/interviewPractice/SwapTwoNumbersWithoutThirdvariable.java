package interviewPractice;

public class SwapTwoNumbersWithoutThirdvariable {

	public static void main(String[] args) {
		int a = 30;
		int b = 60;
		
		a=a-b;
		b=a+b;
		a=b-a;
		
		System.out.println("After swapping of a value is " + a) ;
		System.out.println("After swapping of b value is " + b) ;
	}

}
