package com.kh.chap02_abstrcatAndInterface.part02_family.run;

import com.kh.chap02_abstrcatAndInterface.part02_family.model.vo.*;

public class Run {

	public static void main(String[] args) {
		//인터페이스 적용시키기 전
		Person[] p = new Person[2];
		
		p[0] = new Mother("엄마", 60, 60, "출산");
		p[1] = new Baby("아기", 3.5, 60);
		
		System.out.println(p[0]);
		System.out.println(p[1]);
		
		p[0].eat();
		p[1].eat();
		p[0].sleep();
		p[1].sleep();
		
		System.out.println(p[0]);
		System.out.println(p[1]);
	}

}
