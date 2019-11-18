package com.iib;

class Books {
	String name;
	int isbn;
	int price;
	Books()
	{
		
	}
	Books(String name,int isbn, int price)
	{
		this.name=name;
		this.isbn=isbn;
		this.price=price;
		
	}
	void genere(String type)
	{
		System.out.println(name+ " is in  "+ type+"   genere");
	}
	

}
