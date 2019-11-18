package com.abstraction;

public class ATMMachine {

	public static void main(String[] args) {
       ATM atm=new ATMImplementation();
       atm.deposite(5000);
       atm.checkBalance();
	}

}
