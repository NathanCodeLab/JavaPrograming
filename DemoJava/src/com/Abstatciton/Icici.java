package com.Abstatciton;

public class Icici extends Bank {
	
	
	
	
	
	

	public static void main(String[] args) {
		Icici c=new Icici();
		c.debit();
		c.credit();
		c.accountType();
	}

	@Override
	public void debit() {
System.out.println("Icici provides debit");		
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("Icici provides credits");		
		
	}

	@Override
	public void accountType() {
		// TODO Auto-generated method stub
		System.out.println("Icici provides savings and current");		
		
	}
	

}
