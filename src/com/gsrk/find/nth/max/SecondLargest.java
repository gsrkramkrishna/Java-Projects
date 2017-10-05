package com.gsrk.find.nth.max;
public class SecondLargest {
	private int [] arr = {14,150, 46, 47, 86, 92, 52, 48, 36,89, 66, 85};

	public static void main(String[] args) {
		SecondLargest s = new SecondLargest();
		s.secondLargest();
		s.getit(3);
	}
	
	void getit(int k){
        int i,j=0;
        for(i=0;i<arr.length;i++){
            int c=0;
            for(j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    c++;
                }
                //System.out.println(arr[i] +"count :"+c);
            }
            if(c==(k-1)){
                System.out.println("Finally:"+arr[i]);
                break;
            }
        }
    }
	void getitNew(int k){
        int i;
        for(i=0;i<arr.length;i++){
            int c=0;
            int pos = 0;
            if(arr[i]<arr[++pos]){
                c++;
            }
            if(c==(k-1)){
                System.out.println("Finally:"+arr[i]);
                break;
            }
        }
    }
	
	void secondLargest(){
		int first = arr[0];
		int second = arr[0];
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++){
			if(arr[i]>first){
				second = first;
				first = arr[i];
			}
			else if(arr[i]>second){
				second = arr[i];
			}
		}
		System.out.println("Second largest:"+second);
	}

}
