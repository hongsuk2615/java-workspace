package com.kh.chap02.loop;

import java.util.Random;
import java.util.Scanner;

public class A_For {
	/*
	 * 반복문
	 * 프로그램의 흐름을 제어하는 제어문중 하나
	 * 어떤 실행코드를 반복적으로 수행시켜줌
	 * 
	 * 크게 두종류로 나뉨(for문, while문(do~while))
	 * 
	 * [표현법]
	 * for (초기식; 조건식; 증감식){
	 * 		반복적으로 실행시키고자하는 코드;
	 * }
	 * 초기식 : 반복문이 시작될 때 "초기에 딱 한번만 실행"되는 구문
	 * 		  (반복문에서 사용할 변수를 선언 및 초기화 할때 사용)
	 * 조건식 : 반복문이 수행될 조건을 작성하는 구문
	 * 		  조건식의 결과가 true이면 반복문 실행
	 * 		  조건식의 결과가 false이면 반복문 멈추고, 빠져나옴
	 * 		  (보통 초기식에 제시된 변수를 가지고 조건식을 작성)
	 * 증감식 : 반복문을 제어하는 변수값을 증감시키는 구문
	 * 	      (보통 초기식에 제시된 변수를 가지고 증감식을 작성)
	 * 		  ex) i++ i--
	 * 
	 * for문을 만나는 순간
	 * 초기식 -> 조건식(조건검사) -> true일 경우 실행할 코드 실행 -> 증감식
	 *      -> 조건식(조건검사) -> true일 경우 실행할 코드 실행 -> 증감식
	 *      -> 조건식(조건검사) -> true일 경우 실행할 코드 실행 -> 증감식
	 *      ...
	 *      -> 조건식(조건검사) -> false일 경우 실행할 코드 실행x
	 * 매번 조건식의 조건검사 결과값을 가지고 조건이 true일 경우만 반복해서 실행한다. 
	 * 
	 * 알아둘것 : 
	 * for문안에 초기식, 조건식, 증감식 각각 생략이 가능하긴함. 단, 반드시 ;은 작성해줘야함.
	 */
	
	public void method1() {
		//"안녕하세요"를 5번 반복해서 출력하고 싶은 경우.
		for (int i = 0; i < 5; i++) {
			System.out.println("안녕하세요");
		}
		
//		for(;;) { // 초기식, 조건식, 증감식이 없더라도 문법적 오류는 아님. 다만 무한반복으로 실행된다.
//			System.out.println("야호");
//		}
		
		for (int i = 11; i < 16; i++) {
			System.out.println("무야호~");
		}
		
		for (int i = 0 ; i < 10 ; i+=2) {
			System.out.println("반갑습니다요");
		}
		
	}
	
	public void method2() {
		//1~5까지 출력
		// 1값이 1에서부터 6보다 작을때까지 1씩 증가, 감소할동안 반복 수행
		// 1 2 3 4 5 
		
		for(int i = 1 ; i < 6; i++) {
			System.out.print(i +" ");
		}
		
		System.out.println();
		
		for(int i = 5 ; i>0;i--) {
			System.out.print(i + " ");
		}
	}
	
	public void method3() {
		// i 값이 1에서부터 10사이의 홀수만 출력
		for (int i = 0; i < 11; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		
	}
	
	public void method4() {
		//1 2 3 4 5 6 7 8 9 10
		for(int i = 0 ; i <=9 ; i++) {
			System.out.print((i+1)+" ");
		}
	}
	//산술연산 + 반복문
	public void method5() {
		//1~10까지의 총 합계
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 총 합계 : " + sum);
	}
	
	public void method6() {
		//1에서부터 사용자가 입력한 숫자까지 모두 더해서 출력해보기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양수 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		if (num > 0) {
			for (int i = 1; i < num + 1; i++) {
				sum += i;
			}
			System.out.println("1부터 " +num+"까지의 총 합계 : "+ sum);
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void method7() {
		//1부터 매번 달라지는 랜덤값(1~10사이의 랜덤함 정수)까지의 총합계
		/*
		 * java.lang.Math 클래스에 이미 정의되어있는 random()메서드를 호출하여
		 * 매번 다른 랜덤값을 얻어올 수 있음
		 * 
		 * java 파일은 java.lang을 이미 import 하고있음
		 * 
		 * static -> 객체 시간에 자세히 다뤄볼 예정
		 * 
		 * random() : 0.0 ~ 0.99999999999999 사이의 랜덤값 발생
		 * 0.0 <= 랜덤값 < 1.0
		 * [표현법]
		 * Math.random() * 출력하고자하는 갯수 + 시작하고싶은수
		 * 시작수 ~ (시작수 + 출력하고자하는 갯수)
		 */
		
		int random = (int)(Math.random()*10 + 1);
		int sum =0;
		for(int i = 1 ; i < random + 1 ; i++) {
			sum += i;
		}
		System.out.println("1부터 " + random + "까지의 합은 " + sum + "입니다.");
	}
	
	public void method8() {
		//반복문 + String
		String str = "hello";
		/*
		 *  h => str.charAt(0);
		 *  e => str.charAt(1);
		 *  l => str.charAt(2);
		 *  l => str.charAt(3);
		 *  o => str.charAt(4);
		 *  
		 *  규칙을 찾기. 우선 반복적으로 str.charAt을 호출함.
		 *  인덱스에 해당하는 숫자만 0부터 1씩 4까지 증가함
		 */
		for(int i = 0 ; i<5;i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public void method9() {
		//사용자에게 문자열을 입력받아 
		//각 인덱스별로 문자를 하나씩 뽑아서 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		System.out.println("문자열의 길이 : "+ str.length());		
		for(int i = 0; i < str.length() ; i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public void method10() {
		//구구단 출력(2단)
		/*
		 * 2 X 1 = 2
		 * 2 X 2 = 4
		 * ...
		 * 2 X 9 = 18
		 */
		
		for (int i = 1; i < 10; i++) {
			System.out.println("2 X " + i + " = " + 2 * i);
		}
		
		
	}
	
	public void method11() {
		//사용자가 입력한 단을 출력
		// 단수가 2단~9단의 범위가 아니라면
		//잘못입력했습니다.(2~9사이의 정수 입력)
		//제대로 입력했다면 해당 단수를 출력
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단 수(2~9)입력 :");
		int num = sc.nextInt();
		if (1 < num && num < 10) {
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d X %d = %d\n", num, i, num * i);
			}
		} else {
			System.out.println("잘못입력했습니다.(2~9사이의 정수 입력)");
		}

	}
	//중첩 반복문
	public void method12() {
		//1~5까지 연이어 출력
		// 1 2 3 4 5가 출력되도록 반복문 사용.
		for (int j = 0; j < 4; j++) {
			for (int i = 1; i <= 5; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
	}
	
	public void method13() {
		//*****
		//*****
		//*****
		//*****
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
	
	public void method14() {
		//1***
		//*2**
		//**3*
		//***4
		
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				if(j==i) {
					System.out.print(j);
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public void method15() {
		// 구구단 출력 (2~9단)모두
		
		for (int i = 2; i < 10; i++) {
			System.out.printf("--- %d단 ---\n", i);
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d X %d = %d\n", i, j, i * j);
			}
		}
	}
}
