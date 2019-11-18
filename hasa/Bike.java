package com.hasa;

public class Bike {
	Engine e= new Engine(200);
	String colour;
	double milege;
	Bike()
	{
		
	}
	Bike(double milege,String colour)
	{
		this.milege=milege;
		this.colour=colour;
	}

}
