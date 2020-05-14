package com.example.polymorphism;

// Runtime Polymorphism :
public class Test {

	public static void main(String a[]) {

		// Object of Parent class with Parent reference type.
		Parent parent1 = new Parent();
		// Object of Child class with Parent referece type.
		Parent parent2 = new Child();

		// This will invoke method() of Parent class.
		parent1.method();
		// This will invoke method() of Child class.
		parent2.method();
	}

}
