package com.oop.polymophism;

public class test{

	public static int add (int a, int b) {
		return a + b;
	}
	
	public static double add (double a, double b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		
		Car car = new Audi();
		car.run();
		
	}

}
