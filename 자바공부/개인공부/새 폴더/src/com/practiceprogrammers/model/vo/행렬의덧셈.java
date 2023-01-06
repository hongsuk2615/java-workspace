package com.practiceprogrammers.model.vo;

public class 행렬의덧셈 {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[0].length];
		for (int index1 = 0; index1 < arr1.length; index1++) {
			for (int index2 = 0; index2 < arr1[0].length; index2++) {
				answer[index1][index2] = arr1[index1][index2] + arr2[index1][index2];
			}
		}
		return answer;
	}
}
