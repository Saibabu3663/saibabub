package com.toString;

public class B {
	int i;
	B(int i)
	{
		this.i=i;
	}
	
	public String toString() {
		return "i  "+i;
		
	}
	public static void main(String[] args) {
		B ob1=new B(100);
		B ob2=new B(200);
		System.out.println(ob1);
		System.out.println(ob2);
		
		
	}

}
