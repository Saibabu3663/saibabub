package com.iib;

public class P3 {
	{
		System.out.println("from IIB");
	}
	P3()
	{
		System.out.println("from P3()");
	}
	P3(int a)
	{     this();
		System.out.println("from P3(int)");
	}
	P3(float a)
	{
		this(20);
		System.out.println("fromP3intoo");
	}

	public static void main(String[] args) {
		P3 ob1=new P3();
		System.out.println("+++++++");
		P3 ob2=new P3(20);
		System.out.println("*****");
		P3 ob3=new P3(20.3f);
		
	}

}
