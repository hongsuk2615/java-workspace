package com.practiceprogrammers.model.vo;

import java.util.Arrays;
import java.util.stream.Collectors;


public class A로B만들기 {

	public int solution(String A, String B) {
		int answer = 0;
		String[] ArrA = A.split("");
		String[] ArrB = B.split("");
		B = Arrays.asList(ArrB).stream().sorted().collect(Collectors.joining());
		A = Arrays.asList(ArrA).stream().sorted().collect(Collectors.joining());
		if (A.equals(B))
			answer = 1;
		else
			answer = -1;
		return answer;
	}

}
