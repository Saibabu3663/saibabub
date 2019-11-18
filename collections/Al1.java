package com.collections;

import java.util.ArrayList;

public class Al1 {

	public static void main(String[] args) {
             ArrayList al=new ArrayList();
             System.out.println(al.size());
             System.out.println(al.isEmpty());
             al.add(10);
             al.add(20);
             al.add("appu");
             System.out.println(al);
             al.add(1, "saibabu");
             System.out.println(al);
             al.add("naveen");
             al.add("pavan");
             Object ob=al.set(1, "venkat");
             System.out.println(ob);
             System.out.println(al.add(20));
             System.out.println(al);
             System.out.println(al.indexOf(20));
             System.out.println(al.lastIndexOf(20));
             System.out.println(al.indexOf("teja"));
             System.out.println(al);
             System.out.println(al.isEmpty());
             al.clear();
             System.out.println(al.isEmpty());
             
	}

}
