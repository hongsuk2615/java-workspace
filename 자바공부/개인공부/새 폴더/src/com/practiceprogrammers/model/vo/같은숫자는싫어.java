package com.practiceprogrammers.model.vo;

import java.util.ArrayList;

public class 같은숫자는싫어 {
	public int[] solution(int[] arr) {
		int[] answer = null;
        ArrayList<Integer> list = new ArrayList();
        list.add(arr[0]);
		for(int index=0; index < arr.length - 1 ; index++){
            if(arr[index] != arr[index+1]){
                list.add(arr[index+1]);
            }
        }
		answer = new int[list.size()];
		for(int index=0; index < list.size(); index++) {
			answer[index] = list.get(index);
		}
		return answer;
	}
}
