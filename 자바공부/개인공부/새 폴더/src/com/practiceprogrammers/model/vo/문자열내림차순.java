package com.practiceprogrammers.model.vo;

import java.util.Arrays;

public class 문자열내림차순 {
	public String solution(String s) {
		String answer = "";
		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		for(char c : charArray) {
			answer = c + answer;
		}
		return answer;
	}
}
