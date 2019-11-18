package com.iib;

class Loan {
	String name;
	double roi;
	String loanId;
	static int x;
	
	{
		++x;
		System.out.println("ICICIL"+x);
	}
	
	Loan()
	  {
		
	  }
	
	Loan(String name,double roi)
	{
		this.roi=roi;
		this.name=name;
	}
	void interest()
	{
		System.out.println(name+"is granted at"+
	        roi+"%");
	}
       public static void main(String[] args) {
		
    	 Loan l1=new Loan("vehicle loan",13.2);
    	 Loan l2=new Loan("Home loan",14.7);
    	 Loan l3=new Loan("Personal loan",15.6);
    	 Loan [] loan= {l1,l2,l3,new Loan("Car loan",2.5)};
    	 for(int i=0;i<loan.length;i++)
    	 {
    		 System.out.println(loan[i].name );
    		 System.out.println(loan[i].roi);
    	 }
	}
}
