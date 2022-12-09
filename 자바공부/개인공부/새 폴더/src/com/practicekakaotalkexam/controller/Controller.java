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
			int counter = function.getCounter();
			String functionString = orderProcess.get(counter)[0]; //함수 문자열
			String parameter1 = orderProcess.get(counter)[1]; //첫번째 매개변수
			String parameter2 = orderProcess.get(counter)[2]; //두번째 매개변수
			switch (functionString) {
			case "mov":
				function.mov(parameter1, Integer.parseInt(parameter2));
				break;
			case "add":
				if (isInteger(parameter2)) {
					function.add(parameter1, Integer.parseInt(parameter2));
				} else {
					function.add(parameter1, parameter2);
				}
				break;
			case "sub":
				if (isInteger(parameter2)) {
					function.sub(parameter1, Integer.parseInt(parameter2));
				} else {
					function.sub(parameter1, parameter2);
				}
				break;
			case "jn0":
				function.jn0(parameter1, Integer.parseInt(parameter2));
				break;
			case "prt":
				function.prt(parameter1, Integer.parseInt(parameter2));
				orderProcess.clear();//prt 명령어 실행시 명령어리스트 초기화
				return;
			default:
				System.out.println("없는 함수입력 입니다.");
				function.clearVariable();
				orderProcess.clear();
				function.setCounter(0); // 초기화
				return;
			}
		}
	}

	private boolean isInteger(String str) { //정수변환 가능여부 
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
