package com.toString;

public class Testie extends Employee {
	String tool;
	public Testie() {
	}
	Testie(int id , String name,double salary,String tool) {
		super(id,name,salary);
		this.tool = tool;
	}
	public String toString()
	{
		return super.toString()+" "+tool;
	}
	public boolean equals(Object ob)
	{    Testie hc=(Testie)ob;
	      return super.equals(hc)&&tool.equals(hc.tool) ;
		
	}
	public int hashCode()
	{
		int  de=super.hashCode()+tool.hashCode();
		return  de;
	}
	
	

}
