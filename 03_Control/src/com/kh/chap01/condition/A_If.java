package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {

	/*
	 * 기본적으로 프로그램 진행은 순차적으로 진행
	 * 단, 이 순차적인 흐름을 바꾸고자 한다면 제어문 이라는걸 이용해서 직접 제어가능
	 * 
	 * 선택적으로 실행시키고자 할 때 => 조건문
	 * 반복적으로 실행시키고자 할 때 => 반복문
	 * 그 외의 흐름을 제어 = 분기문
	 * 
	 * * 조건문
	 * "조건식" 을 통해 참이냐 거짓이냐를 판단해서 참일 경우 그에 해당하는 코드 실행 
	 * 
	 * 조건식의 결과 true, false 이어야 한다!
	 * 보통 조건식에서는 비교연산자 (대소, 동등 ), 논리연산자 (&&, || )를 주로 사용 
	 * 
	 * * 조건문은 크게 if문과 switch 문으로 나뉨!
	 */
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("저우 하나 입력 : ");
		int num = sc.nextInt();
		
		/*
		 * * 단독 if문
		 * 
		 * [표현법]
		 * if(조건식){
		 *  	.. 실행시키고자 하는 코드 ..
		 *  }
		 *  
		 *  조건식은 if 랑 친하다!!
		 *  
		 *  => 조건식이 참(true)일 경우 => 중괄호 블럭 안의 코드 실행
		 *  => 조건식이 거짓(false)일 경우 => 중괄호 블럭 안의 코드 무시하고 넘어감
		 *  
		 * 
		 */
		
		if (num > 0 ) {
			System.out.println("양수다.");
		}
		
		if(num <=0) {
			System.out.println("양수가 아니다.");
			
		}
		
		/*
		 * if - else문
		 * 
		 * [표현식]
		 * if(조건식){
		 * 			.. 실행코드 1 .. 
		 * }else{
		 * 			.. 실행코드 2..
		 * }
		 * }
		 * 조건식의 결과가 참(true)일 경우 실행코드 1 수행 후 if-else문 빠져나감
		 * 단, 결과가 거짓(false)일 경우 무조건 실행코드 2 수행
		 * 
		 */
		
		if(num > 0 ) {
			System.out.println("양수다.");
		}else {
			System.out.println("양수가 아니다.");
		}
		
		// 조건검사 1회 수행 
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
	    int num = sc.nextInt();
	    
	    /*
	     * * if - else if = else 문
	     * 
	     * 같은 비교 대상으로 여러개의 조건을 제시해야 될 경우 
	     * 
	     * [표현식]
	     * if(조건식){
	     * 		.. 실행코드 .. 1 
	     * }else if (조건식) {
	     * 		.. 실행코드 .. 2
	     * }else if(조건식){
	     * 		.. 실행코드 ..3
	     * }else {
	     * 		위의 조건들이 다 false일 경우 실행할 코드 
	     * }]
	     */
	    
	    if(num > 0) {
	    	System.out.println("양수다.");
	    }else if(num == 0 ) {
	    	System.out.println("0이다.");
	    }else {
	    	System.out.println("음수다.");
	    }
	    
	}
	
	public void method4() {
		// 사용자에게 나이를 입력 받아 어린이 청소년 성인 ..
		// 13세 이하 : 어린이 
		// 13세 초과 19세 이하 : 청소년 
		// 19세 초과 : 성인
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 (숫자만) : "  );
		int age = sc.nextInt();
	
	String result;
	if(age <= 13) {
		result = "어린이";
	}else if(age <= 19) {
		result = "청소년";
	}else { 
		result = "성인";
	}
	
	System.out.println(result);
	
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		String result = "";
		
		if(gender == 'M' || gender == 'm') {
			result = " 남학생 ";
		}else if(gender == 'F' || gender == 'f') {
			
		}else {
			System.out.println("성별을 잘 못 입력하셨습니다.");
			return; 
		}
		System.out.println(name + "님은" + result + "입니다.");
	}
	
}



