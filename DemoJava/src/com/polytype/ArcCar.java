package com.polytype;

public class ArcCar extends Skoda {

	public static void main(String[] args) {
		ArcCar a=new ArcCar();  // static polymorphism // compile time polymo
		
		a.startButton();
		a.stopButton();
		a.refule();
		a.engine();
		a.seatVent();
		
		
		System.out.println("++++++++++++++++++");
		Volks b= new Volks();
		b.startButton();
		b.stopButton();
		b.refule();
		b.engine();
		b.seat();
		
		
		
		
		Volks v= new ArcCar(); // dynamic polymor// run time 
		
		v.startButton();
		v.stopButton();
		v.refule();
		v.engine();
		v.seat();
		
		
		
		
	}

}
