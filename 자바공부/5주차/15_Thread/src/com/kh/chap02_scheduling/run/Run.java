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
		planethread.setPriority(Thread.MAX_PRIORITY);
		carthread.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("==============우선순위 변경후==============");
		System.out.println(Thread.currentThread().getName()+"의 우선순위 : " + Thread.currentThread().getPriority());
		System.out.println(carthread.getName() + "의 우선순위 : " + carthread.getPriority());
		System.out.println(planethread.getName() + "의 우선순위 : " + planethread.getPriority());
		System.out.println(tankthread.getName() + "의 우선순위 : " + tankthread.getPriority());
		
		carthread.setDaemon(true);
		planethread.setDaemon(true);
		tankthread.setDaemon(true);
		carthread.start();
		planethread.start();
		tankthread.start();
		
		/*
		 * 메인 스레드가 종료되더라도 실행 중인 스레드가 하나라도 있다면 프로세스는 종료되지 않는다.
		 * 해결책 : start()시키기전에 우선순위, 주종관계를 설정해야함.
		 * 주종관계 설정
		 * main스레드가 종료시 다른 스레드도 종료시키기 위해서 반드시 setDaemon사용.
		 * 주의점은 스레드중 한개라도 setDaemon으로 설정시 모든 스레드에 setDaemon설정을 해줘야함.
		 */
				
		System.out.println("==============main 스레드 종료시점==============");
		//시작순서는 우선순위와 다를수 있지만 종료순서는 우선순위(priority가 높은 순 대부분으로 끝나게 됨) / 항상x
	}

}
