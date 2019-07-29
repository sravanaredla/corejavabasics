package com.corejava.basics;

public class B {
	public void m1() {
		System.out.println("In class B m1()");
	}
	
	private void m3() {
		System.out.println("In class B m3()");
	}
	
	public static void main(String[] args) {
		B b = new B();
	}
}

class C extends B {
	public void m2() {
		
	}
	
	public void m1(int i) {
		
	}
	
	public void m1(int i, int j) {
		
	}
	
	public void m1(int i, int j, int k) {
		
	}
	
	public void m1(int... a) {
		
	}
	
	public void m1() {
		System.out.println("In class C m1()");
	}
	
}

class Test {
	public static void main(String[] args) {
		B b = new C();

		b.m1();
		//b.m1(10);
		//b.m2();
		C c = new C();
		c.m1();
		c.m1(10);
		c.m1('c');
		//c.m1("sravan");
		c.m2();
		
		c.m1();
	}
}