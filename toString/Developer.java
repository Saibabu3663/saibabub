package com.toString;

public class Developer extends Employee{
	String language;
	public Developer() {
	}
	Developer(int id,String name,double salary,String language) {
		super(id,name,salary);
		this.language = language;
	}
	public String toString()
	{
	   return	super.toString()+" "+language;
	}
	public boolean equals(Object ob)
	{    Developer ab=(Developer)ob;
	      return super.equals(ab)&& language.equals(ab.language) ;
		
	}
	public int hashCode()
	{
		int  de=super.hashCode()+language.hashCode();
		return  de;
	}
	

}
