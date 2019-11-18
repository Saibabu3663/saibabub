package com.mislleneous;

public class A {
	 A(){
		 System.out.println("from A()");
	 }

	 A(int i)
	 {
		 this();
		 System.out.println("from A(int)");
	 }
	 A(int i,double d)
	 {
		 this();
		 System.out.println("from A double");
	 }
	public static void main(String[] args) {
		A ob=new A(10);

	}

}
