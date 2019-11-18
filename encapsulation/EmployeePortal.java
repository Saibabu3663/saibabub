package com.encapsulation;

public class EmployeePortal {

	public static void main(String[] args) {
        Employee emp=new Employee(1, "sai", 10);
        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
        System.out.println("********");
        emp.setSalary(52);
        System.out.println(emp.getSalary());
	}

}
