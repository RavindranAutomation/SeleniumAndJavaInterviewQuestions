package javaInterviewPrograms;

public class FibonnacciSeries {

	public static void main(String[] args) {
		int number1 =0;
		int number2 =1;
		int sum;
		//0 1 1 2 3 5 8 13 21
		for(int i=2;i<=10;i++) {
//			sum = number1+number2;
			sum = number1+number2;
			number1=number2;
			number2=sum;;
			System.out.print(sum + " ");
		}

	}

}
