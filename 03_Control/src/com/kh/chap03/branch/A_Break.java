package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {

	/*
	 * break;		: 반복문 안에 사용되는 분기문 break; 가 실행되는 순간 현재 속해 있는 반복문을 강제로 빠져나감
	 * 
	 * * 유의사항 : switch문안의 break;는 단지 switch(조건문)문을 빠져나가는 구문
	 */
	
	public void method1() {
		// 랜덤값(1~100) 발생시키고 그 랜덤값 출력 (이 과정을 매번 반복 => 무한반복 => 무한루프)
		// 단, 발생된 랜덤값이 3의 배수 일 경우 (랜덤수 3으로 나눴을 때 나머지가 0 일경우) 반복문을 빠져나와보자
		
		while(true) { //무한반복이 된다.
			
			int random = (int) (Math.random()*100 + 1);
			System.out.println("random값 : " + random);
			
			if(random % 3 == 0) { //3의 배수란 소리 
				break; // 반복문을 강제로 빠져나가게 하는 구문
			}
		}
	}
	
	public void method2() {
		// 사용자에게 문자열 입력 받아 해당 그 문자열의 길이 출력
		// 단, 사용자가 입력한 문자열이 "exit"일 경우 반복문을 빠져나가도록
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("문자열을 입력해주세요 : ");
			String str = sc.nextLine();
			
			if(str.equals("exti")) { // 사용자가 입력한 문자열이 "exit" 일 경우 => 반복문 빠져나가기
				System.out.println("프로그램을 종료합니다.");
				break;
				
			}else { // 근데 그게 아닐 경우 => 문자열의 길이 출력
				System.out.println("문자열의 길이 : " + str.length());
				
			}
		}
	}
	
public void method3() {
	// 사용자에게 단(2~9)을 입력 받아 해당 단을 출력
	// 혹시라도 잘못된 단을 입력했을 경우 다시 단을 입련 받도록 유도
	// "잘못입력하셨습니다. 다시 입력해주세요."
	
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.print("단(2~9)을 입력해주세요 : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9) { // 잘 입력했을 경우 
			
			// 구구단 출력
			for (int i= 1; i<=9; i++) {
				System.out.printf("%d x %d = %d\n" , dan, i , dan * i);
			}
			
			// 반복문 끝냄
			break;
		}else { // 잘못입력했을 경우
			System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
		}
	}
}
	
	
	
}
