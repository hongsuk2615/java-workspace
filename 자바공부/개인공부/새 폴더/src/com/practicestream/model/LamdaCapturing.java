package com.practicestream.model;

import java.util.Arrays;

public class LamdaCapturing {

	public synchronized void increaseOne() {
		int one = 0;
		int[] intArr = { 0, 1, 2, 3, 4 };
		Arrays.stream(intArr).filter(Int -> Int == 0).forEach(Int -> {
//			one++;
			System.out.println(Int + one);
		});

	}

}
