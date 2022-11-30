package com.kh.exception.controller;


import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException {
	
	/*
	 * RuntimeException
	 * -프로그램 실행시 발생되는 예외들
	 * 
	 * RuntimeException의 자식클래스들
	 * -ArrayIndexOutOfBoundsException : 배열의 부적절한 인덱스로 접근할때 발생하는 예외
	 * -NegativeArraySizeException : 배열의 크기를 음수로 지정할 경우 발생하는 예외
	 * -ClassCastException : 허용할 수 없는 형변환이 진행될 경우 발생하는 예외
	 * -NullPointerException : 레퍼런스가 아직 null임에도 불구하고 접근하려고 할때 발생하는 예외
	 * -ArithmeticException : 나누기 연산시 0으로  나눌때 발생하는 예외
	 * -......
	 * 
	 * =>이러한 RuntimeException과 관련한 예외는 충분히 예상가능한 상황이기때문에
	 * 	 예외자체가 발생이 안되게끔 조건문으로 해결이 가능(따라서 굳이 예외처리를 할 필요가 없음)
	 * 
	 */
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		
		//ArithmeticException : 나누기 연산시 0으로 나눌때 발생하는 예외.
		// 사용자에게 두개의 정수값을 입력받아 나눗셈 연산 결과 출력
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		// 해결방법 1. 조건문으로 처리(애초에 예외자체가 발생되지 않게끔 if문으로 조건검사하기) =>예외처리x
//		if(num2 == 0) {
//			System.out.println("0으로 나눌수 없습니다.");
//		}else {
//			System.out.println(num1 + " / " + num2 + " = " + num1/num2);			
//		}
//		System.out.println("프로그램 종료");
		// 해결방법 2. 예외처리 구문으로 해결(예외가 발생했을 경우를 대비해서 실행할 내용을 정의해 두는것)
		/*
		 * try ~ catch문
		 * [표현법]
		 * try{
		 *     //예외가 발생될수 있는 구문
		 * }catch (발생될 예외클래스 변수명 -> 매개변수){
		 *     //예외 발생시 실행할 구문
		 * }
		 */
		
		try {
			System.out.println("나눗셈 연산결과 : "+num1/num2); //ArithmeticException
		} catch (ArithmeticException e) {
//			System.out.println("0으로 나눌수 없습니다.");
			e.printStackTrace(); // 현재발생한 오류를 추적할수있는 로그정보제공
		}
		System.out.println("프로그램 종료");
	}
	
	public void method2() {
		System.out.print("정수 입력(0제외) : ");
		try {
			int num = sc.nextInt();
			System.out.println("나눗셈 연산 결과 : " + (10/num)); //예외발생가능
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		} catch(InputMismatchException e) {
			System.out.println("정수를 제대로 입력해주세요.");
		} // 예외가 여러개 발생할 가능성이 있는 경우 다중 catch블럭으로 사용가능
		System.out.println("프로그램을 종료합니다.");
	}
}
