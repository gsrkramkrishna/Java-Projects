package com.gsrk.sb;

public class SBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBTest sb = new SBTest();
		StringBuffer s = new StringBuffer("A");
		StringBuffer s1 = new StringBuffer("B");
		sb.myStuf(s, s1);
		System.out.println(s);

	}
	
	public void myStuf(StringBuffer s,StringBuffer s1){
		s.append("B");
		s = s1;
	}

}
