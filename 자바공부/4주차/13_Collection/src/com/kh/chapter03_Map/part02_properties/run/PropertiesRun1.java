package com.kh.chapter03_Map.part02_properties.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chapter03_Map.part01_hashMap.model.vo.Snack;

public class PropertiesRun1 {
	
	public static void main(String[] args) {
		
		//Properties : Map계열 => key, value세트로 저장.
		//	   	 	   단. key, value값 모두 String으로 제한
		
		Properties prop = new Properties();
		
		//String이 아닌 값을 넣게 될 경우.
//		prop.put("다이제", new Snack("초코",1000));
//		System.out.println(prop);
//		System.out.println(prop.get("다이제"));
//		
//		//단, 주로 properties를 사용하는 경우는 properties에 담겨있는 key + value값 세트들을 파일로 기록하기 위해 사용됨.
//		
//		try {
//			prop.store(new FileOutputStream("test.properties"),"Properties test");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		//Properties에 값을 추가할때는 보통
		// 1.setProperty(String key, String value)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		System.out.println(prop ); //저장 순서 유지 X, key값 중복 안됨
		
		//값 가져오기
		//2. getProperty(String key) : String
		System.out.println(prop.getProperty("Set"));
		
		//3. store(OutputStream os, String Comments) : Properties에 담긴 key - value값을 파일로 출력
		//DB , XML에 쓰임
		try {
			prop.store(new FileOutputStream("test.properties"), "Properties test");
			
			//4. storToXML(OutputStream os, String Comments) : Properties에 담긴 key-value값을 xml문서로 출력
			prop.storeToXML(new FileOutputStream("test.xml"),"Properties test");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
					   
	}

}
