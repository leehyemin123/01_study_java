package com.kh.operator;

public class C_Arithmetic {

	/*
	 * 산술 연산자 ( 이항 연산자 == 두개의 값을 가지고 연산)
	 * + - * / % 
	 * 
	 *  * / % + -
	 *  
	 */
	
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1+ num2));
		System.out.println("num1 -  num2 = "+( num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + ( num1/ num2)); // 나누기 했을 때 몫
		System.out.println("num1 % num2 = " + (num1 % num2)); // 나누기 했을 때 나머지
		
		// 값 % 2 == 0 이라는 건 짝수란 소리 
		// 값 % 2 == 1 이라는 건 홀수란 소리 
		
		// 값 % 5 == 0 라는 건 5의 배수란소리 
		// 값 % 3 == 0 라는 건 3의 배수란 소리 
		
	}
}
