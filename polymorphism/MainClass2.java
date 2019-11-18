package com.polymorphism;

public class MainClass2 {

	public static void main(String[] args) {
       BANK [] b=new BANK[5];

       b[0]=new ICICI();
       b[1]=new Canara();
       b[2]=new SBI();
       b[3]=new SBIInTouch();
       b[4]=new BANK();
       for (BANK bank:b)
       {
    	   System.out.println(bank.rateOfInterest());
       }
	}

}
