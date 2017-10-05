package com.gsrk.map;

import java.util.HashMap;
import java.util.Map;

public class NullHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> countHashMap = new HashMap<String,Integer>();
		countHashMap.put(null, 1);
		System.out.println(countHashMap);

	}

}
