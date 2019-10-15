package com.homework1.app;
import java.util.Scanner;

public class FactorialNumbers {

	public static void main(String[] args) {
		//Variables declaration
		int fromNumber = 0;
		int factorial = 1;
		
		//object declaration
		Scanner input = new Scanner(System.in);
		
		//user input
		System.out.println("Input the number that you want to calculate factorial: ");
		fromNumber = input.nextInt();
		
		//process
		for (int i = 1; i <= fromNumber; i++) {
			factorial = factorial * i;
		}
		//show results
		System.out.println("The factorial of number "+fromNumber+" is "+factorial);
		
		//close objects
		input.close();

	}

}
