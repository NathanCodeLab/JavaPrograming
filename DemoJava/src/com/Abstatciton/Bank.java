package com.Abstatciton;

public abstract class Bank {
	
	
	
	public abstract void debit() ;
	public abstract void credit() ;
	public abstract void accountType() ;
	
	public void wallet() {
		
		System.out.println("Open Wallet Account");
		int minBalance=1000;
		System.out.println("have to maintaine min balcnce");
		
	}
	
	
	
	
	
	
	
	
	
	/*public void debit() {
		System.out.println("bank provides ");

	}
	public void credit() {

	}
	public void wallet() {

	}
	public void accountType() {
		
	}
	
	
*/
}
