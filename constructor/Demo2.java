package com.constructor;

public class Demo2 {

	Demo2()
	{
		System.out.println("from Demo2");
	}
	public static void main(String[] args) {
		System.out.println("from main");
		Demo2  ob1=new Demo2();
		System.out.println("******");
         Demo2 ob2=new Demo2();
         System.out.println("end main");
	}

}
