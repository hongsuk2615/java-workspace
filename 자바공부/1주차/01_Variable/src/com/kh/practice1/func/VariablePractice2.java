package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	public void example2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 :");
		int int1 = sc.nextInt();
		
		System.out.print("두 번째 정수 :");
		int int2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (int1+int2));
		System.out.println("빼기 결과 : " + (int1-int2));
		System.out.println("곱하기 결과 : " + (int1*int2));
		System.out.println("나누기 몫 결과 : " + (int1/int2));
	}

}
