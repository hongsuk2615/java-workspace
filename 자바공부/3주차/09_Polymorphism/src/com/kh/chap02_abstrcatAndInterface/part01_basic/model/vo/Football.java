package com.kh.chap02_abstrcatAndInterface.part01_basic.model.vo;

public class Football extends Sports {
	
	@Override
	public void rule() {
		System.out.println("공을 발로 차서 골대에 넣으면됨.");
	}
}
