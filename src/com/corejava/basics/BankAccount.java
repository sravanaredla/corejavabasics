package com.corejava.basics;

public interface BankAccount extends Bank {
	double withdraw(int accNo, double amount);
	
	String deposit(int accNo, double amount);
	
	String balanceEnquiry(int accNo);
	
	void fundsTransfer(int accNo1, int accNo2, double amount);
	
}

interface Bank {
	String branch();
	String insurance();
	String loans();
	String savingsBankAccount();
}
