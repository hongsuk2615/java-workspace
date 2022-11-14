package com.kh.chap02.loop;

import java.util.Scanner;

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
	
	public void method3() {
		//1부터 랜덤값(1~100)까지의 총 합계
		int sum = 0;
		int i = 1;
		int random = (int)(Math.random()*100);
		System.out.println(random);
//		while(i<random+1) {
//			sum += i;
//			i++;
//		}
//		System.out.println(sum);
		
		while(random>0) {
			sum += random;
			random--;
		}
		System.out.println(sum);
	}
	
	
	public void method4() {
		
		//사용자에게 문자열을 입력받아 
		//각 인덱스별로 문자를 하나씩 뽑아서 출력
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int i = 0;
		while(i<str.length()) {
		  System.out.println(str.charAt(i));
		  i++;
		}
		
		/*
		 * do ~ while문
		 * [표현법]
		 * do{ //조건검사없이 무조건 1번 실행
		 *
		 * }while(조건식);
		 * 
		 * 
		 */
	}
	
	public void method5() {
		//조건식이 맞지 않은 경우에 do~while문 테스트
		int num = 900;
		
		do {
			System.out.println("do while 테스트");
		}while(num==0);
		
		
	}
	
	public void method6() {
		//1 2 3 4 5
		int i = 1;
		do {
			System.out.println(i++ + " ");
			
		}while(i <= 5);
	}
	
	public void method7() {
		// 1부터 사용자가 입력한 줏자까지의 총 합계
		// 1. do~while문 사용
		// "1부터 x까지의 총 합계 : xx"
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("1부터 " + num + "까지의 총 합계 : ");
		int sum = 0;
		do {
			sum += num;
			num--;

		} while (num > 0);
		System.out.println(sum);
	}
}
