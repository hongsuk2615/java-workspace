package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {

	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];

	public int[] personCount() {
		int[] count = new int[2];
		count[0] = 0;
		count[1] = 0;
		for(Student student : s) {
			if(student != null) {
				count[0]++;
			}
		}
		
		for (Employee employee : e) {
			if(employee != null) {
				count[1]++;
			}
		}
		return count;
	}

	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for(int index = 0 ; index < s.length ; index++) {
			if(s[index] == null) {
				s[index] = new Student(name, age, height, weight, grade, major);
				break;
			}
		}
	}

	public Student[] printStudent() {
		Student[] printStd = new Student[personCount()[0]];
		int resultIndex = 0;
		for(int index = 0 ; index < s.length ; index++) { 
			if(s[index] != null) {  //s 요소 중 null이 아닌 요소
				printStd [resultIndex] = s[index]; 
				resultIndex++;
			}
		}
		return printStd;
	}

	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for(int index = 0 ; index < e.length ; index++) {
			if(e[index] == null) {
				e[index] = new Employee(name, age, height, weight, salary, dept);
				break;
			}
		}
	}

	public Employee[] printEmployee() {
		Employee[] printEmp = new Employee[personCount()[1]];
		int resultIndex = 0;
		for(int index = 0 ; index < e.length ; index++) { 
			if(e[index] != null) {  //e 요소 중 null이 아닌 요소
				printEmp [resultIndex] = e[index]; 
				resultIndex++;
			}
		}
		return printEmp;
		
	}

}
