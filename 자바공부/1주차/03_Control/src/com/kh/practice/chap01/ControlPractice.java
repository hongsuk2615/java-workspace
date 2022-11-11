package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		// 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
		// 종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");

		Scanner sc = new Scanner(System.in);

		int menu = sc.nextInt();

		if (menu == 1) {
			System.out.println("입력 메뉴입니다.");
		} else if (menu == 2) {
			System.out.println("수정 메뉴입니다.");
		} else if (menu == 3) {
			System.out.println("조회 메뉴입니다.");
		} else if (menu == 4) {
			System.out.println("삭제 메뉴입니다.");
		} else if (menu == 7) {
			System.out.println("프로그램이 종료됩니다.");
		}
	}
	
	public void practice2() {
		//키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
		//짝수가 아니면 “홀수다“를 출력하세요.
		//양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			if(num%2 == 0) {
				System.out.println("짝수다");
			}else {
				System.out.println("홀수다");
			}
			
		}else {
			System.out.println("양수만 입력해주세요");
		}
		

	}
	
	public void practice3() {
		//국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		//합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		//(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		//합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		//불합격인 경우에는 “불합격입니다.”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int korean = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int english = sc.nextInt();
		
		int sum = korean + math + english;
		float average = sum/3 ;
		
		if (average >= 60 && korean >= 40 && english >= 40 && math >= 40 ) {
			System.out.printf("국어 : %d \n수학 : %d \n영어 : %d \n합계 : %d \n평균 : %.1f \n축하합니다, 합격입니다!\n", korean, math,
					english, sum, average);
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		//pdf파일 (11page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요
		//봄 (3~5) 여름(6~8) 가을(9~11) 겨울(1~2,12)
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12사이의 정수 입력 : ");
		int month = sc.nextInt();
		switch(month) {
		
		case 3: case 4: case 5:
			System.out.println(month + "월은 봄입니다.");
			break;
			
		case 6: case 7: case 8:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println(month + "월은 가을입니다.");
			break;
		case 1: case 2: case 12:
			System.out.println(month + "월은 겨울입니다.");
			break;
		default :
			System.out.println(month + "월은 잘못입력된 달입니다.");
		}
		
		
	}
	
	public void practice5() {
		//아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
		//로그인 성공 시 “로그인 성공”, 
		//아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
		//비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String idInput = sc.nextLine();
		System.out.print("비밀번호 : ");
		String passwordInput = sc.nextLine();
		
		switch (idInput) {
		
		case "minmin":

			switch (passwordInput) {
			case "Min1234":
				System.out.println("로그인성공");
				break;

			default:
				System.out.println("비밀번호가 틀렸습니다.");
			}
			break;

		default:
			System.out.println("아이디가 틀렸습니다.");

		}
	}
	
	public void practice6() {
		//사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
		//단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		//회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		//비회원은 게시글 조회만 가능합니다
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String level = sc.nextLine();
		
		switch(level) {
		case "관리자" : System.out.print("회원관리, 게시글 관리, ");
		case "회원" : System.out.print("게시글 작성, 댓글 작성, ");
		case "비회원" : System.out.print("게시글 조회");
		}
		
	}
	
	public void practice7() {
		//키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
		//저체중/정상체중/과체중/비만을 출력하세요.
		//BMI = 몸무게 / (키(m) * 키(m))
		//BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
		//BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
		//BMI가 30이상일 경우 고도 비만
		
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해주세요 : ");
		double tall = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		double weight = sc.nextDouble();
		
		double BMI = weight / (tall*tall);
		String result ="";
		
		if (BMI < 18.5) {
			result = "저체중";
		} else if (BMI >= 18.5 && BMI < 23) {
			result = "정상체중";
		} else if (BMI >= 23 && BMI < 25) {
			result = "과체중";
		} else if (BMI >= 30) {
			result = "고도 비만";
		} else {
			result = "비만";
		}
		
		System.out.println("BMI 지수 : " + BMI);
		System.out.println(result);

	}
	
	public void practice8() {
		//키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
		//(단, 두 개의 정수 모두 양수일 때만 작동하며 없는 연산 기호를 입력 했을 시
		//“잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		sc.nextLine();
		char op = sc.nextLine().charAt(0);
		float result = 0;
		
		if (num1 <=0 || num2 <=0) {
			System.out.println("잘못입력하셨습니다. 프로그램을 종료합니다.");
			return;
		} else {
			switch(op) {
			case '+' : 
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '/':
				result = (float)num1 / num2;
				break;
			case '%':
				result = (float)num1 % num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			default :
				System.out.println("잘못입력하셨습니다. 프로그램을 종료합니다.");
				return;
				
			}
			
		}
		System.out.printf("%d / %d = %.6f",num1,num2,result);
	}
	
	public void practice9() {
		//중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
		//평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
		//이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요. 
		//70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("중간고사 점수 : ");
		int midTest = sc.nextInt();
		System.out.print("기말고사 점수 : ");
		int finalTest = sc.nextInt();
		System.out.print("과제 점수 : ");
		int homeWork = sc.nextInt();
		System.out.print("출석 회수 : ");
		float attend =sc.nextFloat();
		
		float resultMidTest = (float) (0.2 * midTest);
		float resultFinalTest =(float)(0.3 * finalTest);
		float resultHomeWork =(float)(0.3 * homeWork);
		float sum = resultMidTest + resultFinalTest + resultHomeWork + attend;
		
		System.out.println("================= 결과 =================");
		if (attend/20 < 0.7) {
			System.out.printf("Fail [출석 회수 부족 (%.0f/20)]", attend);
		} else {
			System.out.printf("중간 고사 점수(20) : %.1f\n", resultMidTest);
			System.out.printf("기말 고사 점수(30) : %.1f\n", resultFinalTest);
			System.out.printf("과제 점수    (30) : %.1f\n", resultHomeWork);
			System.out.printf("출석 점수    (20) : %.1f\n", attend);
			System.out.printf("총점             : %.1f\n", sum);

			if (sum < 70) {
				System.out.println("Fail");
			} else {
				System.out.println("Pass");
			}

		}
		
	}
	
	public void practice10() {
		//앞에 구현한 실습문제를 선택하여 실행할 수 있는 메뉴화면을 구현하세요.
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택 : ");
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 :
			practice1();
			break;
		case 2 :
			practice2();
			break;
		case 3 :
			practice3();
			break;
		case 4 :
			practice4();
			break;
		case 5 :
			practice5();
			break;
		case 6 :
			practice6();
			break;
		case 7 :
			practice7();
		case 8 :
			practice8();
			break;
		case 9 :
			practice9();
			break;				
		}
		
	}
	
	public void practice11() {
		//정수를 이용해서 4자리 비밀번호를 만들려고 하는데
		//이 때 4자리 정수를 입력 받아 각 자리 수에 중복되는 값이 없을 경우 ‘생성 성공’
		//중복 값이 있으면 ‘중복 값 있음‘
		//자리수가 안 맞으면 ‘자리 수 안 맞음‘ 출력
		//단, 제일 앞자리 수의 값은 1~9 사이 정수
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 입력(1000~9999) : ");
		int password = sc.nextInt();
		
		if (password < 1000 || password > 9999) {
			System.out.println("자리수 안맞음");
		} else {
			int first = password / 1000;
			int second = (password - 1000 * first) / 100;
			int third = (password - 1000 * first - 100 * second) / 10;
			int fourth = password - 1000 * first - 100 * second - 10 * third;

			if (first != second && first != third && first != fourth && second != third && second != fourth
					&& third != fourth) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}

		}

	}
	
}

