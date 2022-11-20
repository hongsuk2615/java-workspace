package com.kh.array;

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
			//배열 자료형
			/*
			 * 우선 대입연산자 기준 왼쪽이 먼저 실행되므로 arr이라는 int형 배열 박스가 먼저 만들어짐.(stack)
			 * 그다음 int[5]짜리 방이 heap영역에 생성됨(int 0 으로 초기화, 주소값이 할당)
			 * 마지막으로 대입연산자가 실행되면서 주소값이 arr에 할당이 됨
			 * 
			 */
			System.out.println("i :" + i);
			System.out.println("arr : " + arr);
			System.out.println("arr의 해시코드값 : " + arr.hashCode()); // 해시코드 : 주솟값을 10진수로 변환한것
			
			double [] dArr = new double[3];
			System.out.println(dArr);
			System.out.println("dArr의 해시코드값 : " + dArr.hashCode());
			
			/*
			 * 기본자료형(boolean, char, byte, short, int, long, float, double)
			 * =>실제 값(리터럴)을 바로 stack영역에서 담을수 있는 변수 => 일반변수
			 * 
			 * 그외 자료형(int[] , double[], ... , String, Scanner, ...)
			 * => 주소값을 담고 있는 변수 : 참조변수 (reference 변수)
			 */
		}
		
		public void method3() {
			int[] iArr = new int[3];
			double[] dArr = new double[3];
			
			for(int i = 0 ; i < iArr.length;i++) {
				System.out.println(iArr[i]);
			}
			
			for(int i = 0 ; i < dArr.length;i++) {
				System.out.println(dArr[i]);
			}
			
		}
}
