package com.practiceprogrammers.model.vo;

import java.util.HashMap;
import java.util.HashSet;

public class KakaoBlindTest2022 {
	public int[] solution(String[] id_list, String[] report, int k) {

		HashMap<String, HashSet> reportMap = new HashMap<String, HashSet>();
		HashSet<String> reportSet = new HashSet<String>();
		/*
		 * [{key :"id" , value : �Ű��� ���̵�����}]
		 */
		for (String reportStr : report) { 
			reportSet.add(reportStr.split(" ")[1]);
			reportMap.put(reportStr.split(" ")[0], reportSet);
		}
		/*
		 * �Ű���� Ƚ�� ���� 
		 */
		
		
		int[] answer = {};
		return answer;
	}
}
