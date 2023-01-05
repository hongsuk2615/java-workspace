package com.practiceprogrammers.model.vo;

public class 가운데글자가져오기 {
	public String solution(String s) {
		String answer = "";
		if (s.length() % 2 == 0) {
			answer += s.charAt(s.length() / 2 - 1) + s.charAt(s.length() / 2);
		} else {
			answer += s.charAt(s.length() / 2);
		}
		return answer;
	}
}
