package com.corejava.basics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class TransientDemo implements Serializable {
	
	int i=10;
	transient int j=20;
	int k=30;
	
	public static void main(String[] args) throws Exception {
		TransientDemo t1 = new TransientDemo();
		
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t1);
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		TransientDemo t2 = (TransientDemo)ois.readObject();
		
		System.out.println(t2.i);
		System.out.println(t2.j);
		System.out.println(t2.k);
	}

}
