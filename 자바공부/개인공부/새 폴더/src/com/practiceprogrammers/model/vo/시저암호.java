package com.practiceprogrammers.model.vo;

public class 시저암호 {
	public String solution(String s, int n) {
		char[] charr = s.toCharArray();
		for (int index = 0; index < charr.length; index++) {
			if (isLowercase(charr[index])) {
				if ('z' - charr[index] >= n) {
					charr[index] += n;
				} else {
					charr[index] = (char) ('a' + n - 1 - ('z' - charr[index]));
				}
			} else if (isUppercase(charr[index])) {
				if ('Z' - charr[index] >= n) {
					charr[index] += n;
				} else {
					charr[index] = (char) ('A' + n - 1 - ('Z' - charr[index]));
				}
			}
		}
		return new String(charr);
	}

	public boolean isLowercase(char c) {
		if (c >= 'a' && c <= 'z') {
			return true;
		} else {
			return false;
		}
	}

	public boolean isUppercase(char c) {
		if (c >= 'A' && c <= 'Z') {
			return true;
		} else {
			return false;
		}
	}
}
