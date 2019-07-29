package com.corejava.basics;

public class NativeDemo {
	static {
		System.loadLibrary("../nativelibraryPath");
	}
	
	public native void m1();
}

class Client {
	public static void main(String[] args) {
		NativeDemo n = new NativeDemo();
		n.m1();	
	}
}
