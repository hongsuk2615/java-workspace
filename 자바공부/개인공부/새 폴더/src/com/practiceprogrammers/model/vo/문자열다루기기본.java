package com.practiceprogrammers.model.vo;

public class 문자열다루기기본 {
	public boolean solution(String s) {
		boolean answer = true;
		if(s.length()!= 4 && s.length() != 6) {
			return false;
		}
		try {
				Integer.parseInt(s);
			
		} catch (Exception e) {
			return false;
		}
		return answer;
	}
}
