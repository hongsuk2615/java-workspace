package com.practiceprogrammers.model.vo;

import java.util.Arrays;
import java.util.HashSet;

public class 두개뽑아서더하기 {
	public int[] solution(int[] numbers) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int index = 0 ; index < numbers.length - 1 ; index++) {
			for(int index2 = index+1 ; index2 < numbers.length ; index2++ ) {
				set.add(numbers[index]+numbers[index2]);
			}
		}
		
        Integer[] integerArr = new Integer[set.size()];
        set.toArray(integerArr);
        int[] answer = new int[integerArr.length];
        for(int index = 0 ; index < answer.length ; index++) {
        	answer[index] = integerArr[index];
        }
        Arrays.sort(answer);
        return answer;
    }
}
