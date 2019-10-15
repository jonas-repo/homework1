package com.homework1.app;
import java.util.Scanner;
public class FibonacciNumbers {

	public static void main(String[] args) {
		//variables declaration
		int elements = 0;
		int number1 = 0; 
		int number2 = 1;
		int number3 = 1;
		
		//object declaration
		Scanner input = new Scanner(System.in);
		
		//user input
		
		do {
			
			//user input
			System.out.println("Input the position of numbers you want: ");
			elements = input.nextInt();
			
			if (elements <= 0) {
				System.err.println("Please input a number greater from zero");
			}						
			
		}while(elements <= 0);
			
		
		
		//process and show results
		for (int i = 0; i < elements; i++) {
			
			
			System.out.print(number3+" ");
				
			number3 = number1 + number2;
			number1 = number2;
			number2 = number3;			
		}
		
		//close objects
		input.close();
		
	}

}
