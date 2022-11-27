package test.run;

import test.vo.TestFor;
import test.vo.TestForEach;

public class Run {

	public static void main(String[] args) {
		TestForEach test = new TestForEach();
		test.testForEach();
		TestFor test2 = new TestFor();
		test2.testFor();

	}

}
