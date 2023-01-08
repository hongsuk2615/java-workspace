package com.practiceprogrammers.model.vo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class 문자열마음대로정렬 {
	public String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];
		Arrays.sort(strings);
		ArrayList<String> list = new ArrayList<String>();
		HashSet<String> set = new HashSet<String>();
		for (int index = 0; index < strings.length; index++) {
			set.add("" + strings[index].charAt(n));
		}
		String[] indexStr = new String[set.size()];
		set.toArray(indexStr);
		Arrays.sort(indexStr);
		for(int index1=0; index1 < indexStr.length;index1++) {
			for(int index2 = 0; index2 < strings.length ; index2++) {
				if(indexStr[index1].charAt(0)== strings[index2].charAt(n)) {
					list.add(strings[index2]);
				}
			}
		}
		list.toArray(answer);

		return answer;
	}

	public static void main(String[] args) {
		String[] strings = { "sun", "bed", "car" };
//		Arrays.sort(strings);
//		System.out.println(strings[1]);
	}
}
