package com.mislleneous1;

 class MainClass {
	static void display(A x)
	{
		System.out.println(x.i);
		System.out.println(x.j);
		System.out.println("*******");
	}
	public static void main(String[] args) {
		A ob1=new A(20,23.5);
		A ob2=new A(60,8.9);
		display(ob1);
		display(ob2);
		
		
	}

}
