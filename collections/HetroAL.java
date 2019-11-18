package com.collections;

import java.util.ArrayList;

public class HetroAL {

	public static void main(String[] args) {
	   ArrayList hetro= new ArrayList();
	   hetro.add(new Bike("Orange", 56));
	   hetro.add(new Movie("KGF", 5));
	   hetro.add(new Emp(1, "sai"));
	   hetro.add(10);
	   System.out.println(hetro);
	   for(int i=0;i<hetro.size();i++)
	   {
		   Object x= hetro.get(i);
		   if(x instanceof Bike)
		   {
			   System.out.println(((Bike)x).color);
			   System.out.println(((Bike)x).mileage);
		   }if(x instanceof Movie)
		   {
			   System.out.println(((Movie)x).name);
			   System.out.println(((Movie)x).rating);
		   }
		   if(x instanceof Integer)
		   {
			   Integer k= (Integer)x;
			   int y=k;
			   System.out.println(y+6);
			   System.out.println((Integer)x+12);
		   }
	   }

	}

}
