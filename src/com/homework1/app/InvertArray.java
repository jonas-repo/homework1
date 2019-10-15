package com.homework1.app;

public class InvertArray {

	public static void main(String[] args) {
		//Constant declaration
		final int ARRAY_LENGHT = 10;
		
		//variables declaration
		int count = ARRAY_LENGHT-1;
		int auxiliar = 0;
		
		//array declaration
		int[] arrayOne = new int[ARRAY_LENGHT];
		
		//object declaration
		RandomNumbers randomNumbers = new RandomNumbers();
		
		//array seed
		arrayOne = randomNumbers.InsertRandomNumbersTo(arrayOne, 101);
		
		//show original numbers positions
		System.out.println("Original positions of the numbers:");
		for (int i = 0; i < arrayOne.length; i++) {
			System.out.print(arrayOne[i]+" ");
		}
		
		//process
		for (int i = 0; i < ARRAY_LENGHT/2; i++) {			
			auxiliar = arrayOne[count];
			arrayOne[count] = arrayOne[i];
			arrayOne[i] = auxiliar;
			count--;
			
		}
		//show reordered numbers in array
		System.out.println("");
		System.out.println("Numbers inverted: ");
		for (int i = 0; i < arrayOne.length; i++) {
			System.out.print(arrayOne[i]+" ");
		}
		
	}

}
