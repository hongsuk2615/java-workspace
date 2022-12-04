package com.practiceprogrammers.run;

import com.practiceprogrammers.model.vo.Dot;
import com.practiceprogrammers.model.vo.Lines;
import com.practiceprogrammers.model.vo.Parallel;
import com.practiceprogrammers.model.vo.Solution;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringSplit ss = new StringSplit();
//		ss.solution("banana");
//		Dot d = new Dot();
//		d.solution(1,5);
//		String[] quiz = {"19 - 6 = 13", "5 + 66 = 71","5 - 15 = 63", "3 - 1 = 2"};
//		Solution s = new Solution();
//		s.solution(quiz);
		
//		Parallel p = new Parallel();
//		int[][] dots = {{1,4},{9,2},{3,8},{11,6},{5,5}};
//		p.solution(dots);
		Lines l = new Lines();
		int[][] lines = {{0, 5}, {3, 9}, {1, 10}};
		l.solution(lines);
		
	}

}
