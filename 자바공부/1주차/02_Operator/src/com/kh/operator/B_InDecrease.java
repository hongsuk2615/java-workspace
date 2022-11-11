package com.kh.operator;

public class B_InDecrease {

	/*
	 * 증감연산자(단항연산자) ++ -- ++ : 변수에 담긴 값을 1 증가시키는 연산자 ++변수 (전위연산자) 변수++ (후위 연산자)
	 * 
	 * -- : 값을 1 감소시키는 연산자 --변수 (전위연산자) 변수-- (후위 연산자)
	 * 
	 * (증감연산자) 변수 : 전위연산 -> 선증감 후 처리. 변수 (증감연산자) : 후위연산 -> 선처리 후 증감.
	 * 
	 */
	public void method1() {
		// 전위연산 테스트
		int num = 10;
		System.out.println("전위연산 적용 전 num : " + num); // 10
		System.out.println("1회 수행후 결과 : " + ++num); // 10에서 증감연산을 먼저 실행하여 11로 num값을 증가
		System.out.println("2회 수행후 결과 : " + ++num); // 12
		System.out.println("3회 수행후 결과 : " + ++num); // 13
		System.out.println("최종 num : " + num); // 13
		System.out.println("===========================================");

		// 후위연산 테스트
		int num2 = 10;
		System.out.println("후위연산 적용 전 num : " + num2); // 10
		System.out.println("1회 수행후 결과 : " + num2++); // 10출력후 1증가

		// 즉, 출력당시에는 10이 출력되고, 출력처리가 끝나고 나서 11로 증감처리됨.
		System.out.println("2회 수행후 결과 : " + num2++); // 11
		System.out.println("3회 수행후 결과 : " + num2++); // 12
		System.out.println("최종 num : " + num2); // 13
	}

	public void method2() {
		// 전위연산
		int a = 10;
		int b = ++a;
		System.out.println("a : " + a + " , b : " + b); // a = 11, b = 11

		// 후위연산
		int c = 10;
		int d = c++;
		System.out.printf("c : %d , d : %d \n", c, d); // c = 11, d = 10
		
		//======================================================
		//예측
		int num = 20;
		System.out.println("현재 num : " + num);   //출력 : 20 출력후 num값 : 20
		System.out.println("++num ? " + ++num);   //출력 : 21 출력후 num값 : 21
		System.out.println("num++ ? " + num++);   //출력 : 21 출력후 num값 : 22
		System.out.println("--num ? " + (--num)); //출력 : 21 출력후 num값 : 21
		System.out.println("num++ ? " + (num--)); //출력 : 21 출력후 num값 : 20
		System.out.println("최종 num ? " + num);    //출력 : 20 출력후 num값 : 20
	}
	
	public void method3() {
		
		int num1 = 20;
		int result1 = num1++ * 3; // result1 = 20*3 , num1 = 21
		
		System.out.println("num1 : " + num1);
		System.out.println("result1 : " + result1);
		
		int num2 = 20;
		int result2 = ++num2 * 3; // result2 = 21*3 , num2 = 21
		
		System.out.println("num2 : " + num2);
		System.out.println("result2 : " + result2);
	}
	
	public void method4() {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		//주석으로 어떻게 값이 출력될지 예상해보기.
		
		System.out.println(a++);               // 출력값 : 10 a값 : 11
		System.out.println((++a)+(b++));       // 출력값 : 33 a값 : 12  b값 : 21
		System.out.println((a++)+(--b)+(--c)); // 출력값 : 62 a값 : 13  b값 : 20 c값 :29
		System.out.println("a : " + a + ", b : " + b + ", c : " + c); // a값 : 13  b값 : 20 c값 :29
	}
	
	public void quiz() {
		
		int a = 5;
		int b = 10;
		
		int c = (++a) + b ; // a : 6 , c :16
		int d = c/a ;       // d : 2
		int e = c % a;      // e : 4
		int f = e++;        // f : 4  e : 5
		int g = (--b) + (d--); // b : 9 , d : 1, g : 11
		int h = 2;
		int i = (a++) + b / (--c/f)*(g-- - d)%(++e + h); // a+b/(c/f)*(g-d)%(e+1+h) 
		                                                 // = 6+9/3*(11-1)%8
                                                         // = 6+3*10%8 = 6 + 6 = 12 
		
		                                                 // a : 7 , c : 15 , g :10 , e : 6
		
		System.out.println("a : " +a); // 7
		System.out.println("b : " +b); // 9
		System.out.println("c : " +c); // 15
		System.out.println("d : " +d); // 1
		System.out.println("e : " +e); // 6
		System.out.println("f : " +f); // 4
		System.out.println("g : " +g); // 10
		System.out.println("h : " +h); // 2
		System.out.println("i : " +i); // 12
		
		
	}
}
