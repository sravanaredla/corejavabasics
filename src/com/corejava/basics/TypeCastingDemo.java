package com.corejava.basics;

public class TypeCastingDemo {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Object o = new String("sravan");
		Object o1 = new TypeCastingDemo();
		
		TypeCastingDemo s1 = (TypeCastingDemo)o;
		TypeCastingDemo t = (TypeCastingDemo)o1;
	}
	
}


