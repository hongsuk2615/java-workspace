package com.kh.chap02_scheduling.run;

import com.kh.chap02_scheduling.scheduling.Car;
import com.kh.chap02_scheduling.scheduling.Plane;
import com.kh.chap02_scheduling.scheduling.Tank;

public class Run {

	public static void main(String[] args) {
		
		Thread carthread = new Thread(new Car());
		Thread planethread = new Thread(new Plane());
		Thread tankthread = new Thread(new Tank());
		
		carthread.setName("Car thread");
		planethread.setName("Plane thread");
		tankthread.setName("Tank thread");
		// 우선순위 변경전
		// 스레드는 기본적으로 1~10의 우선순위중 5의 우선순위를 가지고 있습니다.
		// 메모리가 모자랄때 우선순위를 정할수 있음.
		// 스레드의 우선순위를 정하지 않으면 OS(운영체제)가 임의로 수행시킴.
		System.out.println("==============우선순위 변경전==============");
		System.out.println(Thread.currentThread().getName()+"의 우선순위 : " + Thread.currentThread().getPriority());
		System.out.println(carthread.getName() + "의 우선순위 : " + carthread.getPriority());
		System.out.println(planethread.getName() + "의 우선순위 : " + planethread.getPriority());
		System.out.println(tankthread.getName() + "의 우선순위 : " + tankthread.getPriority());
		
		//setPriority(); : 우선순위를 지정해주는 메서드
		carthread.setPriority(Thread.MIN_PRIORITY);
		planethread.setPriority(Thread.MAX_PRIORITY);
		
		carthread.start();
		planethread.start();
		tankthread.start();

	}

}
