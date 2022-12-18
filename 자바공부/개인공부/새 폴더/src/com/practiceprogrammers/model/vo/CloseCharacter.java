package com.practiceprogrammers.model.vo;

public class CloseCharacter {
	public int[] solution(String s) {
		int[] answer = new int[s.length()];
		if (s.length() != 0) {
			answer[0] = -1;
		}
		for (int index = 0; index < s.length(); index++) {
			String str = s.substring(0, index + 1);
			for (int i = index - 1; i >= 0; i--) {
				if (str.charAt(i) == str.charAt(index)) {
					answer[index] = index - i;
					break;
				} else if (i == 0) {
					answer[index] = -1;
					break;
				}
			}
		}
		return answer;
	}
}
