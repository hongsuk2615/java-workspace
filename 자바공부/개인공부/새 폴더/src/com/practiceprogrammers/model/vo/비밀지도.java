package com.practiceprogrammers.model.vo;

public class 비밀지도 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		for (int index = 0; index < n; index++) {
			answer[index] = Integer.toBinaryString(arr1[index] | arr2[index]).replace('1','#').replace('0',' '); // bitwiseOr
				while (answer[index].length() != n) {
					answer[index] = " " + answer[index];
				}
				System.out.println(answer[index]);
		}
		return answer;
	}
	public static void main(String[] args) {
		int[] arr1 = {0,0,0,0,0};
		int[] arr2 = {30,1,21,17,28};
		new 비밀지도().solution(5, arr1, arr2);
	}
}
