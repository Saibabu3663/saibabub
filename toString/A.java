package com.toString;

public class A {
	int i;
	A(){}
	A(int i)
	{
		this.i=i;
	}
	public static void main(String[] args) {
		A ob1=new A(100);
		A ob2=new A(1000);
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob1.i);
		System.out.println(ob2.i);
		
	}

}
