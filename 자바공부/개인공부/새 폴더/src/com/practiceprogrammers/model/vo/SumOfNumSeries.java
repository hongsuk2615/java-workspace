package com.practiceprogrammers.model.vo;

import java.util.Arrays;

/*프로그래머스 연속된 수의합
 * https://school.programmers.co.kr/learn/courses/30/lessons/120923
 */
public class SumOfNumSeries {
	public int[] solution(int num, int total) {
		int[] answer = new int[num];
//		int startNum = 0;
//		while (true) {
//			if ((startNum + startNum + num - 1) * num / 2 == total) {
//				answer[0] = startNum;
//				for (int index = 1; index < num; index++) {
//					answer[index] = answer[index - 1] + 1;
//				}
//				break;
//			}
//			startNum++;
//		}
		double average = total / num;
		if (average != (int) average) {
			answer[0] = (int) average - num / 2 + 1;
			for (int index = 1; index < num; index++) {
				answer[index] = answer[index - 1] + 1;
			}
		} else {
			answer[0] = (int) average - num / 2;
			for (int index = 1; index < num; index++) {
				answer[index] = answer[index - 1] + 1;
			}
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}
}
