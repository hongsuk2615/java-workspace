package com.practiceprogrammers.model.vo;

public class 부족한금액계산하기 {
	public long solution(int price, int money, int count) {
		long totalPrice = (long) count * (count + 1) / 2 * price;
		if(money >= totalPrice) {
			return 0;
		}else {
			return (long)(totalPrice - money);
		}
	}
}
