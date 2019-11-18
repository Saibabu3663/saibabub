package com.non_static;

public class Demo2 {
	

	public static void main(String[] args) {
		Demo2 x= new Demo2();
		Demo2 y=x;
		System.out.println(x);
		System.out.println(y);
		System.out.println(x==y);

	}

}
