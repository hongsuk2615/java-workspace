package com.practice;

public class MoneyDispenser{
	
	private int money;
	public MoneyDispenser(int money) {
		super();
		this.money = money;
	}
	public MoneyDispenser exchange(int currency) {
		System.out.printf("%d원(권) : %d개(장)\n", currency, money/currency);
		this.money = money % currency;
		return this;
	}
}
