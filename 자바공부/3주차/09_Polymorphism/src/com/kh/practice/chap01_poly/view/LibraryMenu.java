package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.*;


public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		// 메인 메뉴 출력 메소드
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);
		Member mem = new Member(name, age, gender, 0);
		lc.insertMember(mem);
		
		while (true) {
			System.out.println();
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");

			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println(lc.myInfo());
				break;
			case 2:
				this.selectAll();
				break;
			case 3:
				this.searchBook();
				break;
			case 4:
				this.rentBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;

			default:
				System.out.println("잘못입력했습니다.");
				break;
			}

		}

	}

	public void selectAll() {
		// 도서 전체 목록 출력 메소드
		Book[] bList = lc.selectAll();

		for (int i = 0; i < bList.length; i++) {
			System.out.println(i + "번 도서 : " + bList[i]);
		}
	}

	public void searchBook() {
		// 검색할 제목 키워드를 입력 받아 검색 결과를 출력하는 메소드
		System.out.print("검색할 제목 키워드: ");
		sc.nextLine();
		String keyword = sc.nextLine();

		Book[] searchList = lc.searchBook(keyword);

		for (Book book : searchList) {
			System.out.println(book);
		}
	}

	public void rentBook() {
		// 대여할 도서 인덱스를 입력 받아 LibraryController의 rentBook 메소드로 전달
		// → 결과 값을 result로 받아 result가 0일 경우, 1일 경우, 2일 경우 각각에
		// 해당하는 출력문 출력
		this.selectAll();
		System.out.print("대여할 도서 번호 선택: ");
		int index = sc.nextInt();
		int result = lc.rentBook(index);

		switch (result) {
		case 0:
			System.out.println("성공적으로 대여되었습니다.");
			break;
		case 1:
			System.out.println("나이 제한으로 대여 불가능 입니다.");
			break;
		case 2:
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요");
			break;

		}
	}
}
