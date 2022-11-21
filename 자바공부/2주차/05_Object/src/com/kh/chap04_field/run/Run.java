package com.kh.chap04_field.run;
	
//import java.lang.*;

import com.kh.chap04_field.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
//		FieldTest1 f1 = new FieldTest1(); // 객체 생성시 global 전역변수가 할당
//		
//		f1.test(109); // test메소드 호출시 num, local 변수 할당
//					  // test메소드 종료시 num, local 변수 소멸
//		
//		f1 = null; // 객체 소멸시 global 멤버변수 소멸
		
		//FieldTest2 f2 = new FieldTest2();
		
		//public -> 어디서든 직접접근 가능
		//System.out.println(f2.pub);
		
		//protected => 같은패키지에서는 직접접근가능, 
		//다른패키지에서는 직접접근 불가
		//System.out.println(f2.pro);
		
		//default => 같은패키지에서만 직접접근가능.
		//System.out.println(f2.df);
		
		//System.out.println(f2.pri);
		
		//System.out.println(FieldTest2.sta);
		
		System.out.println(Math.PI);
		
		FieldTest3.num = 500;
		System.out.println(FieldTest3.num);
		
		//상수필드 출력
		System.out.println(FieldTest3.NUM);
//		FieldTest3.NUM = 99; -> 값 변경 불가.
	}
	
	
	
	
	
	
	
	
	
	

}
