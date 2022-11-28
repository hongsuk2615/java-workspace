package com.kh.chap02_abstrcatAndInterface.part02_family.run;

import com.kh.chap02_abstrcatAndInterface.part02_family.model.vo.*;

public class Run {

	public static void main(String[] args) {
		//인터페이스 적용시키기 전
//		Person[] p = new Person[2];
//		
//		p[0] = new Mother("엄마", 60, 60, "출산");
//		p[1] = new Baby("아기", 3.5, 60);
//		
//		System.out.println(p[0]);
//		System.out.println(p[1]);
//		
//		p[0].eat();
//		p[1].eat();
//		p[0].sleep();
//		p[1].sleep();
//		
//		System.out.println(p[0]);
//		System.out.println(p[1]);
		
		//인터페이스 적용후
		
		Basic[] b = new Basic[2];
		b[0] = new Mother("엄마", 60, 60, "출산");
		b[1] = new Baby("아기", 3.5, 60);
		
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		b[0].eat();
		b[1].eat();
		b[0].sleep();
		b[1].sleep();
		
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		/*
		 * 클래스에서 클래스 상속 받을 때 : extends 클래스(단일 상속만 가능) : 화살표 실선
		 * 클래스에서 인터페이스를 구현 할 때 : implements 인터페이스, 인터페이스(다중구현) : 화살표 점선
		 * 인터페이스에서 인터페이스 상속 : extends 인터페이스,인터페이스(다중상속) : 화살표 실선
		 * 
		 * 
		 * extends 일반클래스 -> extends 추상클래스 -> implements  인터페이스
		 * 뒤로갈수록 강제성이 짙어짐
		 * 
		 */
		
		
	}

}
