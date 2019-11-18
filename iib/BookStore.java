package com.iib;

public class BookStore {

	public static void main(String[] args) {
	Books b1=new Books("the silent Patient",151,500);
	Books b2=new Books("The girl on the Train",152,550);
	Books b3=new Books("Lee jack",153,700);
	Books b4=new Books("In a Dark,Dark wood",154,750);
	Books b5=new Books("the night fire",155,800);
    Books [] shelve= {b1,b2,b3,b4,b5};
    
	
	
	    for(int i=0;i<shelve.length;i++)
	    	
	    {
	    	System.out.println("name of the book is  "+shelve[i].name);
	    	System.out.println("isbn :"+shelve[i].isbn);
	    	System.out.println("price is "+ shelve[i].price);
	    	shelve[i].genere("thriller");
	    }
	    for(Books a: shelve)
	    {
	    	System.out.println("name of the book is  "+a.name);
	    	System.out.println("isbn :"+a.isbn);
	    	System.out.println("price is "+ a.price);
	    	a.genere("thriller");
	    }
	}

}
