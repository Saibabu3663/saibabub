package com.toString;

public class MainClass {

	public static void main(String[] args) {
		Employee ob1=new Employee(1,"appu", 13);
		Testie ob2=new Testie(2, "naveen", 12,"selenium");
		Testie ob3=new Testie(2, "naveen", 12,"selenium");
		Developer ob4=new Developer(3, "kalyan", 13, "Python");
		Developer ob5=new Developer(3, "kalyan", 13, "Python");
		
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob4);
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
		System.out.println(ob3.hashCode());
		System.out.println(ob4.hashCode());
		System.out.println(ob5.hashCode());
		System.out.println(ob1.equals(ob2));
		System.out.println(ob2.equals(ob3));
		System.out.println(ob4.equals(ob5));
		
		
		



	}

}
