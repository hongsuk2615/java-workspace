package com.kh.chap03_sync.run;

import java.util.Scanner;

import com.kh.chap03_sync.sync.Account;
import com.kh.chap03_sync.sync.Atm1;

public class Run2 {

	public static void main(String[] args) {
		// 계좌, ATM
		Account acc = new Account();
		Thread atm1Thread = new Thread(new Atm1(acc));
		Thread atm2Thread = new Thread(new Atm1(acc));
		
		/*
		 * 메서드의 동기화 처리(synchronized)해주지 않을 경우 값이 마구 뒤섞임.
		 * 즉, 앞의 스레드가 실행되는 동안은 다른 스레드가 같은 자원에 접근하면 안됨.
		 */
		atm1Thread.setName("ATM1");
		atm2Thread.setName("ATM2");
		atm1Thread.setDaemon(true);
		atm2Thread.setDaemon(true);
		atm1Thread.start();
		atm2Thread.start();
		
		/*
		 * 동기화란?
		 * 멀티스레딩 프로그램에서 스레드간 공유자원에 대한 처리를 말함.
		 * 공유자원에 대한 사용순서를 정해주는것.
		 * LOCK을 획득한 스레드만 사용가능하다.
		 * 
		 */
		Scanner sc = new  Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		if(input !=0) {
			System.out.println("메인스레드 종료");
			return;
		}	

	}

}
