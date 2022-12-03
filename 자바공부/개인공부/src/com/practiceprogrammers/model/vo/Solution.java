package com.practiceprogrammers.model.vo;

public class Solution {
	public String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];
		String[] split = new String[4];

		for (int i = 0; i < quiz.length; i++) {
			split = quiz[i].split(" ");
			if (split[1].equals("-")) {
				if (Integer.parseInt(split[0]) - Integer.parseInt(split[2]) == Integer.parseInt(split[4])) {
					answer[i] = "O";
				} else {
					answer[i] = "X";
				}
			} else {
				if (Integer.parseInt(split[0]) + Integer.parseInt(split[2]) == Integer.parseInt(split[4])) {
					answer[i] = "O";
				} else {
					answer[i] = "X";
				}

			}

		}
		for(String str : answer) {
			System.out.println(str);
		}
		return answer;
	}

}
