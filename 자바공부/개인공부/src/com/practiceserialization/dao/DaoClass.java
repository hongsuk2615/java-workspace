package com.practiceserialization.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.practiceserialization.model.vo.ChildClass;

public class DaoClass {

//	public void saveObject(ChildClass[] cc, String filename) { // 파일에 객체들을 저장하는 메서드
//
//		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
//			for(ChildClass child : cc) {
//			oos.writeObject(child);}
//			System.out.println("객체를 전부 저장했습니다!!");
//
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	public void saveObject(ChildClass cc, String filename) { // 파일에 객체들을 저장하는 메서드

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename, true))) {
			
			oos.writeObject(cc);
			System.out.println("객체를 저장했습니다!!");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ChildClass[] getObject(String filename, int num) { // 파일에서 객체를 가져오는 메서드
		ChildClass[] objec = new ChildClass[num];
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
			for(int i = 0 ; i < num ; i++) {
			objec[i] = (ChildClass) ois.readObject();
			System.out.printf("객체 %d개 불러들이기 완료! \n",(i+1));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("객체를 다 가져왔습니다.(Exception)");
		}
		return objec;
	}

}
