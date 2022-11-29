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
		StringTokenizer stn = new StringTokenizer(input);
		result += stn.nextToken().toUpperCase();
		
		while(stn.hasMoreTokens()) {
			result += stn.nextToken();
		}
		
		return result;
	}
	
	public int findChar(String input, char one) {
		int result = 0;
		StringTokenizer stn = new StringTokenizer(input);
		while(stn.hasMoreTokens()) {
			if(stn.nextToken().charAt(0) == one) {
				result++;
			}
		}
		return result;
	}
}
