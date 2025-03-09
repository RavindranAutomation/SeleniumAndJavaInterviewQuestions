package javaInterviewPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 10;
		boolean isPrime = true;  
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isPrime=false;
			}
		}
		
		if(isPrime) {
			System.out.println(num + " - Number is a prime number");
		}else {
			System.out.println(num + " - Number is not a prime number");
		}
	}

}
