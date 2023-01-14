package com.practiceprogrammers.model.vo;

import java.util.Arrays;

public class 삼각형완성조건 {
	public int solution(int[] sides) {
        Arrays.sort(sides);
        if(sides[2] < sides[0]+sides[1]) {
        	return 1; 
        }
        return 2;
    }
}
