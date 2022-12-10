package com.practicestream.run;

import java.util.ArrayList;

import com.practicestream.model.LamdaCapturing;

public class Run {
	public static void main(String[] args) {

//		ArrayList<Object> list = new ArrayList<Object>();
//		list.add(1);
//		list.add("안녕하세요");
//		list.add(1.4);
//		list.add(true);
//		
//		list.stream().filter(object -> object instanceof Boolean).forEach(System.out::println);
		new LamdaCapturing().increaseOne();
	}
}
