package com.nit.sj.sbeans;

public class A {
	
	// Has A Property
	private B b;

	public void setB(B b) {
		this.b = b;
	}

	public A() {
		System.out.println("A.A()");
	}
	
	@Override
	public String toString() {
		return "From A";
	}
	
	
}
