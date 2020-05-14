package com.example.polymorphism;

public class Loin extends Animal implements Running{

	@Override
	public void run() {
		System.out.println("Loin is Running");
		
	}
	
	@Override
	public void name() {
		
		super.name();
		
		System.out.println("This is Loin");
	}

}
