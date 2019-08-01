package com.singleton;

public class Driver {
	public static void main(String[] args) {
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		
		x.s = (x.s).toUpperCase();
		
		System.out.println("String from x: " + x.s);
		System.out.println("String from y: " + y.s);
		System.out.println("String from z: " + z.s);
		
	}
}
