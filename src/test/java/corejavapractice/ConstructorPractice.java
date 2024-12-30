package corejavapractice;

public class ConstructorPractice {
	
//	1. Constructor is a block of code that inialize when object is created.
//	2. Construtor name must match with Class name 
//	3. Constructor must not have any explicit return types
//  4. Three Types - 1. Default, 2. No Argument, 3. parameterized
	
	int age1;
	int age2;
	int total;
	
	public ConstructorPractice() {
		System.out.println("My name is Ravi");
	}
	
	public ConstructorPractice(int raviage,int sreeniage) {
		
		this.age1=raviage;
		this.age2=sreeniage;
		
	}
	
	public void calulateAge() {
		total=age1+age2;
		System.out.println(total);

	}

	
	
	public static void main(String[] args) {
		
		ConstructorPractice cp = new ConstructorPractice();
		ConstructorPractice cp1 = new ConstructorPractice(55, 15);
		cp1.calulateAge();
		
		
		
		
		

		
	}

}
