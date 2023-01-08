package com.practiceprogrammers.model.vo;

import java.util.Arrays;

public class 최소직사각형 {
	public int solution(int[][] sizes) {
		int answer = 0;
		for (int index = 0; index < sizes.length; index++) {
			if (sizes[index][0] < sizes[index][1]) {
				int temp = sizes[index][0];
				sizes[index][0] = sizes[index][1];
				sizes[index][1] = temp;
			}
		}
		int[] widtharr = new int[sizes.length];
		int[] heightarr = new int[sizes.length];
		for (int index = 0; index < sizes.length; index++) {
			widtharr[index] = sizes[index][0];
			heightarr[index] = sizes[index][1];
		}
		answer = Arrays.stream(widtharr).max().getAsInt() * Arrays.stream(heightarr).max().getAsInt();
		return answer;
	}
}
