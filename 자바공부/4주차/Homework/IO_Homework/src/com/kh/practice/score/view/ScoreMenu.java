package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {

	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();

	public void mainMenu() {
		while (true) {
			System.out.println("1. 성적 저장");
			System.out.println("2. 성적 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				saveScore();
				break;
			case 2:
				readScore();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}

	public void saveScore() {
		int num = 0;
		while (true) {
			System.out.printf("%d번 째 학생 정보 기록\n", num + 1);
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("국어 점수 : ");
			int kor = Integer.parseInt(sc.nextLine());
			System.out.print("영어 점수 : ");
			int eng = Integer.parseInt(sc.nextLine());
			System.out.print("수학 점수 : ");
			int math = Integer.parseInt(sc.nextLine());
			int sum = kor + eng + math;
			double avg = (double) sum / 3;
			scr.saveScore(name, kor, eng, math, sum, avg);
			num++;
			System.out.print("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 : ");
			char agree = sc.nextLine().charAt(0);

			if (agree == 'N' || agree == 'n') {
				break;
			}
		}
	}

	public void readScore() {
		int count = 0;
		int sumAll = 0;
		double avgAll = 0.0;
		System.out.printf("이름\t국어\t영어\t수학\t총점\t평균\n");
		try (DataInputStream dis = scr.readScore();) {

			while (true) {
				String name = dis.readUTF();
				int kor = dis.readInt();
				int eng = dis.readInt();
				int math = dis.readInt();
				int sum = dis.readInt();
				double avg = dis.readDouble();
				if (avg == (int) avg) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n", name, kor, eng, math, sum, avg);
				} else {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.14f\n", name, kor, eng, math, sum, avg);
				}
				count++;
				sumAll += sum;
				avgAll = (double) sumAll / count / 3;
			}
		} catch (EOFException e) {
			System.out.printf("읽은 횟수\t전체 합계\t전체 평균\n");
			if (avgAll == (int) avgAll) {
				System.out.printf("%d\t%d\t%.1f\n", count, sumAll, avgAll);
			} else {
				System.out.printf("%d\t%d\t%.14f\n", count, sumAll, avgAll);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
