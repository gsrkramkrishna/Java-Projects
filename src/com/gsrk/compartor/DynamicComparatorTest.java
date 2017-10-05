package com.gsrk.compartor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DynamicComparatorTest {

	public static void main(String[] args) {
		
		List<Person> personsList = new ArrayList<Person>();
		
		for(int i=0;i<10;i++){
			Person p1 = new Person();
			p1.setAge(23+i);
			p1.setId(123+i);
			p1.setName("Siva"+i);
			
			personsList.add(p1);
		}
		
		System.out.println("Before:"+personsList);
		DynamicComparator d1 = new DynamicComparator();
		d1.setCode(1);
		Collections.sort(personsList, d1);
		System.out.println("After:"+personsList);
		
	}
}
