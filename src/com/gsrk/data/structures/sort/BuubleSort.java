package com.gsrk.data.structures.sort;

public class BuubleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = new int[] {3,2,1,5,23,7,44,55,12};
		
		String s1 = new String(new char[] {'a','c'});
		//String s2 = 'a'+'b'+'c';
		display(a);
		System.out.println();
		display(bubbleSortAdvanced(a));
	}
	
	public static int[] bubbleSort(int[] elements){
		if(elements!=null){
			for(int i=elements.length;i>0;i--){
				for(int j=0;j<i-1;j++){
					if(elements[j] > elements[j+1]){
						int temp = elements[j];
						elements[j] = elements[j+1];
						elements[j+1]=temp;
					}
				}
			}
		}
		
		
		return elements;
	}
	public static int[] bubbleSortAdvanced(int[] elements){
		if(elements!=null){
			boolean swapped =true;
			for(int i=elements.length;i>0&&swapped;i--){
				swapped = false;
				for(int j=0;j<i-1;j++){
					if(elements[j] > elements[j+1]){
						int temp = elements[j];
						elements[j] = elements[j+1];
						elements[j+1]=temp;
						swapped = true;
					}
				}
			}
		}
		
		
		return elements;
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
