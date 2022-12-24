package com.practiceprogrammers.model.vo;

import java.util.Arrays;
import java.util.List;

public class 문자열밀기 {

	public int solution(String A, String B) {
		int answer = 0;
		String[] ArrA = A.split("");
		String[] ArrB = B.split("");
		A = "";
		B = "";
		answer = Arrays.asList(ArrA).stream().sorted().forEach(str -> A += str)
		return answer;
	}

}
