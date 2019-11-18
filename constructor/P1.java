package com.constructor;

 class P1 {
	 int i;
	 P1()
	 {
		 System.out.println(this);
	 }

	public static void main(String[] args) {
		P1 ob=new P1();
		System.out.println(ob);
		P1 ob1=new P1();
		System.out.println(ob1);
	}

}
