package com.kh.practice.comp.func;

import java.util.Scanner;

public class UpAadDown {

	public void upDown() {
		
		Scanner sc = new Scanner(System.in);
		
		int random = (int)(Math.random()*100+1);
		int count = 0;
		
		while(true) {
			
			System.out.println("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			int guess = sc.nextInt(); // 70 => 1~100
			
			if(guess > 0 && guess < 101) { // 입력한 숫자가 1~100 사이에 있을 경우
				
				if(random > guess) {
					System.out.println("up!");
					count++;
				}else if (random < guess) {
					System.out.println("down!");
					count++;
				}else {
					count++;
					System.out.println("정답입니다!");
					System.out.println(count+"회만에 맞췄다!!");
					break;
				}
			}else { 
				System.out.println("1~100 사이의 숫자를 입력해주세요.");
			}
		}
	}
}
