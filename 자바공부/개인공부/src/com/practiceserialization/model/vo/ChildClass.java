package com.practiceserialization.model.vo;

public class ChildClass implements Serializationtest{
	
	private static final long serialVersionUID = 1L;
	private int a;
	private int b;
	
	public ChildClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChildClass(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public void printdata() {
		System.out.println("a+b =  " + a + " + " + b + " = " + (a+b) );
		
	}

}
