
package com.polymorphism;

public class Main3 {
	static void display(BANK bank)
	{
		System.out.println(bank.rateOfInterest());
	}

	public static void main(String[] args) {
		BANK b1;
		b1=new ICICI();
		display(b1);
		b1=new Canara();
		display(b1);
         
	}

}
