package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		
		/*
		 * 모든 클래스는 Object클래스의 후손이다. 즉, 최상위 클래스는 항상 Object
		 * => Object상의 모든 메서드들을 사용가능 및 오버라이딩 가능
		 * 
		 */
		
		Book bk = new Book("수학의정석","홍성대",7000);
		/*
		 * 출력문 안에 레퍼런스 변수를 제시해서 출력하고자 할때
		 * 내부적으로 JVM이 자동으로 toString()메서드를 호출함
		 * 
		 * 부모클래스인 Object클래스에 있는 toString()
		 * 해당 레퍼런스타입의 풀클래스명 + @ + 해당객체의 주소값의 16진수
		 * 
		 * 자식클래스인 Book클래스에서 toString()메서드를 재정의
		 * 해당 객체의 모든 필드값을 하나의 문자열로 합쳐서 돌려주는 메서드로 재정의함.
		 * 
		 */
		System.out.println(bk);

	}

}
