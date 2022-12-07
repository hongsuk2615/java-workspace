package com.kh.chap02_scheduling.scheduling;

public class Plane implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 20; i++) {
			try {
				System.out.println("Plane flight....");
				Thread.currentThread().sleep(100); // 스레드를 지정된 시간(ms)만큼 지연(정지)시키는 메서드
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
