package com.homework1.app;

public class AritmeticMedia {

	public static void main(String[] args) {
		
		//constants declaration
		final int ARRAY_LENGHT = 100;
		
		//variables declaration
		double sumResult = 0;
		
		//object declaration
		RandomNumbers randomNumbers = new RandomNumbers();
		
		//array declaration
		int[] arrayOne = new int[ARRAY_LENGHT];
		
		//array seed
		arrayOne = randomNumbers.InsertRandomNumbersTo(arrayOne,101);
		
		//process
		for (int i = 0; i < ARRAY_LENGHT; i++) {
			sumResult = sumResult + arrayOne[i];
		}
		
		//show results
		System.out.println("The aritmetic median is: "+ (sumResult/ARRAY_LENGHT) );
	}

}
