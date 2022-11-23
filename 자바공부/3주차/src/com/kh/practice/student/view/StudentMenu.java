package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;

public class StudentMenu {

	
	private StudentController ssm = new StudentController();

	public StudentMenu() {
		System.out.println("========== 학생 정보 출력 ==========");
		for (int i = 0; i < ssm.printStudent().length; i++) {
			System.out.printf("이름 : %s  / 과목 : %s / 점수 : %d \n", ssm.printStudent()[i].getName(),
					ssm.printStudent()[i].getSubject(), ssm.printStudent()[i].getScore());
		}
		System.out.println();
		
		System.out.println("========== 학생 성적 출력 ==========");
		System.out.println("학생 점수 합계 : " + ssm.avgScore()[0]);
		System.out.println("학생 점수 평균 : " + ssm.avgScore()[1]);
		System.out.println();
		
		System.out.println("========== 성적 결과 출력 ==========");
		for (int i = 0; i < ssm.printStudent().length; i++) {
			if (ssm.printStudent()[i].getScore() < 60) {
				System.out.println(ssm.printStudent()[i].getName() + "학생은 재시험 대상입니다.");
			} else {
				System.out.println(ssm.printStudent()[i].getName() + "학생은 통과 입니다.");
			}
		}
	}

}
