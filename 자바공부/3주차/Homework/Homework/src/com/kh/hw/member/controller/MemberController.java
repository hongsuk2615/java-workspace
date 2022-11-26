package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {

	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;

	public int existMemberNum() {

		int memberNum = 0;
		for (Member member : m) {
			if (member != null) { // Member null값이 아니면 memberNum증가
				memberNum++;
			}
		}
		return memberNum;
	}

	public boolean checkId(String inputId) {
		boolean result = false;
		for (Member member : m) {
			if ((member != null) && (existMemberNum() != 0) && (member.getId().equals(inputId))) {
				result = true;
			}
		}
		return result;
	}

	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		m[existMemberNum()] = new Member(id, name, password, email, gender, age);
	}

	public String searchId(String id) {
		String result = "검색 결과가 없습니다.";
		for (Member member : m) {
			if ((member != null) && member.getId().equals(id)) {
				result = member.inform();
				System.out.println("찾으신 회원 조회 결과 입니다.");
				break;
			}
		}
		return result;
	}

	public Member[] searchName(String name) {
		int count = 0;
		for (Member member : m) { // 이름이랑 같은 멤버갯수 찾기
			if ((member != null) && member.getName().equals(name)) {
				count++;
			}
		}

		Member[] searchResult = new Member[count]; // 갯수만큼 멤버배열 생성
		if (count == 0) {
			searchResult = null;
		} else {
			int index = 0;
			for (Member member : m) {
				if ((member != null) && member.getName().equals(name)) { // 같은 이름의 멤버를 찾으면 결과멤버배열에 대입
					searchResult[index] = member;
					index++;
				}
			}
		}
		return searchResult;
	}

	public Member[] searchEmail(String email) {
		int count = 0;
		for (Member member : m) { // 이메일이 같은 멤버갯수 찾기
			if ((member != null) && member.getEmail().equals(email)) {
				count++;
			}
		}

		Member[] searchResult = new Member[count]; // 갯수만큼 멤버배열 생성
		if (count == 0) {
			searchResult = null;
		} else {
			int index = 0;
			for (Member member : m) {
				if ((member != null) && member.getEmail().equals(email)) { // 같은 이메일의 멤버를 찾으면 결과멤버배열에 대입
					searchResult[index] = member;
					index++;
				}
			}
		}
		return searchResult;
	}

	public boolean updatePassword(String id, String password) {
		boolean result = false;
		for (Member member : m) {
			if ((member != null) &&member.getId().equals(id)) { // 검색후 아이디가있으면 패스워드 바꿈
				member.setPassword(password);
				result = true;
				break;
			}
		}
		return result;
	}

	public boolean updateName(String id, String name) {
		boolean result = false;
		for (Member member : m) {
			if ((member != null)&&member.getId().equals(id)) { // 검색후 아이디가있으면 이름 바꿈
				member.setName(name);
				result = true;
				break;
			}
		}
		return result;
	}

	public boolean updateEmail(String id, String email) {
		boolean result = false;
		for (Member member : m) {
			if ((member != null)&&member.getId().equals(id)) { // 검색후 아이디가있으면 이메일 바꿈
				member.setEmail(email);
				result = true;
				break;
			}
		}
		return result;
	}

	public boolean delete(String id) {
		boolean result = false;
		for (int i = 0 ; i < m.length ; i++) {
			if ((m[i] != null)&& m[i].getId().equals(id)) { // 검색후 아이디가있으면 해당 멤버삭제
				m[i] = null;
				result = true;
				break;
			}
		}
		return result;
	}

	public void delete() {
		for (int i = 0 ; i < m.length ; i++) { // 전부 삭제
			m[i] = null;
		}
	}

	public Member[] printAll() {
		return m;
	}
}
