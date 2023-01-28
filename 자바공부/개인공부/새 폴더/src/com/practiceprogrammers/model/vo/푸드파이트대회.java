package com.practiceprogrammers.model.vo;

public class 푸드파이트대회 {
	public String solution(int[] food) {
        StringBuilder strB = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        for(int index = 1 ; index < food.length;index++) {
        	int count = 1;
        	while(count<=food[index]/2) {
        		strB.append(index);
        		count++;
        	}
        }
        answer.append(strB);
        answer.append(0);
        answer.append(strB.reverse());
        
        return new String(answer);
    }
}
