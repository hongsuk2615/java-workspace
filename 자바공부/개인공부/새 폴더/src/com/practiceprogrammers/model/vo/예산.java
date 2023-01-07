package com.practiceprogrammers.model.vo;

import java.util.Arrays;

public class 예산 {
	public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int index = 0; index < d.length; index++) {
        	if(budget<d[index]) {
        		break;
        	}
        	budget -= d[index];
        	answer++;
        }
        return answer;
    }
}
