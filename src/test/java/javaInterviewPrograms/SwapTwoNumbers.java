package javaInterviewPrograms;

public class SwapTwoNumbers {

	public static void UsingTempVariable() {
		int mySalary = 100;
		int managerSalary = 50;
		int temp = mySalary;
		mySalary = managerSalary;
		managerSalary = temp;

		System.out.println(mySalary);
		System.out.println(managerSalary);

	}
	
	
	public static void WithoutTempvariable() {
//		a=a-b
//		b=a+b
//		a=b-a
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before swapping a = " + a);
		System.out.println("Before swapping b = " + b);
		a=a-b;
		b=a+b;
		a=b-a;
		
		
		
		
		System.out.println("After swapping a = " + a);
		System.out.println("After swapping b = " + b);
				

	}

	public static void main(String[] args) {

		//SwapTwoNumbers.UsingTempVariable();
		SwapTwoNumbers.WithoutTempvariable();

	}

}
