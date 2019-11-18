package com.staticmembers;

public class Demo10 {
	static int i;
	static
	{
		System.out.println("from Sib-1 of Demo10");
	}

	public static void main(String[] args) {
		System.out.println("from main of Demo10");
		System.out.println(Demo11.j);
		
	}

}
