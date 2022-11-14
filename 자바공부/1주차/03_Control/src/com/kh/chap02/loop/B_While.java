package com.kh.chap02.loop;

public class B_While {
	/*
	 * while문
	 * [표기법]
	 * 
	 * [초기식;] //필수아님
	 * while(조건식) { //조건이 true일 경우 해당구문들을 반복적으로 실행, 조건식 내용에 true를 작성시 무한 반복함
	 * 	반복적으로 실행할 코드
	 *  [증감식]; // 필수는 아님 
	 *
	 * }
	 * 
	 * for문과는 다르게 초기식, 증감식이 필수가 아님.
	 * 
	 * 분기문에서 초기식, 증감식없이 작성하는 법을 배울예정
	 * 
	 * 
	 */
	public void method1() {
		//for문을 while문으로, while문을 for문으로 표현할 수 있음.
		
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println("안녕하세요.");
		}
		int i = 0; //초기식
		while(i < 5) { // 조건식
			System.out.println("안녕하세요.");
			i++;//증감식
			
		}
	}
	
	
	public void method2() {
		//1~10사이의 정수중 홀수만 출력
		
		int i = 1 ;
		while (i<11) {
			if(i%2 != 0) {
				System.out.print(i+ " ");
			}
			i++;
		}
	}

}
