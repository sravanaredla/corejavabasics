package com.corejava.basics;

public class SCFTest {
	
	static int x = 10; // x is identified 
	
	static {
		m1();
		System.out.println("Ïn FSB");
	}
	
	public static void main(String[] args) {
		m1();
		System.out.println("Main method");
	}
	
	public static void m1() {
		System.out.println(y);
	}
	
	static {
		System.out.println("In SSB");
	}
	
	static int y = 20;
}

class SCFChild extends SCFTest {
	
}
