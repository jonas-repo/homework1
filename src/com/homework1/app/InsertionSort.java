package com.homework1.app;

public class InsertionSort {

	public static void main(String[] args) {
		//constants declaration
		
		final int ARRAY_LENGTH = 100;
		
		//variables declaration
		int auxiliar = 0;
		boolean swap = true;
		int count = 0;
		int count2 = 0;
		
		//object declaration
		RandomNumbers randomNumbers = new RandomNumbers();
		
		//array declaration
		int[] arrayOne = new int[ARRAY_LENGTH];
		
		//array seed 
		arrayOne = randomNumbers.InsertRandomNumbersTo(arrayOne, 101);
		
		//process
		//show original order
		System.out.println("Original order:");
		for (int i = 0; i < ARRAY_LENGTH; i++) {
			System.out.print(arrayOne[i] + " ");
		}
		
		while(swap)
		{
			for (int i = count; i == 0; i--) {
				if(arrayOne[i] > arrayOne[i+1])
				{
					auxiliar = arrayOne[i];
					arrayOne[i] = arrayOne[i+1];
					arrayOne[i+1] = auxiliar;
				}
				else
				{
					
				}
			}			
			count++;
		}
		
		
		//show order
		

	}

}
