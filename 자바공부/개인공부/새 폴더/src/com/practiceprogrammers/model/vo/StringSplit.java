package com.practiceprogrammers.model.vo;
/*
 * 프로그래머스 문자열 나누기
 * https://school.programmers.co.kr/learn/courses/30/lessons/140108
 */
public class StringSplit {
	public int solution(String s) {
		int answer = 0;
		int countD = 0;
		int countE = 0;
		int start = 0;
		int last = s.length();
		for (int i = start; i < last; i++) {
			if (s.charAt(start) != s.charAt(i)) {
				countD++;
				System.out.printf(
						"현재 문자열 : %s , countD : %d, countE : %d , start : %d , i : %d , answer : %d, last : %d--Diff\n",
						s, countD, countE, start, i, answer, last);
			} else {
				countE++;
				System.out.printf(
						"현재 문자열 : %s , countD : %d, countE : %d , start : %d , i : %d , answer : %d, last : %d--EQUAL\n",
						s, countD, countE, start, i, answer, last);

			}

			if (countE == countD) {
				if (i != last - 1) {
					s = s.substring(0, i + 1) + "-" + s.substring(i + 1, last);
				}

				i++;
				start = i + 1;
				last = s.length();
				answer++;
				System.out.printf(
						"현재 문자열 : %s , countD : %d, countE : %d , start : %d , i : %d , answer : %d, last : %d--split \n",
						s, countD, countE, start, i, answer, last);
			} else if (i == last - 1) {
				answer++;
			}

			System.out.println("===========================================================================================");
		}
		System.out
				.println("===========================================================================================");
		System.out.printf("최종 문자열 : %s , Answer : %d", s, answer);
		return answer;
	}
}
