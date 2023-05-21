package com.AbstractionConcept;

public class AbstractionChild extends AbstractionParent {

	public static void main(String[] args) {
		AbstractionChild c = new AbstractionChild();
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
		System.out.println("Icici provides credits");

	}

	@Override
	public void accountType() {
		System.out.println("Icici provides savings and current");

	}

}
