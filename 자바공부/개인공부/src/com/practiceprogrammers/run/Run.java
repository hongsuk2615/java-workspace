package com.practiceprogrammers.run;

import com.practiceprogrammers.model.vo.Dot;
import com.practiceprogrammers.model.vo.Solution;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringSplit ss = new StringSplit();
//		ss.solution("banana");
//		Dot d = new Dot();
//		d.solution(1,5);
		String[] quiz = {"19 - 6 = 13", "5 + 66 = 71","5 - 15 = 63", "3 - 1 = 2"};
		Solution s = new Solution();
		s.solution(quiz);
	}

}
