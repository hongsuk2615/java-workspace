package com.practiceprogrammers.model.vo;

import java.util.TreeSet;

public class 나누어떨어지는숫자배열 {
	public int[] solution(int[] arr, int divisor) {
		int[] answer = null;
        TreeSet<Integer> intTree = new TreeSet<Integer>();
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] % divisor == 0){
                intTree.add(i);
            }
        }
        if(intTree.isEmpty()) {
        	answer = new int[] {-1};
        	return answer;
        }else {
        	answer = new int[intTree.size()];
        	
        	for(int index = 0; index < answer.length; index++) {
        		answer[index] = intTree.first();
        		intTree.pollFirst();
        	}
        	return answer;
        }
    }
}
