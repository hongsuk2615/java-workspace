package com.kh.chap05_assist2.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap05_assist2.model.vo.Phone;

public class ObjectDao {
	
	//프로그램 ---> 파일(출력)
	
	public void fileSave(String fileName) {
		
		Phone phone = new Phone("아이폰",1500000);
		
		//객체단위로 파일의 입출력하고자 할때 필요한 스트림
		//FileOutputStream : 파일에 데이터를 출력하는 기반스트림
		//ObjectOutputStream : 객체단위로 출력할 수 있도록 도와주는 보조스트림
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
			oos.writeObject(phone);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// 프로그램 <---- 파일
	public void fileRead() {
		//FileInputStream : 파일로부터 데이터를 읽어들이기 위해 사용하는 기반스트림
		//ObjectInputStream : 객체단위로 데이터를 입력받기 위해 사용하는 보조스트림
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone.txt"))){
			Phone p= (Phone)ois.readObject();
			System.out.println(p);	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
