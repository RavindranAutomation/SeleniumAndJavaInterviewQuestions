package javaInterviewPrograms;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your input");
		String input = sc.next();
		int length = input.length();
		String reversed="";
		
		for(int i =0;i<length;i++) {
			reversed=input.charAt(i)+reversed;

		}
		System.out.println(reversed);

	}

}
