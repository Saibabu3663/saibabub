package com.abstraction;

class ATMImplementation implements ATM {
       long balance;
       public void deposite(long depositeAmount)
       {    if(depositeAmount>0)
    	  balance=balance + depositeAmount; 
       
       else
    	   System.out.println("try again");
       }
       public long checkBalance()
       {
    	   System.out.println(balance);
    	   return balance;
    	   
       }
       public void withdrawal(long withdrawalAmount)
       {
    	   if(balance>withdrawalAmount) {
        balance=balance-withdrawalAmount;
    	   System.out.println("Withdrawal is successful");
       }
       }
}

