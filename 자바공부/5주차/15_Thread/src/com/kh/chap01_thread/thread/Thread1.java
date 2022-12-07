package com.kh.chap01_thread.thread;


//스레드 생성방법
/*
 * 1. 직접적으로Thread 클래스를 상속
 *    -Thread 클래스 상속 후에 run()메서드 오버라이딩
 *    -Thread1 객체를 생성 후 start()메서드를 호출.
 * 
 * 
 * 
 * 
 */
public class Thread1 extends Thread{
	/*
	 * 스레드 실행시 Run메서드 호출됨
	 * 따라서 작업을 하고자 하는 코드를 반드시 Run메서드 안에 재정의 해줘야한다.
	 * 즉, Thread 클래스 안에 있는 run메서드를 Override 해야함.
	 */
	@Override
	public void run() { //작업할 코드
		for (int i = 0; i < 1000; i++) {
			System.out.println(getName() + "[" + i + "]");
		}
	}
	
}
