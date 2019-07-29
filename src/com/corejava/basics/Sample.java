package com.corejava.basics;

public class Sample {
	public static void main(String[] args) {
		Sample s = new Sample();
		s.m1();
	}
	
	void m1() {
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			System.out.println("kkkk");
		} catch (ArithmeticException ex) {
			
		}
		m2();
	}
	
	void m2() {
		m1();
		System.out.println(10/0);
	}
}

class Sample1 {
	public static void main(String[] args) {
		System.out.println("stat1");
		try {
			System.out.println(10/0);
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("stat2");
	}
}
