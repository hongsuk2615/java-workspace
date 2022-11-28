package com.kh.chap02_abstrcatAndInterface.part02_family.model.vo;

public interface Basic {
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	int num = 10;
	//public static final이 정의되어 있음
	//상수 필드만 정의 가능
	
	void eat();
	void sleep();
	// 인터페이스에서는 추상메서드만 정의할 수 있기때문에 메서드의 몸통부 작성이 불가능하며
	// 자동으로 public abstract가 정의되어 있음.

}
