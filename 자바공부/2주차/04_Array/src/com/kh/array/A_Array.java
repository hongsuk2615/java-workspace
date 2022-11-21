package com.kh.array;

import java.util.Scanner;

public class A_Array {
	/*
	 * 변수 : 하나의 공간에 하나의 값을 담을 수 있음 ex) int a = 10; a = 20;
	 * 
	 * 
	 * 배열 : 하나의 공간에 여러개의 값을 담을 수가 있음.(단, 같은 자료형의 값으로만 가능) 정확히 얘기하자면 배열의 각 인덱스 자리에
	 * 실제값이 담김(인덱스 0 부터 시작) ex) int[] a = new int[3] ; // int형의 자료가 들어갈 수 있는 공간을 3개
	 * 만든다.
	 * 
	 */

	public void method1() {
		// 배열을 왜 써야할까
		// 만약에 변수만을 가지고 프로그래밍을 하게 되면
		// 0,1,2,3,4 .. 로 기록해야함
		/*
		 * 변수를 이용하여 각각의 데이터를 보관하고자 할 때 -> 각각의 변수를 만들어서 따로 관리해야함. 출력할때는 일일이 출력해야함.(반복문
		 * 사용불가)
		 * 
		 * 배열을 가지고 프로그래밍 하기
		 * 
		 * [표현법] 자료형 [] 배열명; 자료형 배열명 [];
		 * 
		 * 
		 * 
		 * 
		 */

		int[] arr = new int[5];
		/*
		 * 배열의 각 인덱스(=방번호) 자리에 값 대입 [표현법] 배열명[인덱스] = 값;
		 * 
		 * 배열의 가장큰 장점 = 반복문 사용가능
		 */
		for (int i = 0; i < 5; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < 5; i++) {
			System.out.printf("%d번 인덱스의 값 : %d\n", i, arr[i]);
		}
	}

	public void method2() {
		int i = 10; // 일반 변수. i라는 박스에 10이라는 값이 담겨있음
		int[] arr = new int[5];
		// 배열 자료형
		/*
		 * 우선 대입연산자 기준 왼쪽이 먼저 실행되므로 arr이라는 int형 배열 박스가 먼저 만들어짐.(stack) 그다음 int[5]짜리 방이
		 * heap영역에 생성됨(int 0 으로 초기화, 주소값이 할당) 마지막으로 대입연산자가 실행되면서 주소값이 arr에 할당이 됨
		 * 
		 */
		System.out.println("i :" + i);
		System.out.println("arr : " + arr);
		System.out.println("arr의 해시코드값 : " + arr.hashCode()); // 해시코드 : 주솟값을 10진수로 변환한것

		double[] dArr = new double[3];
		System.out.println(dArr);
		System.out.println("dArr의 해시코드값 : " + dArr.hashCode());

		/*
		 * 기본자료형(boolean, char, byte, short, int, long, float, double) =>실제 값(리터럴)을 바로
		 * stack영역에서 담을수 있는 변수 => 일반변수
		 * 
		 * 그외 자료형(int[] , double[], ... , String, Scanner, ...) => 주소값을 담고 있는 변수 : 참조변수
		 * (reference 변수)
		 */
	}

	public void method3() {
		int[] iArr = new int[3];
		double[] dArr = new double[3];

		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}

		for (int i = 0; i < dArr.length; i++) {
			System.out.println(dArr[i]);
		}

	}

	public void method4() {
		int[] arr = new int[5];

		// 각 배열의 인덱스에 값을 대입하는 반복문

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		System.out.println(arr[4]);
	}
	
	public void method5() {
		int i = 0 ;
		String str = null;
		int[] arr = null; // null값 할당가능. 주소값을 담을 수 있는 변수의 기본값은 null.
		/* 
		 * 기본값이 null인 변수를 가지고 메소드를 호출한다거나 특정 어딘가에 접근하고자 한다면
		 * 무조건 오류발생 - > NullponterException
		 */
	}
	
	public void method6() {
		int[] arr = new int[5];
		/*
		 * arr[0] = 2
		 * arr[1] = 4
		 * arr[2] = 6
		 * arr[3] = 8
		 * arr[4] = 10
		 */
		
		for(int i = 0 ; i < arr.length;i++) {
			arr[i] = 2*i+2;
			System.out.printf("arr[%d] : %d\n",i,arr[i]);
		}
		
		System.out.println("====arr변경전====");
		System.out.println(arr);
		System.out.println(arr.hashCode());
		
		arr = new int[7];
		System.out.println("====arr변경후====");
		System.out.println(arr);
		System.out.println(arr.hashCode());
	}
	
	public void method7() {
		//배열 선언과 동시에 할당(크기지정)
		int[] arr =  new int[4];
		//각 인덱스에 값 초기화(대입)
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		//배열 선언 및 동시에 초기화(대입)
		int[] arr1 = new int[] {1, 2, 3, 4}; //방법1
		
		int[] arr2 = {1, 2, 3, 4};// 방법2
		
		System.out.println(arr1 == arr2); // 주소값의 비교가 되기때문에 false
		
		
	}
	
	public void method8() {
		//1. 크기10짜리 정수(int)배열 선언.
		//2. 반복문을 활용해서 0번인덱스부터 마지막 인덱스까지 순차적으로 접근하면서 값을 대입. 대입하는 값은 랜덤값(1~100)
		//3. 반복문 활용해서 0번인덱스 ~ 마지막 인덱스까지 배열에 담긴값 출력
		
		int[] arr = new int[10];
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100+1);
			System.out.printf("arr[%d] : %d\n",i,arr[i]);
		}
	}
	
	public void method9() {
		//1.사용자에게 매번 키의 정보를 입력받은후 해당 크기만큼 문자열 배열 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 : ");
		int size = sc.nextInt();
		
		String [] arr = new String[size];
		
		//2.반복문을 활용해서 매번 사용자에게 과일명을 입력받아 그 값을 매~인덱스 자리에 대입
		sc.nextLine();
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			System.out.print("과일명을 쓰세요 : ");
			arr[i] = sc.nextLine();
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.printf("arr[%d] : %s\n", i , arr[i]);
			
		}
	}
	
	public void method10() {
		// 각각의 문자들을 char 배열에 옮겨담기
		//1. 사용자에게 문자열 입력받기
		//2. char배열 생성해두기(배열크기 == 문자열의 길이만큼)
		//3. 문자열에서 각 인덱스 별로 문자를 뽑아서 char배열의 각 인덱스에 담기
		//4. char배열의 각 인덱스값 출력
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] arr = new char[str.length()];
		
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		for(int i = 0 ; i < arr.length; i++) {
			System.out.printf("arr[%d] : %c \n " , i , arr[i] );
		}
	}
	
	public void method11() {
		//1. 사용자에게 배열의 길이를 입력받은후, 해당 크기만큼 정수배열 생성
		//2. 반복문 활용해서 0번 인덱스 부터 마지막 인덱스까지 순차적으로 접근하면서 값 대입 -> 랜덤값(1~100)
		//3. 반복문 활용해서 0번 인덱스~마지막인덱스까지 배열에 담긴값 출력과 동시에, 해당 인덱스에 담긴값이 짝수인 경우 그 값의 총합 구하기
		
		System.out.print("배열의 길이를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		int sum = 0 ;
		
		for(int i = 0 ; i < arr.length;i++) {
			arr[i] = (int)(Math.random()*100 + 1 );
		}
		for (int i = 0 ; i < arr.length;i++) {
			System.out.printf("arr[%d] : %d \n", i, arr[i]);
			if(arr[i]%2==0) {
				sum+=arr[i];
			}
		}
		System.out.println("짝수의 총합 : " + sum);
	}
}
