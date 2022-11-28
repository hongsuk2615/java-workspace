package com.kh.chap02_abstrcatAndInterface.part02_family.model.vo;

public class Baby extends Person {

	public Baby() {
		super();
	}

	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}

	@Override
	public String toString() {
		return "Baby [toString()=" + super.toString() + "]";
	}

	@Override
	public void eat() {
		// 아기가 밥을 먹으면 -> 몸무게 3증가, 건강도 1증가
		super.setWeight(super.getWeight() + 3);
		super.setHealth(super.getHealth() + 1);

	}

	@Override
	public void sleep() {
		super.setHealth(super.getHealth() + 3);
		// 아기가 잠을 자면 -> 건강도 3증가

	}
}
