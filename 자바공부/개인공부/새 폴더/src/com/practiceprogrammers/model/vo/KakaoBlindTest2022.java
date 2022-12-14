package com.practiceprogrammers.model.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class KakaoBlindTest2022 {
	public int[] solution(String[] id_list, String[] report, int k) {

		HashMap<String, HashSet<String>> reportMap = new HashMap<String, HashSet<String>>();
		/*
		 * reportMap : [{key :"id" , value : 신고한 아이디집합}]
		 */
		for (String reportStr : report) {
			reportMap.put(reportStr.split(" ")[0], new HashSet<String>() { //생성과 동시에 초기화
				{
					add(reportStr.split(" ")[1]);
				}
			});
		}
		HashMap<String, Integer> reportedNum = new HashMap<String, Integer>();

		/*
		 * reportedNum : [ {key : "id", value : 신고당한 횟수}]
		 */

	}

	int[] answer = {};return answer;
}}
