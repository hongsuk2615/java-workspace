package com.practiceprogrammers.model.vo;

import java.util.Arrays;

public class 과일장수 {
	public int solution(int k, int m, int[] score) { // 팔수있는 상자수 : score.length / m
		int answer = 0;
		Arrays.sort(score);
		for (int index = score.length % m; index < score.length;) {
			answer += score[index] * m;
			index += m;
		}
		return answer;
	}
}
