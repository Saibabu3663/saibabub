package com.constructor;

public class Demo4 {
	Demo4()
	{
		System.out.println("from Demo4");
	}
	Demo4(int i)
	{
		System.out.println("from Demo4int");
	}
	Demo4(int i,int a)
	{
		System.out.println("from Demo4intd");
	}
	

	public static void main(String[] args) {
		Demo4 ob1=new Demo4();
		Demo4 ob2=new Demo4(10);
		Demo4 ob3=new Demo4(15,8);
		

	}

}
