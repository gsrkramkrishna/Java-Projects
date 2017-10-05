package com.gsrk.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem5 p5 = new Problem5();
		int max = p5.process("AaabbbbcccDbDbb");
		System.out.println("Max frequuecey Count:"+max);
	}
	
	public int process(String str){
		if(str == null || str.isEmpty())
			return 0;
		Map<Character,Integer> charMap =  new HashMap<Character,Integer>();
		int max = 1;
		
		for(char c : str.toCharArray()){
			if(charMap.containsKey(c)){
					if(max<charMap.get(c)+1)
						max = charMap.get(c)+1;
				charMap.put(c, charMap.get(c)+1);
			}
			else{
				charMap.put(c, 1);
			}
		}
		for(Entry<Character,Integer> entry:charMap.entrySet()){
			if(entry!=null){
				System.out.println("Key:"+entry.getKey()+" value:"+entry.getValue());
			}
		}
		
		return max-1;
	}
	
	

}
