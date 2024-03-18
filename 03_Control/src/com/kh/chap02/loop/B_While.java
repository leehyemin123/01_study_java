package com.kh.chap02.loop;

public class B_While {

	/*
	 * * While문 
	 * 
	 * [표현법]
	 * 
	 * while(조건식){
	 * 		반복적으로 실행할 코드;
	 * 		[증감식;]
	 * 
	 * 조건식이 true일 경우 해당 코드 실행 
	 * 
	 * 조건식 검사 --> true일 경우 실행코드 실행
	 * 조건식 검사 --> false일 경우 실행코드 실행 x => 반복문 빠져나감 
	 */
	
	public void method1() {
		// 안녕하세요 5번 출력
		
		int i = 1;
		
		while(i<=5) {
			System.out.println("안녕하세요");
			i++;
			
		}
		
		// for 문과 다른점!! i값을 출력할 수 있다!
		System.out.println(i);
		
	}
	
	public void method2() {
		// 1 2 3 4 5 
		int i = 1;
		
		while(i<=5) {
			//System.out.println(i + " ");
			// i++;
			
			// 후위연산자로 표현해보기 
			System.out.println(i++ + " ");//위의 두 줄을 다름과 같이 한줄로 줄일 수 있다.
		}
	}
	
	public void method3() {
		// 1에서 부터 10 사이의 홀수 만을 출력
		// 1 3 5 7 9 
		int i = 1;
		
		while(i<=9) {
			if(i % 2 == 1) {
				System.out.println(i + " ");
				i++;
			}
			
			i++;
		}
	}
	
	public void method4() {
		// 1부터 랜덤값 (1~100)까지의 합계 
		int random =(int)(Math.random()*100+1);
		
		// 1. sum 변수 만들기
		int sum = 0 ;
		
		// 2. 누적합 공식 이용해서 반복문 돌리기 => sum += i;
		int i = 1;
		while(i<=random) {
			sum += i; // 누적합공식
			i++;
		}
		System.out.println("1부터" + random + "까지의 합 : " +  sum);
	}
}
