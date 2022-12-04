package com.practiceprogrammers.model.vo;

import java.util.Arrays;

public class Lines {
	public int solution(int[][] lines) {      // 3개의 집합이 있을때 전체집합의 원소의 개수 = A + B + C - ((A∩B)+(B∩C)+(C∩A)) + (A∩B∩C)
		       int answer = 0;
		        int[] line1 = new int[2];
		        int[] line2 = new int[2];
		        int[][] lineCheck = new int[3][2];
		        int[][] lineCheck2 = new int[3][2];
		        int index = 0;
		        for (int i = 0; i < lines.length - 1; i++) {
		            for (int j = i + 1; j < lines.length; j++) {
		                line1[0] = lines[i][0];
		                line1[1] = lines[i][1];
		                line2[0] = lines[j][0];
		                line2[1] = lines[j][1];
		                System.out.printf("line1( %d , %d ) , line2( %d , %d ) \n", line1[0],line1[1],line2[0],line2[1]);
		                lineCheck[index++] = checkline(line1, line2);
		            }
		        }
		        for (int i = 0; i < lineCheck.length; i++) {
		            System.out.println("겹치는 선분 : " + Arrays.toString(lineCheck[i])); 
		        }

		        for(int[] line : lineCheck) { // 여러번 겹치는것 상관없이 일단 총합 계산 A + B + C
		            answer += line[1] - line[0];
		        }
		        System.out.println(answer);
		        index = 0;
		        for (int i = 0; i < lineCheck.length - 1; i++) {
		            for (int j = i + 1; j < lineCheck.length; j++) {
		                line1[0] = lineCheck[i][0];
		                line1[1] = lineCheck[i][1];
		                line2[0] = lineCheck[j][0];
		                line2[1] = lineCheck[j][1];
		                System.out.printf("line1( %d , %d ) , line2( %d , %d ) \n", line1[0],line1[1],line2[0],line2[1]);
		                lineCheck2[index++] = checkline(line1, line2);
		            }
		        }

		        for(int[] line : lineCheck2) { // 2번겹치는부분  빼기 - ((A∩B)+(B∩C)+(C∩A))
		            answer -= line[1] - line[0];
		        }

		        index = 0;
		        for (int i = 0; i < lineCheck2.length - 1; i++) { 
		            for (int j = i + 1; j < lineCheck2.length; j++) {
		                line1[0] = lineCheck2[i][0];
		                line1[1] = lineCheck2[i][1];
		                line2[0] = lineCheck2[j][0];
		                line2[1] = lineCheck2[j][1];
		                System.out.printf("line1( %d , %d ) , line2( %d , %d ) \n", line1[0],line1[1],line2[0],line2[1]);
		                lineCheck[index++] = checkline(line1, line2);
		            }
		        }
		        answer += lineCheck[0][1] - lineCheck[0][0]; // 3번 겹치는 부분 더하기 + (A∩B∩C)
		        System.out.println(answer); 
		        return answer;
		    }

		    public int[] checkline(int[] line1, int[] line2) { //겹치는 부분 체크 메서드
		        int[] line = new int[2];
		        if (line2[0] >= line1[0] && line2[0] < line1[1] && line2[1] >= line1[1]) {
		            line[0] = line2[0];
		            line[1] = line1[1];
		        } else if(line2[1] > line1[0] && line2[1] <= line1[1] && line2[0] <= line1[0]) {
		            line[0] = line1[0];
		            line[1] = line2[1];
		        }else if(line1[0] <= line2[0] && line1[1] >= line2[1]) {
		            line[0] = line2[0];
		            line[1] = line2[1];
		        }else if(line2[0] <= line1[0] && line2[1] >= line1[1]) {
		            line[0] = line1[0];
		            line[1] = line1[1];
		        }else if(line2[0] == line1[0] && line2[1] == line1[1]){
		            line[0] = line1[0];
		            line[1] = line1[1];
		        }else{
		            line[0] = 0;
		            line[1] = 0;
		        }
		        System.out.printf("line[0] : %d line[1] : %d \n",line[0],line[1]);
		        return line;
		    }
}
