package com.staticmembers;

public class Staticp5 {
	static int i;

	public static void main(String[] args) {
		System.out.println("from main");
		System.out.println(i);
	}
	static 
	{
		System.out.println("from sib1");
		System.out.println(i);
		i=20;
	}

}
