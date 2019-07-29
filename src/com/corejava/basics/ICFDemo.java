package com.corejava.basics;

public class ICFDemo {
	int i = 10;
	
	{
		m1();
		System.out.println("FIB");
	}
	
	ICFDemo() {
		System.out.println("DC ICFDemo");
	}
	
	public static void main(String[] args) {
		ICFDemo icfDemo = new ICFDemo();
		System.out.println("In ICFDemo main()");
	}
	
	public void m1() {
		System.out.println("In m1()");
	}
	
	{
		System.out.println("SIB");
	}
	
	int j = 20;
}
