package com.homework1.app;

import java.util.Random;

//Class that fills arrays from random numbers
public class RandomNumbers {
	
	//object declaration
	private Random randomNumber = new Random(System.nanoTime());
	
	public int[] InsertRandomNumbersTo(int[] array, int numberLimit)
	{
		//Process
		for (int i = 0; i < array.length; i++) {
			array[i] = randomNumber.nextInt(numberLimit);
		}				
		return array;
	}

}
