package com.polymorphism;

public class MainClasss {

	public static void main(String[] args) {
       BANK bank;
       bank=new ICICI();
       System.out.println(bank.rateOfInterest());
       bank=new Canara();
       System.out.println(bank.rateOfInterest());
       bank=new SBI();
       System.out.println(bank.rateOfInterest());
       bank=new SBIInTouch();
       System.out.println(bank.rateOfInterest());
       
       
	}

}
