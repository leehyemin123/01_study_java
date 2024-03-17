package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();

		System.out.println((num > 0) ? "양수다" : "양수가 아니다");

	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		System.out.println((num == 0 ? "0이다" : "음수다"));
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		System.out.println((num % 2 == 0) ? "짝수다" : "홀수다");
		
	} 
	
	public void practice4(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (num2 / num1));
		System.out.println("남는 사탕 개수 : " + ( num2 % num1));
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년 : ");
		int num1 = sc.nextInt();
		System.out.print("반 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("번호 : ");
		int num3 = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("성적(소수점 아래 둘째자리 까지 : ");
		double num4 = sc.nextDouble();
		
		String student = ( gender == 'M') ? ("남학생") : ("여학생");
		
		System.out.println(num1 + "학년" + num2 + "반" + num3 + "번 " + name +student + "의 성적은 "  + num4 + "이다");
		System.out.printf("%d학년 %d반 %dqjs %s의 성적은 %.2f이다.", num1,num2,num3,name,student,num4);
	}

	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int num = sc.nextInt();
		
		System.out.println((num >=13) ? "어린이" : (num >14) ? "청소년" : "성인");
		
	}
	
	public void practice7() {
		// 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력받고 , 
		// 세 과목에 대한 합계 (국어 + 영어 + 수학)와 평균 (합계 / 3.0) 을 구하세요 .
		// 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격 , 아니라면 불합격을 출력하세요 
		// (삼항연산자)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		// 숫자니까 int // 변수 만들때는 의미를 부여하는게 좋음 
		System.out.print("영어 : ");
		int english = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = korean + english + math;
		double average = ((sum) / 3.0);
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + average);
		
		String result = ( korean >= 40 && math >= 40 && average >= 60) ? "합격 " : "불합격";
		
		System.out.println(result);
	}	
	
	public void practice8() {
		// 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요 .
		// 주민번호는 - 때문에 숫자로 받을 수 없음 int 가아닌 String으로 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요 (-포함) : " );
		String number = sc.nextLine();
		
		char gender = number.charAt(7);
		
		String result = (gender == '2') ? "여자" : "남자";
		System.out.println(result);
	}
	
	public void practice9() {
		/*
		 * 키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
		그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
		아니면 false를 출력하세요.
		(단, num1은 num2보다 작아야 함) 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num3 <= num1 || num2 < num3) ? true : false;
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력 2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 3:");
		int num3 = sc.nextInt();
		
		boolean result = (num1 == num2 );
		System.out.println(result);
	}
	
	public void practice11() {
		/*
	       * A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
			인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 미만이면 “3000 미만”을 출력하세요.
			(A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
	       */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int income1 = sc.nextInt();
		double income1_1 = income1 * 1.4;
		System.out.print("B사원의 연봉 : ");
		int income2 = sc.nextInt();
		double income2_1 = income2 * 1.0;
		System.out.print("C사원의 연봉 : ");
		int income3 = sc.nextInt();
		double income3_1 = income3 * 1.15;
		
		String m1 = "3000이상";
		String m2 = "3000미만";
		
		String result1 = (income1_1 >= 3000) ? m1 : m2;
		String result2 = (income2_1 >= 3000) ? m1 : m2;
	    String result3 = (income3_1 >= 3000) ? m1 : m2;
	    
	    System.out.println("A사원의 연봉/연봉+a : " + income1 + "/" + income1_1);
	    System.out.println(result1);
		
	}
}
