package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.*;

public class PolyRun {

	public static void main(String[] args) {
		/*
		 * 명심할 사항 : '=' 대입연산자 기준으로 왼쪽과 오른쪽의 자료형은 "항상"같아야함
		 * 
		 * 1. 부모타입 레퍼런스 변수로 부모타입 객체를 다루는 것 = 당연히 가능하다.
		 */
		System.out.println("1. 부모타입 레퍼런스 변수로 부모객체를 다루는 경우");
		Parent p1 = new Parent();
		p1.printParent();
		// p1 레퍼런스 변수로 Parent에만 접근 가능

		// 2. 자식타입 레퍼런스 변수로 자식 객체를 다루는 경우
		System.out.println("2. 자식타입 레퍼런스변수로 자식객체를 다루는 경우");
		Child1 c1 = new Child1(); // 기본생성자에 슈퍼생성자호출하는 구문이 항상있음. 따라서 부모객체 사용가능
		c1.printChild1();
		((Parent)c1).printParent();
		//c1 레퍼런스 변수로 Parent(부모), Child1(자식)에 있는 필드나 메서드 둘다 접근가능.
		//c1 레퍼런스 변수가 Parent에 있는 메서드에 접근시 자동으로 형변환된 채 진행됨.
		//즉 자식에서 부모클래스 자동형변환(업캐스팅). -> 작은것에서 큰것으로 형변환 된것과 같은 이치.
		
		//3. 부모타입 레퍼런스 변수로 자식 객체를 다루는 경우(다형성)
		System.out.println("3. 부모타입 레퍼런스 변수로 자식 객체를 다루는 경우(다형성 적용된 개념)");
		Parent p2 = /* (Parent) */ new Child1();
		
		/* 
		 * 양쪽의 자료형이 다른데도 불구하고 오류 발생 x
		 * Parent형으로 '자동형변환'이 되고 있기 때문.
		 * 상속구조에서는 클래스 형변환이 가능하다.
		 * 
		 */
		
		p2.printParent(); // p2라는 레퍼런스 변수로는 Parent에만 접근가능
		((Child1)p2).printChild1(); // 단, 자식객체로 접근하고 싶을때 Child1형으로 강제형변환후 Child1에 접근가능
		
		/*
		 * 클래스간에 형변환 가능(단, 상속구조일 경우에만)
		 * 
		 * 1.UpCasting
		 * 자식타입 -> 부모타입으로 형변환
		 * 생략가능(자동형변환 개념)
		 * ex) 자식객체.부모메서드(); -> ((부모객체)자식객체).부모메서드();
		 * 
		 * 2.DownCasting
		 * 부모타입 -> 자식타입으로 형변환
		 * 생략불가능(강제형변환)
		 * ex) ((자식)부모).자식메서드();
		 * 
		 * 다형성을 쓰는 이유
		 * -부모타입으로부터 파생된 여러가지 타입의 자식객체들을 부모클래스 타입 하나로 다룰수 있음.
		 * 
		 * 
		 * 다형성의 장점
		 * 
		 * 다형성 배우기전
		 * Child1 객체 2개
		 * Child2 객체 2개
		 * 객체 배열을 이용하기 
		 * 
		 */
		Child1 [] arr1 = new Child1[2];
		arr1[0] = new Child1(1,2,3);
		arr1[1] = new Child1(4,5,6);
		
		Child2 [] arr2 = new Child2[2];
		arr2[0] = new Child2(5,5,5);
		arr2[1] = new Child2(7,7,7);
		
		// 단, 다형성이 적용되면 부모타입 레퍼런스 변수로 모든 자식 객체를 다 받아줄 수 있다.
		System.out.println("===== 다형성 접목한 객체 배열 =====");
		Parent [] arr = new Parent[4];
		arr[0] = new Child1(1,2,3);
		arr[1] = new Child2(4,5,6);
		arr[2] = new Child1(8,8,8);
		arr[3] = new Child2(9,9,9);
		
		// 하나의 부모타입으로 모든 자식 객체들을 받을 수 있음 => 편리, 코드수 감소, 생산성이 증대.
		((Child1)arr[0]).printChild1();
		((Child2)arr[1]).printChild2();
		((Child1)arr[2]).printChild1();
		((Child2)arr[3]).printChild2();
		
		System.out.println("===== 반복문을 활용해서 출력해보기 =====");
		for(int i = 0 ; i < arr.length ; i++) {
			//instanceof 연산자  : 현재 참조하고 있는 레퍼런스 변수가 실제로 어떤 클래스(객체)타입을 참조하고 있는지 판별.
			//반환값 -> true, false
//			if (arr[i] instanceof Child1) {
//				((Child1)arr[i]).printChild1();
//			}else {
//				((Child2)arr[i]).printChild2();
//			}
			// 단 오버라이딩을 이용하면 굳이 형변환도 안해도됨.
			arr[i].print();
			/*
			 * 동적 바인딩 : 프로그램이 실행되기전에 자동으로 컴파일 되면서 정적으로 현재 레퍼런스 변수의 메서드를 가리키게됨.
			 * 단, 참조하고 있는 자식클래스에 해당 메서드가 오버라이딩 되어 있다면
			 * 프로그램을 시작할때는 동적으로 그 자식클래스의 오버라이딩된 메서드를 찾아서 실행하게 됨.
			 */
		}
	}

}
