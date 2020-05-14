package com.example.generic;

public class BoxPrinter<T> {

	private T val;

	public BoxPrinter(T val) {
		super();
		this.val = val;
	}

	@Override
	public String toString() {
		return "BoxPrinter [val=" + val + "]";
	}
	
	
	
	
	
	
}
