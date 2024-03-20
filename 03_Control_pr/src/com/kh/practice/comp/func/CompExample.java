package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {

	public void practice1() {
		
	
	/*
	 * 정수를 입력 받아 양수일 때만 1부터 입력 받은 수 까지 홀수/ 짝수를 나눠서 
	 * 홀수면 '박' , 짝수면 '수'를 출력하도록 하세요.
	 * 단, 입력 받은 수가 양수가 아니면 "양수가 아닙니다." 를 출력하세요.
	 */
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("정수 : ");
	int num = sc.nextInt();
	
	if (num > 0 ){
		for(int i = 1; i<= num; i++) {
			if(i%2 == 0) {
				System.out.print("수");
			}else { 
				System.out.print("박");
			}
		}
	}else {
		System.out.println("양수가 아닙니다.");
	}
	
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 : ");
		}
	}
}
