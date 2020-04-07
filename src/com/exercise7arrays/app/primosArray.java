package com.exercise7arrays.app;
import java.util.Random;
public class primosArray {
	
	public static void main(String[] args) {
		//Constant declaration
		final int ELEMENTS_ARRAY=10;
		
		//Variable declaration
		byte primeNumbers=0;
		boolean isPrime=true;
		
		//Array declaration
		byte[] vector = new byte[ELEMENTS_ARRAY];
		
		//Objects declaration
		Random randomNumbers = new Random(System.nanoTime());
		
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			vector[i] = (byte) randomNumbers.nextInt(14);
		}
		
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{	
			isPrime=true;
			for(int j=2;j<vector[i]-1;j++)
			{
				if(vector[i]%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			{
				primeNumbers++;
			}
		}
		System.out.println("Quantity of prime numbers is:"+primeNumbers);
		/*
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			System.out.printl(vector[i]);
		}
		*/
	}

}
