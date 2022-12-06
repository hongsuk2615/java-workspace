package com.practiceprogrammers.model.vo;

/*
 * 프로그래머스 안전지대문제
 * https://school.programmers.co.kr/learn/courses/30/lessons/120866?language=java
 * 
 */
public class SafeArea {
	public int solution(int[][] board) {
		int[][] danger = new int[board.length][board.length];
		int answer = 0;
		System.out.println("==========board==========");
	        for(int[] row : board ) {
	        	for(int column : row) {
	        		System.out.print(column);
	        	}
	        	System.out.println();
	        }

		for (int row = 0; row < board.length; row++) {
			for (int column = 0; column < board.length; column++) {
				if (board[row][column] == 1) {
					for (int i = row - 1; i < row + 2; i++) {
						for (int j = column - 1; j < column + 2; j++) {
							if (i >= 0 && j >= 0 && i < board.length && j < board.length) {
								danger[i][j]++;
							}
						}
					}

				}
			}
		}
		
		System.out.println("=======DangerArea=======");
        for(int[] row : danger ) {
        	for(int column : row) {
        		System.out.print(column);
        	}
        	System.out.println();
        }
		for (int row = 0; row < danger.length; row++) {
			for (int column = 0; column < danger.length; column++) {
				if(danger[row][column] == 0) {
					answer++;
				}
			}
		}
		System.out.println("Safe Area : " + answer);
		return answer;
	}
}
