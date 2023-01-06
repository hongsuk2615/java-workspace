package com.practiceprogrammers.model.vo;

import java.util.ArrayList;

public class 이상한문자만들기 {
	public String solution(String s) {
		String answer = "";
		char[] chararr = s.toCharArray();
		int count = 0;
		for (int index = 0; index < chararr.length; index++) {
			if (chararr[index] == ' ') {
				answer += chararr[index];
				count = 0;
			} else if (count % 2 == 0) {
				answer += ("" + chararr[index]).toUpperCase();
				count++;
			} else {
				answer += ("" + chararr[index]).toLowerCase();
				count++;
			}
		}
		return answer;
	}

}
