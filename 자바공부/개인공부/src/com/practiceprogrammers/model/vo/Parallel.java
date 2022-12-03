package com.practiceprogrammers.model.vo;

import java.util.Arrays;

public class Parallel {
	public int solution(int[][] dots) {
		double slip[] = new double[dots.length * (dots.length - 1) / 2];
		int x1 = 0;
		int x2 = 0;
		int y1 = 0;
		int y2 = 0;
		int answer = 0;
		int index = 0;
		for (int i = 0; i < dots.length - 1; i++) { 
			for (int j = i + 1; j < dots.length; j++) { 
				x1 = dots[i][0];
				y1 = dots[i][1];
				x2 = dots[j][0];
				y2 = dots[j][1];
				slip[index++] = (double) (y2 - y1) / (x2 - x1);
			}
		}
		System.out.println(Arrays.toString(slip));

		for (int i = 0; i < slip.length; i++) {
			for (int j = i + 1; j < slip.length; j++) {
				if (slip[i] == slip[j]) {
					return 1;
				}
			}
		}

		return answer;
	}

}
