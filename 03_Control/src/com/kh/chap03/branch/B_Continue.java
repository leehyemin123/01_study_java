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
}
