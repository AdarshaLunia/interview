package com.example.generic;

public class SingleCast<T> {

	T objectT1;
	T objectT2;

	public SingleCast(T objectT1, T objectT2) {
		super();
		this.objectT1 = objectT1;
		this.objectT2 = objectT2;
	}

	public T getObjectT1() {
		return objectT1;
	}

	public void setObjectT1(T objectT1) {
		this.objectT1 = objectT1;
	}

	public T getObjectT2() {
		return objectT2;
	}

	public void setObjectT2(T objectT2) {
		this.objectT2 = objectT2;
	}
	
	

}
