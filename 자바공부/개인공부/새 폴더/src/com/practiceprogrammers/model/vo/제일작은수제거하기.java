package com.practiceprogrammers.model.vo;

import java.util.Arrays;

public class 제일작은수제거하기 {
	public int[] solution(int[] arr) {
        int[] answer = null;
        if(arr.length == 1) {
        	answer = new int[] {-1};
        }else {
        	answer = new int[arr.length-1];
        	int index = 0;
        	for(int i=0; i < arr.length ; i++) {
        		if(arr[i]== Arrays.stream(arr).min().getAsInt()) {
        			
        		}else {
        			answer[index] = arr[i];
        			index++;
        		}
        	}
        }
        return answer;
    }
}
