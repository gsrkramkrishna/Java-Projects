package com.gsrk.map.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Siva");
		map.put(2, "Rama");
		map.put(3, "Krishna");
		
		Set<Entry<Integer,String>> set = map.entrySet();
		List<Entry<Integer,String>> list = new ArrayList<Entry<Integer,String>>(set);
		
		Collections.sort(list,new Comparator<Map.Entry<Integer,String>>(){
			public int compare(Map.Entry<Integer, String> o1,Map.Entry<Integer, String> o2){
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		for(Map.Entry<Integer, String> entry:list){
			System.out.println(entry.getKey() +"->"+entry.getValue());
		}
	}

}
