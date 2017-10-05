package com.gsrk.data.structures.logic;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
	        int n = arr.length;
	         
	        n = removeDuplicatesFromSortedArray(arr, n);
	        display(arr);
	        // Print updated array
	        for (int i=0; i<n; i++)
	           System.out.print(arr[i]+" ");
	}
	
	public static int removeDuplicatesFromSortedArray(int[] arr,int len){
		
		if (len == 0 || len == 1) return len;
		//int len = arr.length;
		int j =0;
		for(int i=0;i<len-1;i++){
			if(arr[i]!=arr[i+1]){
				arr[j++] = arr[i];
				display(arr);
			}
				
		}
		arr[j++] = arr[len-1];
        return j;
	}
	
	public static void display(int[] arr){
		 for (int i=0; i<arr.length; i++)
	           System.out.print(arr[i]+" ");
		 System.out.println();
	}

}
