package com.practiceCastingFam;

public class Family {
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		
//		child  = (Child)parent;
		
		if (parent instanceof Child) {
			System.out.println("1");
		}
		
		
	}

}
class Parent{}
class Child extends Parent{}
