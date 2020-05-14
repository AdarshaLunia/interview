package com.example.generic;

public class PairCast<T1, T2> {

	T1 objectT1;
	T2 objectT2;

	public PairCast(T1 objectT1, T2 objectT2) {
		super();
		this.objectT1 = objectT1;
		this.objectT2 = objectT2;
	}

	public T1 getObjectT1() {
		return objectT1;
	}

	public void setObjectT1(T1 objectT1) {
		this.objectT1 = objectT1;
	}

	public T2 getObjectT2() {
		return objectT2;
	}

	public void setObjectT2(T2 objectT2) {
		this.objectT2 = objectT2;
	}

	
}
