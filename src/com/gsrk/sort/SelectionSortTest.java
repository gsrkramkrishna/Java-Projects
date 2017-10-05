package com.gsrk.sort;

import java.util.Random;

public class SelectionSortTest {

	public static final int ARRAY_SIZE = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = generateInputData();
		display(inputArray);
		int[] inputArray1 = selectionSort(inputArray);
		System.out.println("After:");
		display(inputArray1);
	}
	public static int[] selectionSort(int[] inputArray){
		if(inputArray!=null){
			int i,j,min,temp;
			for(i=0;i<inputArray.length-1;i++){
				min = i;
				for(j=i+1;j<inputArray.length;j++){
					if(inputArray[j]<inputArray[min])
						min = j;
				}
				temp = inputArray[min];
				inputArray[min] = inputArray[i];
				inputArray[i] = temp;
			}
		}
		
		return inputArray;
	}
	public static int[] generateInputData(){
		int[] inputArray = new int[ARRAY_SIZE];
		Random rm = new Random();
		for(int i=0;i<ARRAY_SIZE;i++){
			int temp = rm.nextInt();
			if(temp<0)
				inputArray[i] = -temp;
			else
				inputArray[i] = temp;
		}
		
		return inputArray;
	}
	
	public static void display(int[] inputArray){
		if(inputArray!=null){
			for(int i=0;i<inputArray.length;i++){
				System.out.println(inputArray[i]);
			}
		}
	}

}
