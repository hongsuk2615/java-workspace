package com.practiceprogrammers.model.vo;

import java.util.Arrays;

public class 폰켓몬 {
	public int solution(int[] nums) {
        if(Arrays.stream(nums).distinct().count() <= nums.length/2) {
        	return (int)Arrays.stream(nums).distinct().count();
        }else {
        	 return nums.length/2;
        }
    }
}
