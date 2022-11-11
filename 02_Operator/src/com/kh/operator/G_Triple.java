package com.kh.operator;

import java.util.Scanner;


public class G_Triple {
	
	/*
	 * 삼항연산자 :  3개의 항목을 가지고 연산하는 연산자.
	 * 
	 * [표현법]
	 * 
	 * 조건식 ? 조건식이 true일 경우 결과값 : 조건식이 false일 경우 결과값
	 */
	public void method1() {
		//사용자가 입력한 정수값이 양수인지 아닌지 판별후 양수라면 양수입니다, 아니라면 양수가 아닙니다를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		//String result = (num > 0) ? "양수입니다." : "양수가 아닙니다.";
		//System.out.println(num + "은 "+ result);
		
		//산술연산이 삼항연산보다 우선순위가 높아서 괄호로 묶어줘야 한다.
		System.out.println(num + "은(는) " + (num <= 0 ? "양수가 아닙니다." : "양수입니다."));
	}
	
	public void method2() {
		
		//사용자가 입력한 정수값이 짝수인지 홀수인지 판별후 출력
		//xx는 짝(홀)수입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		
		String result = (num%2 == 0) ? "짝수입니다." : "홀수입니다.";
		
		System.out.println(num + "(은)는 " + result);
			
	}
	
	public void method3() {
		//사용자로부터 영문자 하나를 입력받아 대문자인지, 아닌지 판별후 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자 한개만 입력 : ");
		char ch = sc.next().charAt(0);
		
		String result = (ch >= 'A' && ch <= 'Z') ? "대문자입니다." : "소문자입니다." ;
		
		System.out.printf("%c(은)는 %s", ch, result);
	}
	
	//삼항 연산자를 중첩사용
	public void method4() {
		//method1()의 내용보완
		//사용자가 입력한 정수값이 양수인지, 0인지, 음수인지 판별
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		String result = (num > 0) ? "양수입니다." : (num == 0) ? "0입니다." : "음수입니다.";
		System.out.println("사용자가 입력한 값인 "+ num + "(은)는 " + result);
		
	}
	
	public void method5() {
		//두개의 정수값과 + , - 의 문자를 입력받아 
		//+일 경우 두 정수값의 덧셈연산한 결과
		//-일 경우 두 정수값의 뺄셈연산한 결과
		//둘다 아닐 경우 잘못입력했습니다. 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산자 입력(+ or -) : ");
		char op = sc.nextLine().charAt(0);
		
		System.out.print("첫번째 정수값 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수값 입력 : ");
		int num2 = sc.nextInt();
		
		String result = ((op =='+') ? (num1+num2) +"" : (op == '-') ? (num1 - num2)+"" : "잘못입력했습니다.");
		
		System.out.println(result);
		
	}

}
