package com.gsrk.data.structures.sort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int[] {3,2,1,5,23,7,44,55,12};
		display(a);
		selectionSort(a);
		display(a);
	}
	
	public static void selectionSort(int[] a){
		int i,j,min,temp;
		for(i=0;i<a.length-1;i++){
			min = i;
			for(j=i+1;j<a.length;j++){
				if(a[j]<a[min])
					min = j;
			}
			temp = a[i];
			a[i] = min;
			a[min] = temp;
		}
		
	}
	public static void display(int[] elements){
		if(elements!=null){
			StringBuffer sb = new StringBuffer();
			for(int i=0;i<elements.length;i++){
				sb.append(elements[i]);
				if(i!=elements.length-1)
				sb.append("->");
				
			}
			System.out.println(sb.toString());
		}
	}
}
