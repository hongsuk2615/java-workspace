package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {

	private HashMap<String, Member> map = new HashMap();

	public boolean joinMembership(String id, Member m) {
		if (map.containsKey(id)) {
			return false;
		} else {
			map.put(id, m);
			return true;
		}
	}

	public String login(String id, String password) {
		if (map.containsKey(id) && map.get(id).getPassword().equals(password)) {
			return map.get(id).getName();
		}
		return null;
	}

	public boolean changePassword(String id, String oldPw, String newPw) {
		if (map.containsKey(id)&&map.get(id).getPassword().equals(oldPw)) {
			map.get(id).setPassword(newPw);
			return true;
		}else {
			return false;
		}
	}

	public void changeName(String id, String newName) {
		map.get(id).setName(newName);
	}

	public TreeMap<String, Member> sameName(String name) {
		TreeMap<String, Member> tm = new TreeMap<String, Member>();  // 오름차순객체
		for(String id : map.keySet()) {
			if(map.get(id).getName().equals(name)) {
				tm.put(id, map.get(id));
			}			
		}
		return tm;
	}
}
