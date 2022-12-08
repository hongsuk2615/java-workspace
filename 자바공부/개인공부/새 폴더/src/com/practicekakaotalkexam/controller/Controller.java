package com.practicekakaotalkexam.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.practicekakaotalkexam.model.Function;

public class Controller {
	private Scanner sc = new Scanner(System.in);
	private ArrayList<String[]> orderProcess = new ArrayList<String[]>();
	private Function function = new Function();

	public void saveFunction() { // 명령어 저장메서드
		String[] orderArray = new String[3];
		while (true) {
			System.out.print(">> ");
			String order = sc.nextLine();
			if (order.equals("go"))
				break;
			else {
				orderArray = order.split(" ");
				orderProcess.add(orderArray); // <{함수명령어, 매개변수, 매개변수},...>
			}
		}
		System.out.println("==========명령어 리스트=========");
		for (String[] str : orderProcess) {
			System.out.println(Arrays.toString(str));
		}
		System.out.println("==============================");
	}

	public void runFunction() throws Exception { // 실제 동작메서드 
		System.out.println("============동작시작===========");
		while (true) {
			switch (orderProcess.get(function.getCounter())[0]) {
			case "mov":
				function.mov(orderProcess.get(function.getCounter())[1],
						Integer.parseInt(orderProcess.get(function.getCounter())[2]));
				break;
			case "add":
				if (isInteger(orderProcess.get(function.getCounter())[2])) {
					function.add(orderProcess.get(function.getCounter())[1],
							Integer.parseInt(orderProcess.get(function.getCounter())[2]));
				} else {
					function.add(orderProcess.get(function.getCounter())[1],
							orderProcess.get(function.getCounter())[2]);
				}
				break;
			case "sub":
				if (isInteger(orderProcess.get(function.getCounter())[2])) {
					function.sub(orderProcess.get(function.getCounter())[1],
							Integer.parseInt(orderProcess.get(function.getCounter())[2]));
				} else {
					function.sub(orderProcess.get(function.getCounter())[1],
							orderProcess.get(function.getCounter())[2]);
				}
				break;
			case "jn0":
				function.jn0(orderProcess.get(function.getCounter())[1],
						Integer.parseInt(orderProcess.get(function.getCounter())[2]));
				break;
			case "prt":
				function.prt(orderProcess.get(function.getCounter())[1],
						Integer.parseInt(orderProcess.get(function.getCounter())[2]));
				return;
			default:
				System.out.println("없는 함수입력 입니다.");
				function.clearVariable();
				function.setCounter(0); // 초기화
				return;
			}
		}
	}

	private boolean isInteger(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
