package com.kh.chap02_abstrcatAndInterface.part01_basic.model.vo;

public abstract class Sports {
	
	private int people; // 스포츠에 참여하는 선수 명 수

	public Sports() {
		super();
	}

	public Sports(int people) {
		super();
		this.people = people;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	@Override
	public String toString() {
		return "Sports [people=" + people + "]";
	}
	
	/*
	 * 몸통부가 존재하지 않는 미완성 메서드 ==  추상메서드
	 * 몸통부가 없는 미완성 메서드(추상메서드)를 정의하고자 하면 abstract 예약어를 써야한다.
	 * 
	 * 미완성 메서드가 하나라도 포함되는 순간 해당 클래스 또한 미완선 클래스(추상클래스)가 돼버린다.
	 * 클래스명 앞의 예약어도 abstract를 적어줘야함. 
	 * 
	 */
	
	public abstract void rule(); 
	
	
	
	
}
