package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	/*
	 * 
	 * break; : break문을 만나는 순간 현재 속해있는 반복문을 빠져나감.
	 * -> 즉, 가장가까운 반복문
	 * [주의할점]
     * switch 문 안의 break와는 다른 개념
     * switch문 안의 break는 해당 switch문만 빠져나가는 용도.
	 * 
	 * 
	 * 
	 */
	
	public void method1() {
		//매번 반복적으로 발생되는 랜덤값(1~100)출력
		//그 랜덤값이 3의 배수일 경우에만 반복문을 종료.
		
		while(true) {
			int random = (int)(Math.random()*100+1);
			System.out.println("random : " + random);
			if (random%3 == 0 ) {
				break;
			}
		}
	}
	
	
	public void method2() {
		//매번 사용자에게 문자열을 입력받은 후 해당 문자열의 길이 출력
		//단, 사용자가 입력한 문자열이 "exit"인 경우 반복문 종료
		Scanner sc = new Scanner(System.in); 
		String str ="";
		while(true) {
			str = sc.nextLine();
			if(str.equals("exit")) {
				break;
			}else {
				System.out.println(str.length());
			}	
		}
		
	}
	
	
	public void method3() {
		// 매번 반복적으로 사용자에게 양수를 입력받아 1~사용자가 입력한 수까지 출력
		// 단, 정상적으로 양수를 입력했을 시 1~사용자가 입력한 수까지 출력을 하고 종료
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양수를 입력하세요 : ");
		while (true) {
			int num = sc.nextInt();
			if (num > 0) {
				for (int i = 1; i < num + 1; i++) {
					System.out.print(i + " ");
				}
				System.out.println();
				break;
			}else {
				System.out.print("다시 입력하세요 : ");
			}
		}

	}
}
