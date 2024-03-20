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
			int num = sc.nextInt();
			
			if(num > 0 ) {
				for( int i = 1; i < num; i++ ) {
					if(i % 2 == 0) {
						System.out.print("수");
					}else {
						System.out.print("박");
					}
				}
				return;
			}else { 
				System.out.println("양수가 아닙니다.");
			}
		}
	}
	
	public void practic3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		int count = 0;
		
		for(int i = 0; i< str.length(); i++) {
			if(str.charAt(i) == ch) {
				count++;
				
			}
			System.out.println(str + "안에 포함된" + ch + "개수 : " + count);
		}
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("문자열 : ");
			String str = sc.nextLine();
			
			System.out.print("문자 : ");
			char ch = sc.nextLine().charAt(0);
			
			int count = 0;
			
			for (int i = 0; i<str.length(); i++) {
				if(str.charAt(i) == ch) {
					count++;
				}
			}
			
			System.out.println("포함된 개수 : " + count);
			
			System.out.print(" 더 하시겠습니까?(y/n) : ");
			char ch1 = sc.nextLine().charAt(0);
			
			if( ch1 == 'n' || ch1 == 'N') {
				return;
			}else if (!(ch1 == 'y'|| ch1 == 'Y' || ch1 == 'N')) {
				System.out.println("잘못된 대답입니다. 다시입력해주세요.");
			}
		}
	}
}
