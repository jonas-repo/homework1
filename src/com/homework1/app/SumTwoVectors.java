package com.homework1.app;

public class SumTwoVectors {

	public static void main(String[] args) {
		//Constants declaration
		final int ARRAY_LENGHT = 100;
		
		//Variable declarations
		
		//Array declarations
		int[] arrayOne = new int[ARRAY_LENGHT];
		int[] arrayTwo = new int[ARRAY_LENGHT];
		int[] arrayThree = new int[ARRAY_LENGHT];
		
		//Object initialization
		RandomNumbers randomNumbers = new RandomNumbers();
			
		//Initialization
		arrayOne = randomNumbers.InsertRandomNumbersTo(arrayOne,101);
		arrayTwo = randomNumbers.InsertRandomNumbersTo(arrayTwo,101);
		
		//Process
		for (int i = 0; i < ARRAY_LENGHT; i++) {
			arrayThree[i] = arrayOne[i] + arrayTwo[i];
			
			System.out.println(arrayOne[i] + "+"+ arrayTwo[i]+ "="+arrayThree[i]);
		}
		
		
	}	

}
