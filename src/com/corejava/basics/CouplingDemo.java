package com.corejava.basics;

class A1 {
	static int i = B1.j;
}

class B1 {
	static int j = C1.m1();
}

class C1 {
	public static int m1() {
		return D1.k;
	}
}

class D1 {
	static int k = 10;
}
