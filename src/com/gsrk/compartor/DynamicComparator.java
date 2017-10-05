package com.gsrk.compartor;

import java.util.Comparator;

public class DynamicComparator implements Comparator<Person>{

	private int code ;
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		if(code == 0)
			return o2.getId() - o1.getId();
		else if(code == 1)
			return o2.getName().compareTo(o1.getName());
		else
			return o2.getAge() - o1.getAge();
	}

}
