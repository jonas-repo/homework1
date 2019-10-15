package com.homework1.app;

public class BubbleSort {

	public static void main(String[] args) {
		//Constants declaration
		final int ARRAY_LENGHT = 100;
		
		//variables declaration
		boolean bubbleSwap = true;
		int auxiliar = 0;
		int count = 0;
		int count2 = 0;
		
		//array declaration
		int[] arrayOne = new int[ARRAY_LENGHT];
		
		//object declaration
		RandomNumbers randomNumbers = new RandomNumbers();
		
		//array seed
		arrayOne = randomNumbers.InsertRandomNumbersTo(arrayOne, 101);
		
		//show original order
		System.out.println("Original order bubble sort:");
		for (int i = 0; i < ARRAY_LENGHT; i++) {
			System.out.print(arrayOne[i] + " ");
		}
		System.out.println("");
		
		//process
		while(bubbleSwap)
		{
			
			if(count + 1 >= ARRAY_LENGHT)
			{
				count = 0;
			}
			
			if(arrayOne[count] > arrayOne[count+1])
			{
				auxiliar = arrayOne[count+1];
				arrayOne[count+1] = arrayOne[count];
				arrayOne[count] = auxiliar;
				count2 = 0;
			}
			if(arrayOne[count] < arrayOne[count+1])
			{
				count2++;
				if(count2 == ARRAY_LENGHT)
				{
					bubbleSwap = false;
					break;
				}
			}
			
			count++;
		}
		System.out.println("Bubble Ordered:");
		for (int i = 0; i < ARRAY_LENGHT; i++) {
			System.out.print(arrayOne[i] + " ");
		}
		
		

	}

}
