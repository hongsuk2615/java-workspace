package com.practiceprogrammers.model.vo;

import java.util.Arrays;
import java.util.stream.Collectors;


public class A로B만들기 {

	public int solution(String before, String after) {
		int answer = 0;
		String[] ArrA = before.split("");
		String[] ArrB = after.split("");
		before = Arrays.asList(ArrA).stream().sorted().collect(Collectors.joining());
		after = Arrays.asList(ArrB).stream().sorted().collect(Collectors.joining());
		if (before.equals(after))
			answer = 1;
		else
			answer = -1;
		return answer;
	}

}
