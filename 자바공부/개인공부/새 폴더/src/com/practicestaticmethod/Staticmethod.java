package com.practicestaticmethod;
class Mother {
	static void test() {
		System.out.println("스테틱메서드 테스트");
	}
}

class Son extends Mother{
	
}


public class Staticmethod {

	public static void main(String[] args) {
		Son m = new Son();
		Mother.test();

	}

}
