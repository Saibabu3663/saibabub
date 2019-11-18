package com.constructor;

public class Movie {
	String name;
	double rating;
	int yearOfRelease;
	Movie(String name,double rating,int yearOfRelease)
	{
		this.name=name;
		this.rating=rating;
		this.yearOfRelease=yearOfRelease;
	}

	public static void main(String[] args) {
		Movie ob1=new Movie("saaho",4.5,2019);
		
		System.out.println("name: "+ob1.name+"  rating: "+ob1.rating+"  yearOfRelease:  "+ob1.yearOfRelease);

	}

}
