package com.kh.practice.chap01;

import java.util.Scanner;

public class ContrlPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 : System.out.println("입력 메뉴입니다."); break;
		case 2 : System.out.println("수정 메뉴입니다."); break;
		case 3 : System.out.println("조회 메뉴입니다."); break;
		case 4 : System.out.println("삭제 메뉴입니다."); break;
		case 7 : System.out.println("프로그램이 종료됩니다."); break;
		}
		
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println("짝수다");
		}else if(num%2 ==1 ) {
			System.out.println("홀수다");
		}else if(num < 0) {
			System.out.println("양수만 입력해주세요");
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int korean = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int english = sc.nextInt();
		
		System.out.println("국어 : " + korean);
		System.out.println("수학 : " + math);
		System.out.println("영어 : " + english);
		
		int sum = korean + english + math;
		// 합계도 숫자니까 int로 
		double average = ((sum)/3.0);
		
		System.out.println("합계: " + sum);
		System.out.println("평균 : " + average);
		
		String result = (korean >= 40 && english >=40 && math >=40 && average >= 60)? "축하합니다,합격입니다." : "불합격입니다.";
		System.out.println(result);
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 3 : 
		case 4 : 
		case 5 : System.out.println(month + "월은 봄입니다."); break;
		case 6 :
		case 7 : 
		case 8 : System.out.println(month + "월은 여름입니다."); break;
		case 9 : 
		case 10 : 
		case 11 : System.out.println(month + "월은 가을입니다."); break;
		case 12 : 
		case 1 : 
		case 2 : System.out.println(month + "월은 겨울입니다."); break;
		default : System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
	}
	
	public void practice() {
		
		String id = "korea";
		String pw = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("id 입력 : ");
		String userId = sc.next();
		
		System.out.print("pw 입력 : ");
		String userPw = sc.next();
		
		if(id.equals(userId) && pw.equals(userPw)) {
			System.out.println("로그인 성공");
		}else {
			if(id.equals(userId)) {
				System.out.println("비밀번호가 틀렸습니다.");
			}else {
				System.out.println("아이디가 틀렸습니다.");
			}
		}
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String level = sc.nextLine();
		
		if(level.equals("관리자")) {
			System.out.println("회원관리, 게시글관리, 게시글 작성, 게시글조회, 댓글작성 ");
		}else if(level.equals("회원")) {
			System.out.println("게시글 작성, 게시글 조회, 댓글작성 ");
		}else System.out.println("게시글 조회");
		
	}
	
	public void practice7() {
		
		/*
		 * 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라 저체중/정상체중/과체중/비만을 출력하세요. BMI = 몸무게
		 * / (키(m) * 키(m)) BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중 BMI가 23이상 25미만일 경우
		 * 과체중 / 25이상 30미만일 경우 비만 BMI가 30이상일 경우 고도 비만
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력해주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게를 입력해주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println(bmi);
		
		if(bmi < 18.25) { 
			System.out.println("저체중");
		}else if(bmi < 23) {
			System.out.println("정상체중");
		}else if(bmi < 25) { 
			System.out.println("과체중");
		}else if(bmi < 30) {
			System.out.println("비만");
		}else {
			System.out.println("고도비만");
		}
		
	}
	
	public void practice8() {
		/*
		 * 키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요. (단, 두 개의 정수 모두 양수일 때만 작동하며
		 * 없는 연산 기호를 입력 했을 시 “잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char op = sc.nextLine().charAt(0);
		
		if((num1 > 0) && (num2 >0 )) { // 둘다 양수인 경우 
			switch(op) {
			case '+' : 
				System.out.printf("%d + %d = %d", num1, num2, num1+num2);
				break;
			case '-' :
				System.out.printf("%d - %d = %d", num1, num2, num1-num2);
				break;
				default : 
					System.out.println("잘못입력하였습니다. 프로그램을 종료합니다.");
			}
		}
		
		
				
		
		
	}
}
