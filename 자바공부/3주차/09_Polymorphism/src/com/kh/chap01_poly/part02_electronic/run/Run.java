package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicController1;
import com.kh.chap01_poly.part02_electronic.controller.ElectronicController2;
import com.kh.chap01_poly.part02_electronic.model.vo.*;

public class Run {
	// 납품업체
	public static void main(String[] args) {
//		// 1. 메서드의 매개변수에 다형성(부모타입 레퍼런스로 자식객체를 받아줌)을 적용시키기전.
//		ElectronicController1 ec = new ElectronicController1();
//		// 생성과 동시에 이 클래스의 필드값(desk, tab, note)들이 메모리 영역에 null 값으로 추가됨
//		
//		//Desktop d = new Desktop("삼성","데탑",800000,"Geforce 1070");
//		ec.insert(new Desktop("삼성","데탑",800000,"Geforce 1070"));
//		ec.insert(new NoteBook("LG","그램",1500000,4));
//		ec.insert(new Tablet("애플","아이패드",600000, true));
//		
//		Desktop d = ec.selectDesktop();
//		NoteBook n = ec.selectNoteBook();
//		Tablet t = ec.selectTablet();
//		
//		System.out.println(d);
//		System.out.println(n);
//		System.out.println(t);
		
		
		// 2. 다형성을 적용한 후
		ElectronicController2 ec = new ElectronicController2();
		
		ec.insert(new Desktop("삼성","데탑",999999,"geforce 1070"), 0);
		ec.insert(new NoteBook("엘지","그램",2000000,4), 1);
		ec.insert(new Tablet("애플","아이패드",500000,true), 2);
		
//		for(int i = 0 ; i < 3; i++) {
//			System.out.println(ec.select(i));
//		}
		
		for(Electronic x : ec.select()) {
			System.out.println(x);
		}
		
		/*
		 * 다형성을 사용하는 이유
		 * 1. 부모타입의 객체배열로 다양한 자식들을 받아 줄 수 있음.
		 * => 부모타입 하나만으로 다양한 자식객체들을 다룰 수 있음
		 * 
		 * 2. 메서드의 매개 변수나 반환형에 다형성을 적용하게 되면 메서드 갯수가 확 줄어든다.
		 *  
		 */
	}

}
