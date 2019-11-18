package com.staticmembers;

public class Main {

	public static void main(String[] args) {
		System.out.println(Marker.price);
		System.out.println(Marker.colour);
		Marker.price=100;
		Marker.colour="green";
				Marker.price=80;
		Marker.colour="yellow";
		Marker.writing();
	}

}
