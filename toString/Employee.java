package com.toString;

public class Employee {
	int id;
	String name;
	double salary;
	public Employee() {
	}
	Employee(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public String toString()
	{
		return id+" "+name+" "+salary;
	}
	public boolean equals(Object ob)
	{  Employee temp=(Employee)ob;
		return this.id==temp.id&&this.salary==temp.salary&&this.name.equals(temp.name);
	}
	public int hashCode()
	{
		int hc=id+(int)salary+name.hashCode();
		return hc;
	}

}
