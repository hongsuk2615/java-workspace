package com.practiceprogrammers.model.vo;

import java.util.HashMap;
import java.util.HashSet;

public class KakaoBlindTest2022 {
	public int[] solution(String[] id_list, String[] report, int k) {

		HashMap<String, HashSet> reportMap = new HashMap<String, HashSet>();
		HashSet<String> reportSet = new HashSet<String>();
		/*
		 * [{key :"id" , value : 신고한 아이디집합}]
		 */
		for (String reportStr : report) { 
			reportSet.add(reportStr.split(" ")[1]);
			reportMap.put(reportStr.split(" ")[0], reportSet);
		}
		/*
		 * 신고받은 횟수 정리 
		 */
		
		
		int[] answer = {};
		return answer;
	}
}
