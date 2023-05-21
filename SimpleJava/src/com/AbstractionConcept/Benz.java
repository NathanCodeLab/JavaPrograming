package com.AbstractionConcept;

public class Benz implements Cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void start() {
		System.out.println("Button Start");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Button Stop");

	}

	@Override
	public void refule() {
		// TODO Auto-generated method stub
		System.out.println("Refule left" + st);

	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("Automatic" + wheels);

	}

	@Override
	public void milage() {
		// TODO Auto-generated method stub
		System.out.println("50" + mirror);

	}

}
