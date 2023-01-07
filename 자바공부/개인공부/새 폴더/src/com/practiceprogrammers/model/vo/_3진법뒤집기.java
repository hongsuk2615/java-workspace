package com.practiceprogrammers.model.vo;

public class _3진법뒤집기 {
	public int solution(int n) {
		int answer = 0;
		String ternary = Integer.toString(n, 3);
		for(int power = 0; power < ternary.length() ; power++ ) {
			answer += Integer.parseInt(ternary.charAt(power)+"") * Math.pow(3, power);
		}
		return answer;
	}
}
