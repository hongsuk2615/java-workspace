package com.kh.chap02_string.controller;

public class B_StringMethodTest {

	//문자열과 관련된 메서드
	public void method() {
		
		String str1 = "Hello World";
		
		//1.문자열.charAt(int index) : char
		//  문자열에서 전달받은 index의 위치에 있는 문자 하나만 뽑아서 리턴
		
		char ch = str1.charAt(3);
		System.out.println("ch : " + ch);
		
		// 2. 문자열.concat(String str) : String
		//    문자열과 전달된 또다른 문자열을 하나로 합쳐서 리턴
		
		String str2 = str1.concat("!!!");
		System.out.println(str2);
		
		// 3. 문자열.length() : int
		// 문자열의 길이 반환.
		System.out.println("str1의 길이 : " + str1.length());
		
		// 4. 문자열.substring(int beginIndex) : String
		//    => 문자열의 beginIndex위치에서 부터 끝까지의 문자열을 추출해서 리턴
		//    => 문자열.substring(int beginIndex, int endIndex) : String
		//    => 문자열의 beginIndex의 위치헤서부터 endIndex-1 까지의 문자열을 추출해서 리턴
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(0, 6));
		
		// 5. 문자열.replace(char old, char new) : String
		//    => 현재문자열에서 old문자를 new문자로 대체(replace)하고 변환한 문자열을 반환
		String str3 = str1.replace('l', 'a');
		System.out.println(str3);
		
		
	}
}
