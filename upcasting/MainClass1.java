package com.upcasting;

public class MainClass1 {

	public static void main(String[] args) {
          A ob=new C();
          System.out.println(ob.i);
          //System.out.println(ob.k);CTE
          //System.out.println(ob.j);CTE
          B ob1=new C();
          System.out.println(ob1.i);
          System.out.println(ob1.j);
         // System.out.println(ob1.k);CTE
          C ob2=new C();
          System.out.println(ob2.i);
          System.out.println(ob2.j);
          
	}

}
