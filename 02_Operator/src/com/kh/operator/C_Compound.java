package com.kh.operator;

public class C_Compound {
	/*
	 * 복합대입 연산자 : 산술연산자와 대입연산자를 함께 사용하는 연산자
	 * 
	 * += -= *= /= %=
	 * 
	 * a = a + 3 ; -> a += 3 ;
	 * 기존의 a 값에 3을 더해 a에 다시 대입해주겠다는 뜻
	 * 
	 */
	
	public void method() {
		
		int num = 12;
		
		System.out.println("현재 num : " + num);
		
		num = num + 3;
		System.out.println("3을 증가시킨 num : " + num); //15
		
		num += 3 ;
		
		System.out.println("또 증가시킨 num : " + num); //18
		
		num -= 5; //num을 5 감소시키기
		System.out.println("5 감소시킨 num : " + num); // 13
		
		num *= 6; //num을 6배 증가시키기
		System.out.println("6배 증가시킨 num : " + num); // 78
		
		num /= 2; //num을 2배 감소시키기
		System.out.println("2배 감소시킨 num : " + num); // 39
		
		num %= 4;
		//num을 4로 나눴을때 나머지값을 num에 대입
		System.out.println("4로나눈 나머지 num : " + num); // 3
		
		// += 의 경우 문자열 접합도 가능하다.
		
		String str = "Hello";
		// str = str + "World";
		str += "World";
		System.out.println(str);
		
	}

}
