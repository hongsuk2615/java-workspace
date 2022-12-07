package com.kh.chap03_sync.sync;

public class Consumer implements Runnable {
	private Buffer buffer;

	public Consumer() {
		super();
	}

	public Consumer(Buffer buffer) {
		super();
		this.buffer = buffer;
	}

	@Override
	public void run() {
		for (int i = 1; i < 11; i++) {
			try {
				buffer.getData();
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
