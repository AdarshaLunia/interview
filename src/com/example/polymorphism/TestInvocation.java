package com.example.polymorphism;

public class TestInvocation {

	public static void main(String[] a) {

		Loin loin = new Loin(); // Since Its Loin itself
		Animal animal = new Loin(); // Since Loin is extends Animal
		Running running = new Loin(); // Since Horse implements Running
		Object object = new Loin(); // All java class is subclass of Object

		// Invoking name() method.
		loin.name();
		
		animal.name();

		System.out.println("*******");
		
		// Invoking run() method.
		loin.run();
		running.run();
		
		System.out.println("********");

		// Invoking parentMethod()
		loin.parentMethod();
		animal.parentMethod();
		

	}

}
