package com.kh.chap02_abstrcatAndInterface.part02_family.model.vo;

public class Mother extends Person implements Basic {

	private String babyBirth;

	public Mother() {
		super();
	}

	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}

	public String getBabyBirth() {
		return babyBirth;
	}

	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}

	@Override
	public String toString() {
		return "Mother [babyBirth=" + babyBirth + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void eat() {
		// 엄마가 밥을 먹으면 -> 몸무게 10증가 , 건강도10 감소
		super.setWeight(super.getWeight() + 10);
		super.setHealth(super.getHealth() - 10);
	}

	@Override
	public void sleep() {
		// 엄마가 잠을 자면 -> 건강도 10 증가
		super.setHealth(super.getHealth() + 10);

	}

}
