package com.gsrk.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Problem2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Problem2 p2 = new Problem2();
		int oddEven = p2.process(str);
		System.out.println("Odd or Even:"+oddEven);
		oddEven = p2.processNewOptm(str);
		System.out.println("Odd or Even:"+oddEven);
		
	}
	public int process(String str){
		if((str.length()%2)==1)
			return -1;
		Map<Character,Integer> first =  new HashMap<Character,Integer>();
		Map<Character,Integer> second =  new HashMap<Character,Integer>();
		
		for(char c : str.substring(0, str.length()/2).toCharArray()){
			if(first.containsKey(c)){
				first.put(c, first.get(c)+1);
			}
			else{
				first.put(c, 1);
			}
		}
		for(char c : str.substring(str.length()/2, str.length()).toCharArray()){
			if(second.containsKey(c)){
				second.put(c, second.get(c)+1);
			}
			else{
				second.put(c, 1);
			}
		}
		for(char c : str.substring(0, str.length()/2).toCharArray()){
			if(first.get(c) != second.get(c)) return 0;
		}
//		for(Entry<Character,Integer> entry:first.entrySet()){
//			if(entry!=null){
//				System.out.println("F Key:"+entry.getKey()+" value:"+entry.getValue());
//			}
//		}
//		for(Entry<Character,Integer> entry:second.entrySet()){
//			if(entry!=null){
//				System.out.println("S Key:"+entry.getKey()+" value:"+entry.getValue());
//			}
//		}
		
		return 1;
	}
	
	public int processNewOptm(String str){
		if(str.length()%2==1)
			return -1;
		//int count =0;
		boolean flag = isAngram(str.substring(0, str.length()/2).toCharArray(),str.substring(str.length()/2, str.length()));
		
		System.out.println(flag);
		
		return flag?1:0;
	}
	public boolean isAngram(char[] chrs,String str2){
		
		StringBuffer sb = new StringBuffer(str2);
		for(char ch : chrs){
			int index = sb.indexOf(""+ch);
			if(index!=-1){
				sb.deleteCharAt(index);
			}else{
				return false;
			}
		}
		return sb.length()==0?true:false;
	}
}
