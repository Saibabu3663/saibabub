package com.downcasting;

public class MainClass {

	public static void main(String[] args) {
		A ob1=new A(20);
		display(ob1);
		B ob2=new B(10,30);
		A ob3=ob2;
		display(ob3);
		B ob4=new B(40,50);
		display(ob4);
		B ob5=new C(60,70,80);
		A ob6=new C(90,100,60);
		display(ob6);
		C ob7=new C(120,130,140);
		display(ob7);
	}
	static void display(A obj)
	{
		System.out.println(obj.i);
		if(obj instanceof B)
		{
			B ob=(B) obj;
			System.out.println(ob.j);
		}
		if(obj instanceof C)
		{
			C ob1=(C) obj;
			System.out.println(ob1.k);
		}
		System.out.println("******");
	}

}
