package com.staticmembers;

public class Demo11 {
	static boolean j;
	static
	{
		System.out.println("from Sib of Demo11");
	}

	public static void main(String[] args) {
		System.out.println("from main of Demo11");
		System.out.println(Demo10.i);

	}

}
