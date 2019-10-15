package com.homework1.app;
import java.util.Scanner;

public class PrimeNumberCycle {

	public static void main(String[] args) {
		//variables declaration
		int number = 0;
		boolean isPrime = true;
		char userAnswer = 'y';
		//object declaration
		Scanner input = new Scanner(System.in);
		
		// menu cycle
		while(userAnswer != 'n')
		{
			//user input
			System.out.println("Input the number you want to know if is prime number");
			number = (int) input.nextDouble();
			//condition integer of positive number
			if(number <= 1)
			{
				System.err.println("Please verify your input, only integer, positive and more than number 1 numbers accepted");
				continue;
			}
			else
			{
				//loop to search prime number
				for (int i = 2; i < number; i++) {
					if(number % i == 0)
					{
						isPrime = false;
						break;
					}
				}
			}
			if(isPrime)
			{
				System.out.println("The number "+number+" is prime");
			}
			else
			{
				System.out.println("The number "+number+" is not prime");
			}
			
			//flag restart
			isPrime = true;
			
			//user input condition
			System.out.println("Do you want to calculate another number? (y/n)");
			userAnswer = input.next().charAt(0);
			
			
		}
		//object close
		input.close();

	}

}
