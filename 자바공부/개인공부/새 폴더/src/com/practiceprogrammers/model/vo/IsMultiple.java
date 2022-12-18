package com.practiceprogrammers.model.vo;

import java.util.Arrays;

public class IsMultiple {
	public int[] solution(int n, int[] numlist) {
		int[] answer = Arrays.stream(numlist).filter(num -> num % n == 0).toArray();
		return answer;
	}
}
