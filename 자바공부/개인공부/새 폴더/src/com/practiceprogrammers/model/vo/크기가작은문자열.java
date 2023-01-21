package com.practiceprogrammers.model.vo;

public class 크기가작은문자열 {
	public int solution(String t, String p) {
		int count = 0;
		for (int index = 0; index < t.length() - p.length() + 1; index++) {
			String subStr = t.substring(index, index + p.length());			
			if (subStr.charAt(0) != '0') {
				long parsedLong = Long.parseLong(subStr);
				if (parsedLong <= Long.parseLong(p)) {
					count++;
				}
			}else {
				count++;
			}
		}
		return count;
	}
}
