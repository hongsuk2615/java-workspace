package com.practice;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		System.out.print("금액을 입력하시오>>");
		int money = Integer.parseInt(new Scanner(System.in).nextLine());
		new MoneyDispenser(money).exchange(50000).exchange(10000).exchange(1000).exchange(100).exchange(10).exchange(1);
		
	}

}
