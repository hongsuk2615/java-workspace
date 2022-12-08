package com.practicekakaotalkexam.run;

import com.practicekakaotalkexam.controller.Controller;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller c = new Controller();
		while (true) {
			c.saveFunction();
			try {
				c.runFunction();
			} catch (Exception e) {
				System.out.println("잘못된 매개변수 입력 입니다.");
				break;
			}
		}
	}

}
