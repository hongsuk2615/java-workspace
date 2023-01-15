package com.practiceprogrammers.model.vo;

public class 소수찾기 {
	public int solution(int n) {
		int answer = 0;
		if (n <= 1) {
			return 0;
		} else if (n == 2) {
			return 1;
		} else {
			answer = 1;
			for (int num = 3; num <= n; num += 2) {
				if(isPrime(num)) {
					answer++;
				}
			}
			return answer;
		}
	}

	public boolean isPrime(int x) {
		if (x == 2) {
			return true;
		} else if (x > 2) {
			for (int num = 3; num < x; num += 2) {
				if (x % num == 0) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}

	}
}
