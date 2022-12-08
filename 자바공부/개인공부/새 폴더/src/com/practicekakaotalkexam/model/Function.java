package com.practicekakaotalkexam.model;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Function {
	private HashMap<String, Integer> variable = new HashMap();
	private int counter = 0;

	public void run() {

	}

	public void mov(String param, int value) {
		variable.put(param, value);
		counter++;
	}

	public void add(String param, String param2) {
		variable.put(param, variable.get(param) + variable.get(param2));
		counter++;

	}

	public void add(String param, int input) {
		variable.put(param, variable.get(param) + input);
		counter++;
	}

	public void sub(String param, String param2) {
		variable.put(param, variable.get(param) - variable.get(param2));
		counter++;
	}

	public void sub(String param, int input) {
		variable.put(param, variable.get(param) - input);
		counter++;
	}

	public void jn0(String param, int input) {
		if (variable.get(param) != 0) {
			counter = input;
			return;
		}
		counter++;
	}

	public void prt(String param, int input) {
		System.out.printf("[prt %s %d]\n",param,input);
		Set<Entry<String, Integer>> entryset = variable.entrySet();
		for (Entry<String, Integer> entry : entryset) {
			System.out.print(entry.getKey().toUpperCase() + ":" + entry.getValue() + " ");
		}
		System.out.println();
		System.out.println("출력할 결과는 " + variable.get(param) + ". 프로그램 실행 끝");
		counter = 0;
		clearVariable();
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public void clearVariable() {
		variable.clear();
	}

}
