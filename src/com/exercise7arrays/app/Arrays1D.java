package com.exercise7arrays.app;

public class Arrays1D {

	public static void main(String[] args) {
		//Constant declaration
		//I want 10 elemnts because it is a practice project
		final int ELEMETS_ARRAY =10;
		
		//Arrays declaration 
		
		//1st Way
		int[]intArray = new int[ELEMETS_ARRAY];
		char[]charArray = new char[ELEMETS_ARRAY];
		boolean[] boolArray = new boolean[ELEMETS_ARRAY];
		double[] dblArray = new double[ELEMETS_ARRAY];
		String[] strArray = new String[ELEMETS_ARRAY];
		
		int[] intArray2 = {10,20,30,40,50,60};
		char[] charArray2 = {'a','b','c','d','e'};
		boolean[] boolArray2= {true,false,true,false,true};
		double[] dblArray2 = {1.0,2.0,3.0,4.0,5.0};
		String[] strArray2 = {"first","second","third","fourth","fifth"};
		
		for (int i=0;i<=intArray2.length;i++)
		{
			System.out.println(intArray2[i]);
		}
		
		for (int i=0;i<=charArray2.length;i++)
		{
			System.out.println(charArray2[i]);
		}

	}

}
