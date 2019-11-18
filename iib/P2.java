package com.iib;

public class P2 {
	int i;
	{
		System.out.println("from IIB");
	}
	P2()
	{
		System.out.println("FROM P2()");
	}
	P2(int i){
		System.out.println(this.i);
		this.i=i;
	}

	public static void main(String[] args) {
		System.out.println("main starts");
		P2 ob=new P2();
		System.out.println(ob.i);
		P2 obj=new P2(10);
				System.out.println(obj.i);
		
	}

}
