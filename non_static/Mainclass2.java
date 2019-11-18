package com.non_static;

public class Mainclass2 {

	public static void main(String[] args) {
	A ob1=new A();
	B ob2=new B();
	System.out.println(ob1.d);
	System.out.println(ob2.d);
  ob1.d=15;
  ob2.d=13;
  System.out.println(ob1.d);
  System.out.println(ob2.d);

	}

}
