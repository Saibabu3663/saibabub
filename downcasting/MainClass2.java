package com.downcasting;

public class MainClass2 {

	public static void main(String[] args) {
		A ob1=new A(10);
		display(ob1);
		A ob2=new B(20,30);
		display(ob2);
		//b ob3=new C(40,60);
		A ob4=new C1(60,70);
		display(ob4);
		C1 ob5=new C1(80,90);
		 display(ob5);
		 B ob6=new B(100,110);
		 display(ob6);
		 
		
	}
	static void display(A obj)
	{
		System.out.println(obj.i);
		if(obj instanceof B)
		{
			B ob=(B)obj;
			System.out.println(ob.j);
		}
		if (obj instanceof C1)
		{
			C1 ob=(C1) obj;
			System.out.println(ob.k);
		}
		System.out.println("------------");
	}

}
