package com.practiceprogrammers.model.vo;

public class 모의고사 {
	public int[] solution(int[] answers) {
		int countNum1 = 0;
		int countNum2 = 0;
		int countNum3 = 0;
		for (int index = 0; index < answers.length; index++) {
			if (num1(index) == answers[index]) {
				countNum1++;
			}
			if (num2(index) == answers[index]) {
				countNum2++;
			}
			if (num3(index) == answers[index]) {
				countNum3++;
			}
		}
		if (countNum1 > countNum2 && countNum1 > countNum3) {
			return new int[] { 1 };
		} else if (countNum2 > countNum3 && countNum2 > countNum1) {
			return new int[] { 2 };
		} else if (countNum3 > countNum1 && countNum3 > countNum1) {
			return new int[] { 3 };
		} else if (countNum1 == countNum2 && countNum1 > countNum3) {
			return new int[] { 1, 2 };
		} else if (countNum1 == countNum3 && countNum1 > countNum2) {
			return new int[] { 1, 3 };
		} else if (countNum2 == countNum3 && countNum2 > countNum1) {
			return new int[] { 2, 3 };
		} else {
			return new int[] { 1, 2, 3 };
		}
	}

	public int num1(int index) {
		return index % 5 + 1;
	}

	public int num2(int index) {
		if (index % 2 == 0) {
			return 2;
		} else {
			switch (index % 8) {
			case 1:
				return 1;
			case 3:
				return 3;
			case 5:
				return 4;
			default:
				return 5;
			}
		}
	}

	public int num3(int index) {
		switch (index % 10) {
		case 0:
		case 1:
			return 3;
		case 2:
		case 3:
			return 1;
		case 4:
		case 5:
			return 2;
		case 6:
		case 7:
			return 4;
		default:
			return 5;
		}
	}
}
