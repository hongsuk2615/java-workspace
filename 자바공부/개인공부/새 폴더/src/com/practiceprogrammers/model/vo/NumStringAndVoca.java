package com.practiceprogrammers.model.vo;

/*
 * 숫자 문자열과 영단어
 * https://school.programmers.co.kr/learn/courses/30/lessons/81301
 */
public class NumStringAndVoca {
	public int solution(String s) {
		int answer = 0;
		for (int index = 0; index < s.length();) {
			switch (s.charAt(index)) {
			case 'z':
				s = s.substring(0, index) + "0" + s.substring(index + 4);
				break;
			case 'o':
				s = s.substring(0, index) + "1" + s.substring(index + 3);
				break;
			case 't':
				if (s.charAt(index + 1) == 'w') {
					s = s.substring(0, index) + "2" + s.substring(index + 3);
					break;
				} else {
					s = s.substring(0, index) + "3" + s.substring(index + 5);
					break;
				}
			case 'f':
				if (s.charAt(index + 1) == 'o') {
					s = s.substring(0, index) + "4" + s.substring(index + 4);
					break;
				} else {
					s = s.substring(0, index) + "5" + s.substring(index + 4);
					break;
				}
			case 's':
				if (s.charAt(index + 1) == 'i') {
					s = s.substring(0, index) + "6" + s.substring(index + 3);
					break;
				} else {
					s = s.substring(0, index) + "7" + s.substring(index + 5);
					break;
				}
			case 'e':
				s = s.substring(0, index) + "8" + s.substring(index + 5);
				break;
			case 'n':
				s = s.substring(0, index) + "9" + s.substring(index + 4);
				break;
			}
			index++;
		}
		answer = Integer.parseInt(s);
		System.out.println(answer);
		return answer;
	}

}
