package com.practiceprogrammers.model.vo;

public class _2016년 {
	public String solution(int a, int b) {
		String answer = "";
		switch (a) {
		case 1:
			break;
		case 2:
			b += 31;
			break;
		case 3:
			b += 31 + 29;
			break;
		case 4:
			b += 31 * 2 + 29;
			break;
		case 5:
			b += 31 * 2 + 30 + 29;
			break;
		case 6:
			b += 31 * 3 + 30 + 29;
			break;
		case 7:
			b += 31 * 3 + 30 * 2 + 29;
			break;
		case 8:
			b += 31 * 4 + 30 * 2 + 29;
			break;
		case 9:
			b += 31 * 5 + 30 * 2 + 29;
			break;
		case 10:
			b += 31 * 5 + 30 * 3 + 29;
			break;
		case 11:
			b += 31 * 6 + 30 * 3 + 29;
			break;
		case 12:
			b += 31 * 6 + 30 * 4 + 29;
			break;
		}
		switch (b % 7) {
		case 0:
			answer = "THU";
			break;
		case 1:
			answer = "FRI";
			break;
		case 2:
			answer = "SAT";
			break;
		case 3:
			answer = "SUN";
			break;
		case 4:
			answer = "MON";
			break;
		case 5:
			answer = "TUE";
			break;
		case 6:
			answer = "WED";
			break;
		}
		return answer;
	}
}
