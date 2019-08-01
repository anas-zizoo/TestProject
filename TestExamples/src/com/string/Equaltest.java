package com.string;

public class Equaltest {
	
	public static void main(String[] args) {
		String s1 = new String("ABCD");
		String s2 = new String("ABCD");
		
		if(s1==s2)
			System.out.println("s1=s2: true");
		else
			System.out.println("s1 = s2: false");
		
		if(s1.equals(s2))
			System.out.println("s1 equal s2: true");
		else
			System.out.println("s1 eqaul s2: false");
		
		String s3 = s2;
		if(s3==s2)
			System.out.println("s3=s2: true");
		else
			System.out.println("s3 = s2: false");
		
		if(s3.equals(s2))
			System.out.println("s3 equal s2: true");
		else
			System.out.println("s3 eqaul s2: false");
		
		String s4 = "ABCD";
		String s5 = "ABCD";
		if(s4==s5)
			System.out.println("s4=s5: true");
		else
			System.out.println("s4 = s5: false");
		
		if(s4.equals(s5))
			System.out.println("s4 equal s5: true");
		else
			System.out.println("s4 eqaul s5: false");
	
		System.out.println("Change in string");
	}

}
