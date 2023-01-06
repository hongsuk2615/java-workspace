package com.practiceprogrammers.model.vo;

public class 약수의개수와덧셈 {
	public int solution(int left, int right) {
        int answer = 0;
        for(int index = left ; index <=right ; index++){
            if(Math.sqrt(index) == (int)Math.sqrt(index)){
                answer -= index;
            }else{
                answer += index;
            }
        }
        return answer;
    }
}
