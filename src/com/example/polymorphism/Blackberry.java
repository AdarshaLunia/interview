package com.example.polymorphism;

public class Blackberry extends Mobile {
	// Constructor to set properties/characteristics of object
	Blackberry(String man, String o, String m, int c) {
		super(man, o, m, c);
	}

	public String getModel() {
		return "This is Blackberry-" + model;
	}
}
