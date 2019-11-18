package com.staticmembers;

public class Staticp4 {
	static int i;

	public static void main(String[] args) {
		int i=20;
		System.out.println(i);
		System.out.println(Staticp4.i);
		m1();
	}
	public static void m1()
	{
		System.out.println(i);
	}
}
