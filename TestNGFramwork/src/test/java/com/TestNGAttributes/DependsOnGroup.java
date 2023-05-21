package com.TestNGAttributes;

import org.testng.annotations.Test;

public class DependsOnGroup {

	@Test(groups = {"Apple"})
	private void appleMarket() {
		System.out.println("Apple Market");
	}

	@Test(groups = {"Android"})
	private void androidMarker() {
		System.out.println("Android Market");

	}

	@Test(groups = {"Apple"})
	private void iphone() {
		System.out.println("iphone is apple os");
	}

	@Test(groups = {"Android"})
	private void samsung() {
		System.out.println("samsung is Android os");
	}

	@Test(groups = {"Android"})
	private void nothing() {
		System.out.println("Nothing is Android os");
	}

	@Test(groups = {"Apple"})
	private void ipad() {
		System.out.println("iPad is Apple os");
	}

	@Test(groups = {"Apple"})
	private void macbook() {
		System.out.println("Macbook is Apple os");
	}

}
