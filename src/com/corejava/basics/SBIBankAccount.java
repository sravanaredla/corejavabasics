package com.corejava.basics;

import java.util.ArrayList;

public class SBIBankAccount implements BankAccount {

	int accNo;
	String accHolderName;
	double balance;
	String personalInformation;
	static char accType = 's';
	
	SBIBankAccount() {
		
	}
	  SBIBankAccount(int accNo, String accHname, double balance, String pI) {
		  this.accNo = accNo; 
		  this.accHolderName = accHname; 
		  this.balance = balance;
		  this.personalInformation = pI; 
	  }
	 
	
    public final double withdraw(int accNo, double amount) {
		//
		this.balance = this.balance - amount;
		return 0.0;
	}
    
    public final void withdraw(double acNum, int amt) {
    	
    }
	
	public String deposit(int accNo, double amount) {
		//
		return "";
	}
	
	public String balanceEnquiry(int accNo) {
		//
		return "Balance is : "+balance;
	}
	
	public void fundsTransfer(int accNo1, int accNo2, double amount) {
		
	}
	
	public static void main(String[] args) {
		SBIBankAccount b = new SBIBankAccount();
		//b.balanceEnquiry(100);
	}

	@Override
	public String branch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String insurance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String loans() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String savingsBankAccount() {
		// TODO Auto-generated method stub
		return null;
	}
}

/*
 * class DematAccount extends SBIBankAccount { // }
 */
class SBIBank {
	public static void main(String[] args) {
		//BankAccount sravansBankAccount = new ICICIBankAccount();
		SBIBankAccount chaitanysBankAccount = new SBIBankAccount(1001, "Chaitanya", 10000, "USA");
		chaitanysBankAccount.personalInformation = "CAN";
		SBIBankAccount b1 = new SBIBankAccount(1002, "abc", 20000, "UK");
		
		//PersonalLoan personalLoan = new PersonalLoan();
		
		
		
		
		
		//sravansBankAccount.balanceEnquiry(1001);
		
		
		  System.out.println(chaitanysBankAccount.accNo);
		  System.out.println(chaitanysBankAccount.accHolderName);
		  System.out.println(chaitanysBankAccount.balance);
		  System.out.println(chaitanysBankAccount.personalInformation);
		 
		
		/*
		 * sravansBankAccount.accNo = 1001; sravansBankAccount.accHolderName = "Sravan";
		 * sravansBankAccount.balance = 10000; sravansBankAccount.personalInformation =
		 * "SBI>Hyderabad";
		 */
		
		/*
		 * System.out.println(sravansBankAccount.accNo);
		 * System.out.println(sravansBankAccount.accHolderName);
		 * System.out.println(sravansBankAccount.balance);
		 * System.out.println(sravansBankAccount.balanceEnquiry(sravansBankAccount.accNo
		 * ));
		 */
		
		ArrayList l = new ArrayList();
	}
}
