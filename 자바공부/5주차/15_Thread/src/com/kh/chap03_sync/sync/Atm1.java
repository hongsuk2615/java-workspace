package com.kh.chap03_sync.sync;

public class Atm1 implements Runnable {

	private Account acc;

	public Atm1() {
		super();
	}

	public Atm1(Account acc) {
		super();
		this.acc = acc;
	}

	@Override
	public void run() {
		while (acc.getBalnce() > 0) {
			int money = (int) (Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName());
	}
}
