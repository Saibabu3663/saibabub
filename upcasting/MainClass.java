package com.upcasting;

public class MainClass {

	public static void main(String[] args) {
         A ob1= new B();
         System.out.println(ob1.i);
        // System.out.println(ob1.j);CTE :because ref.ver is
         //parent type so we can not access members of child classs
         B ob2= new B();
         A ob3=ob2;
         System.out.println(ob2.i);
         System.out.println(ob2.j);
         System.out.println(ob3.i);
        // System.out.println(ob3.j);:CTE
         
	}

}
