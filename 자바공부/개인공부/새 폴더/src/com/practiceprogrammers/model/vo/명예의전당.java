package com.practiceprogrammers.model.vo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


/*
 * 프로그래머스 명예의전당
 * https://school.programmers.co.kr/learn/courses/30/lessons/138477
 */
public class 명예의전당 {
	public int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];
		int[] intList = new int[score.length];
		for (int day = 0; day < score.length; day++) {
			for (int i = 0; i <= k; i++) {
				intList[i] = score[i];
			}
			answer[day] = Arrays.stream(intList).filter(integer -> integer != 0).sorted().skip(day-k).min().getAsInt();
		}
		return answer;
	}
}
