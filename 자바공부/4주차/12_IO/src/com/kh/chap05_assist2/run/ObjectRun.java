package com.kh.chap05_assist2.run;

import com.kh.chap05_assist2.model.dao.ObjectDao;
import com.kh.chap05_assist2.model.dao.ObjectsDao;

public class ObjectRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectDao od = new ObjectDao();
		
//		od.fileSave("Phone.txt"); //객체단위로 기록되어있기 때문에 깨져보이지만 제대로 기록된것.
//		od.fileRead();
		
		ObjectsDao ods = new ObjectsDao();
//		ods.fileSave("PhoneList.txt");
		ods.fileRead();
	}

}
