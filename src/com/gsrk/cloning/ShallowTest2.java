package com.gsrk.cloning;

public class ShallowTest2 implements Cloneable{
	ShallowTest1 t1;
	int i;
	
	public ShallowTest2(ShallowTest1 t1,int i) {
		// TODO Auto-generated constructor stub
		this.t1=t1;
		this.i=i;
	}

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		
		ShallowTest1 t = new ShallowTest1(20);
		ShallowTest2 t2 = new ShallowTest2(t, 30);
		System.out.println(t2.i+""+t2.t1.j);
		
		ShallowTest2 t3 = (ShallowTest2) t2.clone();
		t2.i=300;
		t2.t1.j=200;
		System.out.println(t3.i+""+t3.t1.j);
		System.out.println(t2.i+""+t2.t1.j);

	}

}
