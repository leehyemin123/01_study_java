package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num <1) {
			System.out.println("1이상의 숫자를 입력하세요.");
		}else {
			for(int i = 1; i<= num; i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}else {
			for(int i = 1; i<=num; i++) {
				System.out.print(i + " ");
			}
			break;
		}
		}
		sc.close();
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}else {
			for(int i = num; i> 0; i--) {
				System.out.print(i+ " ");
				
			}
		}
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}else {
				for(int i= num; i> 0; i--) {
					System.out.print(i + " ");
				}
				break;
			}
		}
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		
		int num = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i<= num; i++) {
			sum += i;
			System.out.print(i);
		if( num == i) {
			System.out.print("+");
		}
		}
		System.out.print(sum);
		sc.close();
	}
	
	public void practice6() {
		
		/*
		 * 
		 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		 *  만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}else {
			if(num2> num1) {
				for(int i = num1; i<= num2; i++) {
					System.out.println(i + " ");
				}
			}else { 
				for(int i = num2; i<=num1; i++) {
					System.out.print(i + " ");
					
				}
			}
		}
		sc.close();
		
	}
	
	public void practice7() {
	
		/*
		 * 위 문제와 모든 것이 동일하나,
		 *  1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요”가
		 *   출력되면서 다시 사용자가 값을 입력하도록 하세요.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			if(num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}else {
				if(num2 > num1) {
					for(int i = num1; i<= num2; i++) {
						System.out.print(i+" ");
					}
				}else {
					for(int i = num2; i<=num1; i++) {
						System.out.print(i +" ");
					}
				}
				
				break;
			}
		}
		
		sc.close();
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9) {
			System.out.println("====" + dan + "단 ===");
			
			for(int i=1; i<10; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
			}
		}
	}
	
	public void practice9() {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		while(true) {
			if(dan < 10) {
				System.out.println("====" + dan + "단" + "====");
				for(int i = 1; i<10; i++) {
					System.out.printf("%d x %d = %d\n ", dan, i , dan* i);
				}
				dan++;
				if(dan > 9) {
					break;
				}
			}else {
				System.out.println("9이하의 숫자만 입력해주세요.");
			}
			sc.close();
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("숫자 : ");
			int dan = sc.nextInt();
			if(dan < 10) {
				for(int i = dan; i<10; i++) {
					System.out.println("====" + i + "단====");
					for(int j = 1; j<10; j++) {
						System.out.printf("%d x %d = %d\n",i,j,i*j);
					}
				}
				break;
			}else {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			}
		}
		sc.close();
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
		
		for (int i = 0; i<10; i++) {
			System.out.print(num1 + " ");
			num1 += num2;
		}
	}
	
	public void practice12() {
		
		/*
	    정수 두 개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
		단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며 exit가 들어오면 
		“프로그램을 종료합니다.”를 출력하고 종료합니다.
		또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면 “0으로 나눌 수 없습니다.
		 다시 입력해주세요.”를 출력하며, 없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”
		 라고 출력하고 두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
	   */
		
	 Scanner sc = new Scanner(System.in);
	 while(true) {
		 
		 System.out.print("연산자( +, - , * , / , %");
		 String op = sc.nextLine();
		 
		 if(op.equals("exit")) {
			 System.out.println("프로그램을 종료합니다.");
			 break;
		 }
		 System.out.print("정수1 : ");
		 int num1 = sc.nextInt();
		 
		 System.out.print("정수2 : ");
		 int num2 = sc.nextInt();
		 
		 int result = 0 ; 
		 
		 if( op.equals("+")) {
			 result = num1 + num2;
		 }else if (op.equals("-")) {
			 result = num1 - num2;
		 }else if(op.equals("*")) {
			 result = num1 * num2;
		 }else if(op.equals("/")) {
			 result = num1 / num2;
		 }else if(op.equals("%")) {
			 result = num1 % num2;
		 }else { 
			 System.out.println("없는 연산자 입니다. 다시 입력해주세요.");
			 sc.nextLine();
			 continue;
		 }
		 if(num2 == 0) {
			 System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			 sc.nextLine();
			 continue;
		 }
		 System.out.printf("%d %s %d = %d\n", num1, op, num2, result);
		 sc.nextLine();
		 
	 }
	 sc.close();
	}
		
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int j= num; j < 0 ; j++) {
			for(int i=j; i<=0; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		sc.close();
		
	}
	
	public void practice14() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for( int j = num; j >0 ; j--) {
			for( int i = j; i> 0; i--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		sc.close();
	}
	
}
