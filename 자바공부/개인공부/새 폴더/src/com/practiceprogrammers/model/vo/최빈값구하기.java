package com.practiceprogrammers.model.vo;

import java.util.Arrays;

public class 최빈값구하기 {
	public int solution(int[] array) {
		int[] intarr = Arrays.stream(array).distinct().toArray();
		int[] count = new int[intarr.length];

		for (int index2 = 0; index2 < intarr.length; index2++) {
			for (int index1 = 0; index1 < array.length; index1++) {
				if(intarr[index2] == array[index1]) {
					count[index2]++;
				}
			}
		}
		if(count.length != Arrays.stream(count).distinct().count()) {
			return -1;
		}else {
			for(int index = 0 ; index < count.length;index++) {
				if(count[index] == Arrays.stream(count).max().getAsInt()) {
					return intarr[index];
				}
			}
		}
		return -2;
	}
}
