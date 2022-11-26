package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public MemberMenu() {
		super();
	}

	public void mainMenu() {
		while (true) {
		System.out.println();
		System.out.printf("최대 등록 가능한 회원 수는 %d명입니다.\n", MemberController.SIZE);
		System.out.printf("현재 등록된 회원 수는 %d명 입니다.\n", mc.existMemberNum());
		int menu = 0;
		
			if (mc.existMemberNum() != MemberController.SIZE) {
				System.out.println("1. 새 회원 등록");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
				menu = sc.nextInt();
				sc.nextLine();
				switch (menu) {
				case 1:
					insertMember();
					break;
				case 2:
					searchMember();
					break;
				case 3:
					updateMember();
					break;
				case 4:
					deleteMember();
					break;
				case 5:
					printAll();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					mainMenu();
					break;
				}
			} else {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
				menu = sc.nextInt();
				switch (menu) {
				case 2:
					searchMember();
					break;
				case 3:
					updateMember();
					break;
				case 4:
					deleteMember();
					break;
				case 5:
					printAll();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					mainMenu();
					break;
				}
			}
		}

	}

	public void insertMember() {
		System.out.println("새 회원을 등록합니다.");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		if (mc.checkId(id)) { // checkId : 중복일 경우 true 반환
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			System.out.print("아이디 : ");
			id = sc.nextLine();
		}
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		if ((gender != 'm') && (gender != 'M') && (gender != 'F') && (gender != 'f')) {
			System.out.println("성별을 다시 입력하세요.");
			System.out.print("성별(M/F) : ");
			gender = sc.nextLine().charAt(0);
		}
		System.out.print("나이 : ");
		int age = sc.nextInt();
		mc.insertMember(id, name, password, email, gender, age);
	}

	public void searchMember() {
		int menu = 0;
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		menu = sc.nextInt();
		sc.nextLine();
		switch (menu) {
		case 1:
			searchId();
			break;
		case 2:
			searchName();
			break;
		case 3:
			searchEmail();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}

	public void searchId() {
		System.out.print("검색할 아이디 : ");
		String id = sc.nextLine();
		System.out.println(mc.searchId(id));

	}

	public void searchName() {
		System.out.print("검색할 이름 : ");
		String name = sc.nextLine();
		if (mc.searchName(name) == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("찾으신 회원 조회 결과 입니다.");
			for (Member member : mc.searchName(name)) {
				System.out.println(member.inform());
			}

		}

	}

	public void searchEmail() {
		System.out.print("검색할 이메일 : ");
		String email = sc.nextLine();
		if (mc.searchEmail(email) == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("찾으신 회원 조회 결과 입니다.");
			for (Member member : mc.searchEmail(email)) {
				System.out.println(member.inform());
			}

		}

	}

	public void updateMember() {
		int menu = 0;
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		menu = sc.nextInt();
		sc.nextLine();
		switch (menu) {
		case 1:
			updatePassword();
			break;
		case 2:
			updateName();
			break;
		case 3:
			updateEmail();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}

	public void updatePassword() {
		System.out.print("수정할 회원 아이디 : ");
		String id = sc.nextLine();
		System.out.print("수정할 비밀먼호 :");
		String password = sc.nextLine();
		if (mc.updatePassword(id, password)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디 입니다.");
		}
	}

	public void updateName() {
		System.out.print("수정할 회원 아이디 : ");
		String id = sc.nextLine();
		System.out.print("수정할 이름 :");
		String name = sc.nextLine();
		if (mc.updateName(id, name)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디 입니다.");
		}
	}

	public void updateEmail() {
		System.out.print("수정할 회원 아이디 : ");
		String id = sc.nextLine();
		System.out.print("수정할 이메일 :");
		String email = sc.nextLine();
		if (mc.updateEmail(id, email)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디 입니다.");
		}

	}

	public void deleteMember() {
		int menu = 0;
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		menu = sc.nextInt();
		sc.nextLine();
		switch (menu) {
		case 1:
			deleteOne();
			break;
		case 2:
			deleteAll();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}

	public void deleteOne() {
		System.out.print("삭제할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		char agree = sc.nextLine().charAt(0);
		if (agree == 'y' || agree == 'Y') {
			if (mc.delete(id)) {
				System.out.println("성공적으로 삭제하였습니다.");
			} else {
				System.out.println("존재하지 않는 아이디 입니다.");
			}
		}

	}

	public void deleteAll() {
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		char agree = sc.nextLine().charAt(0);
		if (agree == 'y' || agree == 'Y') {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");
		}
	}

	public void printAll() {
		if (mc.existMemberNum() == 0) {
			System.out.println("저장된 회원이 없습니다.");
		} else {
			for (Member member : mc.printAll()) {
				if (member != null) {
					System.out.println(member.inform());
				}
			}
		}

	}

}
