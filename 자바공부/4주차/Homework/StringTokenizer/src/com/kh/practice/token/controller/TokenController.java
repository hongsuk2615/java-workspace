package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {
		super();
	}
	
	public String afterToker(String str) {
		String result = "";
		StringTokenizer stn = new StringTokenizer(str, " ");
		while(stn.hasMoreTokens()) {
			result += stn.nextToken();
		}
		return result;
	}
	
	public String firstCap(String input) {
		String result = "";
		char[] cArr = input.toCharArray();
		for (int index = 0; index < cArr.length; index++) {
			if(index == 0) {
				result += String.valueOf(cArr[index]).toUpperCase();
			}else {
				result += String.valueOf(cArr[index]);
			}
		}
		
		return result;
	}
	
	public int findChar(String input, char one) {
		int result = 0;
		char[] cArr = input.toCharArray();
		for(char ch : cArr) {
			if (ch == one) {
				result++;
			}
		}
		return result;
	}
}
