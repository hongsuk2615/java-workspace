package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다. 만일, 1 미만의 숫자가 입력됐다면
//		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice1();
		} else {
			for (int i = 1; i < num + 1; i++) {
				System.out.print(i + " ");
			}

		}
	}

	public void practice2() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다. 만일 , 1 미만의 숫자가 입력됐다면
//		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice1();
		} else {
			for (int i = num; i > 0; i--) {
				System.out.print(i + " ");
			}

		}
	}

	public void practice3() {
//		1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;

		if (num < 1) { // 입력한 정수가 1보다 작을경우

			for (int i = 1; i > num - 1; i--) {
				switch (i) {
				case 1:
					System.out.print(i); // 1 출력방식
					break;
				case 0:
					System.out.print(" + " + i); // 0 출력방식
					break;
				default:
					System.out.print(" + (" + i + ")"); // 음수 출력방식
					break;
				}

				sum += i;
			}
		} else { // 입력한 정수가 1이상 일경우
			for (int i = 1; i < num + 1; i++) {
				if (i == 1) { // 1일떄 1출력
					System.out.print(i);
				} else { // 1이 아닐때 + i 출력
					System.out.print(" + " + i);
				}
				sum += i;
			}

		}

		System.out.println(" = " + sum);

	}

	public void practice4() {
//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요. 만일, 1 미만의 숫자가 입
//		력됐다면 “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if (num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice4();
			return;

		} else if (num1 > num2) {
			for (int i = num2; i < num1 + 1; i++) {
				System.out.print(i + " ");
			}

		} else {
			for (int i = num1; i < num2 + 1; i++) {
				System.out.print(i + " ");
			}

		}

	}

	public void practice5() {
//		사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.단 , 9를 초과하는 숫자가 입력됐다면
//		“9 이하의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		System.out.print("숫자 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num > 9) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
			practice5();
			return;
		} else if (num < 2) { // 1이하 정수 일 경우 전체 구구단 출력
			for (int i = 1; i < 10; i++) {
				System.out.printf("==== %d단 ====\n", i);
				for (int j = 1; j < 10; j++) {
					System.out.printf("%d X %d = %d\n", i, j, i * j);
				}
				System.out.println();
			}
		} else { // 2~9사이 정수 일경우
			for (int i = num; i < 10; i++) {
				System.out.printf("==== %d단 ====\n", i);
				for (int j = 1; j < 10; j++) {
					System.out.printf("%d X %d = %d\n", i, j, i * j);
				}
				System.out.println();
			}

		}
	}

	public void practice6() {
//		 사용자로부터 시작 숫자와 공차를 입력 받아
//		 일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
//		 단, 출력되는 숫자는 총 10개입니다

		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();
		System.out.print("공차 : ");
		int diff = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.printf("%d ", num);
			num += diff;
		}
	}

	public void practice8() {
//		다음과 같은 실행 예제를 구현하세요.
//		정수 입력 : 4
//		*
//		**
//		***
//		****
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice9() {
//		다음과 같은 실행 예제를 구현하세요.
//		정수 입력 : 4
//		****
//		***
//		**
//		*
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice10() {
//		다음과 같은 실행 예제를 구현하세요.
//		정수 입력 : 4
//		   *
//		  **
//		 ***
//		****
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j < num - i - 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

	public void practice11() {
//		다음과 같은 실행 예제를 구현하세요.
//		정수 입력 : 4
//		****
//		 ***
//		  **
//		   *	 
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

	public void practice12() {
//		다음과 같은 실행 예제를 구현하세요.
//		정수 입력 : 4
//		  *
//		 ***
//		*****
//	   ******* 
//     한 행당 문자개수 : 2*입력값-1 개
//     행(i)에 따른 별개수 : 2*i+1 , i는 0부터시작
//	   행(i)에 따른 왼쪽 공백 개수   : (한 행당 문자개수 - 행(i)에따른 별개수)/2 
//	   행(i)에 따른 오른쪽 공백 개수  : (한 행당 문자개수 - 행(i)에따른 별개수)/2 

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int chNum = 2 * num - 1; // 한 행당 문자개수

		for (int i = 0; i < num; i++) {
			int starNum = 2 * i + 1; // 행에 따른 별 개수
			for (int j = 0; j < (chNum - starNum) / 2; j++) { // 좌공백개수만큼 공백출력
				System.out.print(" ");
			}
			for (int j = 0; j < starNum; j++) { // 별출력
				System.out.print("*");
			}
			for (int j = 0; j < (chNum - starNum) / 2; j++) { // 우공백개수만큼 공백출력
				System.out.print(" ");
			}
			System.out.println();
		}

	}

	public void practice13() {
//		사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
//		단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
//		* ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
//		 2, 3, 5, 7, 11 …
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		Boolean result = true;
		if (num < 2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		} else if (num == 2) {
			result = true;
		} else {

			result = true;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) { // 자기자신, 1을 제외한 숫자로 나눈 나머지
					result = result && false; // 한번이라도 나머지가 0이 아니면 false
				}
			}
		}

		if (result) {
			System.out.println("소수 입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}

	}

	public void practice14() {
//		2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
//		단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		Boolean result = true;
		int count = 0; // 소수의 개수
		if (num < 2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}

		for (int j = 2; j < num + 1; j++) { // 2~사용자 입력한 수사이의 수(j)에대한 소수판별
			if (j == 2) {
				result = true;
			} else {

				result = true;
				for (int i = 2; i < j; i++) {
					if (j % i == 0) { // 자기자신, 1을 제외한 숫자로 나눈 나머지
						result = result && false; // 한번이라도 나머지가 0이 아니면 false
					}
				}
			}
			if (result) { // 소수면 출력 + count 1증가
				System.out.print(j + " ");
				count++;
			}

		}
		System.out.println();
		System.out.println("2부터 " + num + "까지의 소수의 개수는 " + count + "개입니다.");
	}

	public void practice15() {
//		1부터 사용자에게 입력 받은 수까지 중에서
//		1) 2와 3의 배수를 모두 출력하고
//		2) 2와 3의 공배수의 개수를 출력하세요.
//		* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
//		모두 나머지가 0이 나오는 수
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int count = 0;
		if (num < 1) {
			practice15();
			return;
		} else {
			for (int i = 2; i < num + 1; i++) {
				if (i % 2 == 0 || i % 3 == 0) {
					System.out.print(i + " ");
				}
				if (i % 2 == 0 && i % 3 == 0) {
					count++;
				}
			}

		}
		System.out.println();
		System.out.println("count : " + count);

	}

	public void practice16() {
//		다음과 같은 실행 예제를 구현하세요.
//		정수 입력 : 3
//		*
//		**
//		***
//		**
//		*
//   practice 8,9 합치기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//------------------practice8()-----------------------
		for (int i = 0; i < num - 1; i++) { // 행개수 - 1
			for (int j = 0; j < num - i - 1; j++) { // 별개수 - 1
				System.out.print("*");
			}
			System.out.println();
		}
//------------------practice9()-----------------------

	}

	public void practice17() {
//	다음과 같은 실행 예제를 구현하세요.
//	ex.
//	정수 입력 : 5
//	*****
//	*   *     공백개수 : 입력값 - 2
//	*   *
//	*   *
//	*****
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			if (i == 0 || i == num - 1) { // 첫,끝행일때
				for (int j = 0; j < num; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				System.out.print("*");
				for (int j = 0; j < num - 2; j++) {
					System.out.print(" ");
				}
				System.out.println("*");

			}
		}
	}

	public void practice18() {
//		다음과 같은 실행 예제를 구현하세요.
//		 정수 입력 : 4
//		   *
//		  ***
//		 *****
//		*******
//		 *****
//		  ***
//		   * 
// practice12+변형
//		  *
//		 ***
//		*****
//	   ******* 
//   한 행당 문자개수 : 2*입력값-1 개
//   행(i)에 따른 별개수 : 2*i+1 , i는 0부터시작
//	 행(i)에 따른 왼쪽 공백 개수   : (한 행당 문자개수 - 행(i)에따른 별개수)/2 
//	 행(i)에 따른 오른쪽 공백 개수  : (한 행당 문자개수 - 행(i)에따른 별개수)/2 

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int chNum = 2 * num - 1; // 한 행당 문자개수

		for (int i = 0; i < num; i++) {
			int starNum = 2 * i + 1; // 행에 따른 별 개수
			for (int j = 0; j < (chNum - starNum) / 2; j++) { // 좌공백개수만큼 공백출력
				System.out.print(" ");
			}
			for (int j = 0; j < starNum; j++) { // 별출력
				System.out.print("*");
			}
			for (int j = 0; j < (chNum - starNum) / 2; j++) { // 우공백개수만큼 공백출력
				System.out.print(" ");
			}
			System.out.println();
		}
//-----------------------practice12()--------------------------------
//		 *****
//		  ***
//		   * 	
//   한 행당 문자개수 : 2*입력값-1 개
//   행 개수 : 입력값-1
//   행(i)에 따른 별개수 : 한 행당 문자개수 -2 - 2*i , i는 0부터시작
//	 행(i)에 따른 왼쪽 공백 개수   : (한 행당 문자개수 - 행(i)에따른 별개수)/2 
//	 행(i)에 따른 오른쪽 공백 개수  : (한 행당 문자개수 - 행(i)에따른 별개수)/2 

		for (int i = 0; i < num - 1; i++) { // 행개수 : 입력값 -1
			int starNum = chNum - 2 - 2 * i; // 행에 따른 별 개수
			for (int j = 0; j < (chNum - starNum) / 2; j++) { // 좌공백개수만큼 공백출력
				System.out.print(" ");
			}
			for (int j = 0; j < starNum; j++) { // 별출력
				System.out.print("*");
			}
			for (int j = 0; j < (chNum - starNum) / 2; j++) { // 우공백개수만큼 공백출력
				System.out.print(" ");
			}
			System.out.println();
		}
//-----------------------practice12()변형--------------------------------
	}

	public void practice19() {
//		다음과 같은 실행 예제를 구현하세요.
//		정수 입력 : 4
//		*
//	   * *
//	  *   *
//	 *	   * 
//    *   *		
//     * *
//		*
//  한 행당 문자개수 : 2*입력값-1 개	
//
//	    *         //첫행(i==0)
//	   * *        별 개수 : 1 ,좌우공백개수 : (한 행당 문자개수 - 1)/2 
//	  *   *       //나머지행(i>0)
//	 *	   * 	  별 개수 : 2 가운데공백개수 :2i-1  좌우공백개수 : (한 행당 문자개수 - 별 개수 - 가운데 공백개수)/2
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int chNum = 2 * num - 1; // 한 행당 문자개수
		for (int i = 0; i < num; i++) {
			switch (i) {
			case 0: // 첫행(i==0)
				for (int j = 0; j < (chNum - 1) / 2; j++) { // 좌공백개수만큼 공백출력
					System.out.print(" ");
				}
				System.out.print("*"); // 별 한개 출력

				for (int j = 0; j < (chNum - 1) / 2; j++) { // 우공백개수만큼 공백출력
					System.out.print(" ");
				}
				System.out.println();
				break;
			default: // 나머지행
				for (int j = 0; j < (chNum - 2 - (2 * i - 1)) / 2; j++) { // 좌공백개수만큼 공백출력
					System.out.print(" ");
				}
				System.out.print("*"); // 별 한개 출력
				for (int j = 0; j < 2 * i - 1; j++) { // 가운데공백개수만큼 공백출력
					System.out.print(" ");
				}

				System.out.print("*"); // 별 한개 출력

				for (int j = 0; j < (chNum - 2 - (2 * i - 1)) / 2; j++) { // 우공백개수만큼 공백출력
					System.out.print(" ");
				}
				System.out.println();
				break;

			}
		}

//	    *   *	 // 행개수 : 입력값 - 1
//	     * *      
//	      *      // 마지막행(i==입력값-2)
//		            별 개수 : 1 ,좌우공백개수 : (한 행당 문자개수 - 1)/2
//               // 나머지행
//                  별 개수 : 2 ,가운데공백개수 : 2*입력값-2i-5  좌우공백개수 : (한 행당 문자개수 - 별 개수 - 가운데 공백개수)/2
//      
		for (int i = 0; i < num - 1; i++) {
			if (i == num - 2) {// 마지막행일경우
				for (int j = 0; j < (chNum - 1) / 2; j++) { // 좌공백개수만큼 공백출력
					System.out.print(" ");
				}
				System.out.print("*"); // 별 한개 출력

				for (int j = 0; j < (chNum - 1) / 2; j++) { // 우공백개수만큼 공백출력
					System.out.print(" ");
				}
				System.out.println();
			} else { // 나머지행
				int midBlank = 2*num - 2*i -5; //가운데 공백
				for (int j = 0; j < (chNum - 2 - midBlank) / 2; j++) { // 좌공백개수만큼 공백출력
					System.out.print(" ");
				}
				System.out.print("*"); // 별 한개 출력
				for (int j = 0; j < midBlank; j++) { // 가운데공백개수만큼 공백출력
					System.out.print(" ");
				}

				System.out.print("*"); // 별 한개 출력

				for (int j = 0; j < (chNum - 2 - midBlank) / 2; j++) { // 우공백개수만큼 공백출력
					System.out.print(" ");
				}
				System.out.println();
			}

		}
	}

}
