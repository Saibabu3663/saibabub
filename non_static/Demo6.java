package com.non_static;

public class Demo6 {
	void m1()
	{
		System.out.println("from m1()");
	}

	public static void main(String[] args) {
		Demo6 x=new Demo6();
		x.m1();
		

	}

}
