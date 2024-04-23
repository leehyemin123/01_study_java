package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class EncapsulationRun {
	
	/*
	 * 7. 캡슐화 과정까지 적용해서 완벽한 클래스의 형태를 갖추게끔 !! 
	 * 
	 * * 캡슐화 : 추상화를 통해 정의된 속성들과 기능들을 하나로 묶어 관리하는 기법 중 하나로 클래스에서 가장 중요한 목적인 "데이터의 접근 제한" 을원칙으로 
	 * 			외부로부터 "데이터의 직접 접근을 막고 " 대신에 "데이터를 간접적으로 나마 처리 (값을 대입, 값을 돌려준다거나)" 할 메소드 클래스 내부에 작성해서 관리 
	 * 
	 * 1) 정보은닉 : private 
	 * 	  직접 접근을 막기 위해 private 라는 접근 제한자 사용
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student kim = new Student();
		
		kim.setName("김봉석");
		kim.setAge(20);
		kim.setHeight(160.3);
		kim.setKorScore(100);
		kim.setMathSore(90);
		
		System.out.println(kim.getName());
		System.out.println(kim.getAge());
		System.out.println(kim.getHeight());
		System.out.println(kim.getKorScore());
		System.out.println(kim.getMathScore());
		
		// 수정하고 싶다면 ??
		kim.setAge(19);
		System.out.println("== 수정 후 == ");
		System.out.println(kim.getAge());

	}

}
