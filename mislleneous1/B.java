package com.mislleneous1;

public class B {
	int i;
	double j;
	boolean b;
	static B createObject()
	{
		return new B();
	}
	B initializing(int i,double j,boolean b)
	{
		this.i=i;
		this.j=j;
		this.b=b;
		return this;
		
	}
	B display()
	{
		System.out.println(this.i);
		System.out.println(this.j);
		System.out.println(this.b);
		return this;
	}

	public static void main(String[] args) {
		 B ob1=B.createObject();
		 ob1.initializing(10, 2.3, false);
		 ob1.display();
		 B.createObject().initializing(20, 20.5, true).display();
	}

}
