package com.practiceprogrammers.model.vo;
public class KakaoMBTI {
    public String solution(String[] survey, int[] choices) {
       String answer = ""; 
		Grade grade = new Grade();
		int i = 0;
		for(String surveyStr : survey) {
			grade.makeGrade(surveyStr.charAt(0), surveyStr.charAt(1), choices[i]);
            i++;
		}
		grade.print();
		return grade.result();
    }
}

class Grade {
	private int r = 0;
	private int t = 0;
	private int c = 0;
	private int f = 0;
	private int j = 0;
	private int m = 0;
	private int a = 0;
	private int n = 0;

	public void makeGrade(char x, char y , int choice){
		if(choice<4) {
			setKindOf(x,4-choice);
		}else if(choice>4){
			setKindOf(y,choice-4);
		}
	}

	public void setKindOf(char x, int value) {
		switch (x) {
		case 'R':
			this.r += value; return;
		case 'T':
			this.t += value; return;
		case 'C':
			this.c += value; return;
		case 'F':
			this.f += value; return;
		case 'J':
			this.j += value; return;
		case 'M':
			this.m += value; return;
		case 'A':
			this.a += value; return;
		case 'N':
			this.n += value; return;
		default:
		}
	}

	public String result() {
		String result = "";
		if (r >= t) {
			result += "R";
		} else {
			result += "T";
		}

		if (c >= f) {
			result += "C";
		} else {
			result += "F";
		}
		if (j >= m) {
			result += "J";
		} else {
			result += "M";
		}
		if (a >= n) {
			result += "A";
		} else {
			result += "N";
		}
		return result;
	}
    public void print() {
		System.out.printf("R : %d T: %d\nC : %d F: %d\nJ : %d M: %d\nA : %d N: %d\n ",r,t,c,f,j,m,a,n);
	}
}