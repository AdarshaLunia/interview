package com.example.polymorphism;

public class CompiletimeDemo {

	public void method() {
		System.out.println("Method with no parameter.");
	}

	public void method(String name) {
		System.out.println("Method with single parameter.");
	}

	public void method(String... name) {
		System.out.println("Method with dynamic parameter");
	}

	public static void main(String a[]) {
		CompiletimeDemo compile = new CompiletimeDemo();
		compile.method();
		compile.method("First Name");
		compile.method("First name", "Last name");
	}

}
