package com.kh.chap03.branch;

public class B_Continue {
/*
 * continue; 		: 반복문 안에 기술되는 구문 
 * 					continue; 구문 실행시 그 뒤의 구문을 실행하지 않고 곧바로 속해있는 반복문 위로 올라감
 */
	
	public void method1() {
		// for문으로 1부터 10까지 홀수 출력
		// 1 3 5 7 9 
		
		/*
		 * for (int i = 1; i<= 10; i++){
		 * 	if(i % 2 == 1){
		 *  	System.out.print(i+" ");
		 *  } else { // 짝수란 소리
		 *  }
		 * 
		 * } 
		 */
		
		for (int i=1; i<=10; i++) {
			if(i%2 ==0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
	
	public void method2() {
		// 1부터 100 까지의 총 합계 
		// 단 , 6의 배수값은 빼고 덧셈연산 하겠다.
		
		// 1. 1부터 100 까지의 총합계 
		
		// 1. sum 변수 만들기 
		int sum = 0;
		
		// 2. 누적합 공식 이용해서 반복문 돌리기 => sum += i;
		for(int i=1; i<=100; i++) {
			
			if(i % 6 == 0) {
				continue; // 6의 배수일때는 건너뛰기 
			}
			sum += i; // 누적합 공식
		}
		
		System.out.println("1부터 100까지의 총합계 : " + sum);
	}
	
	public void method3() {
		// 2~9단까지 출력(이중for문)
		// 단, 3의 배수단은 빼고 출력
		
		// === 2단 ===
		
		// 2 x 1 = 2
		
		for(int dan=2; dan<=9; dan++) {
			if(dan % 3 == 0 ) {
				continue;
			}
			
			System.out.println(" === " + dan + "단===");
			
			for(int i=1; i<=9; i++) {
				System.out.printf(" %d x %d = %d\n", dan, i, dan*i);
			}
		}
	}
}
