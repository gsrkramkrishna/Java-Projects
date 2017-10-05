package com.gsrk.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class SyncHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iteratorMethod();
	}
	
	public static void iteratorMethod(){
		Map<String,Integer> syncMap = Collections.synchronizedMap(new HashMap<String, Integer>());
		//Map<String,Integer> syncMap = new ConcurrentHashMap<String,Integer>();
		for(int i=0;i<5;i++){
			syncMap.put("Siva"+i, i);
		}
		Iterator<Entry<String,Integer>> itr = syncMap.entrySet().iterator();
		int count =0;
		while(itr.hasNext()){
			count++;
			Entry<String,Integer> keyValue = itr.next();
			if(count == 2)
				continue;
			else
				syncMap.put("Modified:"+keyValue.getKey(), keyValue.getValue());
				
			Entry<String,Integer> keyValue1 = itr.next();
			System.out.println("Key:"+keyValue1.getKey()+" => Value:"+keyValue1.getValue());
		}
		System.out.println(syncMap);
	}

}
