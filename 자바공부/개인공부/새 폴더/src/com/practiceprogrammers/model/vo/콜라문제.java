package com.practiceprogrammers.model.vo;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/132267?language=java
 * 
 * */
public class 콜라문제 {
	public int solution(int a, int b, int n) {
		int answer = 0;
		while (n / a != 0) {
			answer += n / a * b;
			n = n / a * b + n % a;
		}
		return answer;
	}
}
