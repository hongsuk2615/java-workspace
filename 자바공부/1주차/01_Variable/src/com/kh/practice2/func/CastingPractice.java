package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice {
	public void example1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		float korean = sc.nextFloat();
		
		System.out.print("영어 : ");
		float english = sc.nextFloat();
		
		System.out.print("수학 : ");
		float math = sc.nextFloat();
		
		int sum = (int)(korean + english + math);
		int average = sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
		
		
		
	}
}
