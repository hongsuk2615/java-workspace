package com.practiceserialization.run;

import com.practiceserialization.dao.DaoClass;
import com.practiceserialization.model.vo.ChildClass;

public class Run {
	static final int CHILDNUM = 3;
	static final String FILENAME = "객체들저장.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass[] ccArray = new ChildClass[CHILDNUM];
		ccArray[0] = new ChildClass(1, 2);
		ccArray[1] = new ChildClass(3, 4);
		ccArray[2] = new ChildClass(5, 6);

		DaoClass dc = new DaoClass();
//		dc.saveObject(ccArray, FILENAME);
		for (int i = 0; i < CHILDNUM; i++) {
			dc.saveObject(ccArray[i], FILENAME);
		}
		ChildClass[] ccArray2 = new ChildClass[CHILDNUM];
		ccArray2 = (ChildClass[]) dc.getObject(FILENAME, CHILDNUM);
		for (ChildClass child : ccArray2) {
			child.printdata();
		}
	}

}
