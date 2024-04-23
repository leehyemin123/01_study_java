package com.kh.chap03_class.model.vo;

public class Product {

	// 클래스 선언 구문에 작성 가능한 접근 제한자 (public, default)
	// default 라고 명시적으로 쓰는게 아니고 , 접근제한자를 안쓰면 default 가 되는거임
	// default로 하면 같은 패키지 내에서만 사용 가능 / 다른패키지에서는 해당 파일 사용불가 => 못찾음
	
	/*
	 * *필드(field)
	 * 
	 * 필드 == 멤버변수 == 인스턴스 변수 
	 * 
	 * [표현법]
	 * 접근제한자 [예약어] 자료형 변수명; 
	 * 
	 */
	
	private String pName;
	private int price;
	private String brand;
	
	/*
	 * *생성자 
	 * - 객체를 생성하기 위한 일종의 메소드 
	 * 
	 * [표현법]
	 * 접근 제한자 클래스명 ([매개변수, 매개변수 , ...]) {
	 * 
	 *  }
	 */
	
	// 기본생성자 
	
	public Product() {}
	
	// 매개변수 생성자

	public Product(String pName, int price, String brand) {
		super();
		this.pName = pName;
		this.price = price;
		this.brand = brand;
		

	}
	
	
	
	
	
	
}
