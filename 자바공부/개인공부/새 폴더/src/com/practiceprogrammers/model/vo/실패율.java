package com.practiceprogrammers.model.vo;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class 실패율 {
	public int[] solution(int N, int[] stages) { // 실패율 : 요소값이 N 인 요소 갯수/ N이상인 요소 갯수
		int[] answer = {};
		TreeMap<Double, Integer> failureMap = new TreeMap<Double, Integer>();
		for (int index = 0; index < N; index++) {
			failureMap.put(failRate(index+1, stages),index+1);
		}
		failureMap.entrySet().stream().reverse
		
		
		
		
			return answer;
	}

	public double failRate(int n, int[] stages) {
		long countN = Arrays.stream(stages).filter((m) -> {
			if (m == n) {
				return true;
			} else
				return false;
		}).count();
		if (countN != 0) {
			long countM = Arrays.stream(stages).filter((m) -> {
				if (m >= n) {
					return true;
				} else
					return false;
			}).count();
			return (double) countN / countM * 100;
		} else {
			return 0;
		}

	}
}
