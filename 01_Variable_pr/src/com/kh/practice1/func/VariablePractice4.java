package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
// 영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세개를 출력하세요 
	// String 	scanner
	public void inputTest4() {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("문자열을 입력하세요 : ");
	 String str = sc.nextLine(); // "apple" => charAt(인덱스값)
	 
	 // char m1 = str.charAt(0); // a를 출력하는 방법 ( 여러번 쓸 때 유용한 방법임)
	 
	 System.out.println("첫번째 문자 : " + str.charAt(0));
	 System.out.println("두번째 문자 : " + str.charAt(1));
	 System.out.println("세번째 문자 : " + str.charAt(2));
	 
	 sc.close();
	 
	 // 또 다른 방법 캡쳐 
	}
}
