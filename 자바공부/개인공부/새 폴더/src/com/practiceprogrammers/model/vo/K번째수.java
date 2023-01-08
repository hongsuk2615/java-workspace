package com.practiceprogrammers.model.vo;

import java.util.ArrayList;
import java.util.Collections;

public class K번째수 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			answer[i] = subSortValue(array, commands[i][0], commands[i][1], commands[i][2]);
		}
		return answer;
	}

	public int subSortValue(int[] array, int begin, int end, int index) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = begin - 1; i < end; i++) {
			list.add(array[i]);
		}
		Collections.sort(list);
		return list.get(index - 1);
	}
}
