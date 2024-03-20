package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {

	/*
	 *  사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 컴퓨터가 가위인지 보인지 주먹인지는
	 *  랜덤한 수를 통해서 결정하도록 하고, => 1,2,3 => 1: 가위, 2: 바위, 3 : 보
	 *  사용자에게는 직접 가위바위보를 받으세요.
	 *  사용자가 "exit"를 입력하기 전까지 가위바위보를 계속 진행하고 "exit" 가 들어가면 반복을 멈추고 
	 *  몇 번의 승부에서 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.
	 *  
	 */
	
	public void rps2() {
		Scanner sc = new Scanner(System.in);
		// 필요한 자원 -> 변수
		int total = 0; // 전 
		int win = 0; // 승
		int tie = 0; // 무
		int lose = 0; // 패
		
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		while(true) {
			System.out.print("가위바위보 : ");
			String rps = sc.nextLine(); // exit
			
			int random = (int)(Math.random()*3 + 1);
			String com = "";
			
			switch(random){// 1 2 3'
			case 1 :
				com = "가위";
				break;
			case 2 :
				com = "바위";
				break;
			case 3 : 
				com = "보";
				break;
			}
			
			if (rps.equals("exit")) { // exit를 입력한 경우에는 종료
				// 전송무패 출력
				System.out.println(total + "전" + win + "승" + tie + "무" + lose + "패");
				// 종료
				break;
			}else if(rps.equals("가위")||rps.equals("바위")||rps.equals("보")) {
				total ++;
				System.out.println("컴퓨터 :" + com);
				System.out.println(name + " : " + rps);
				
				if(com.equals("가위")) {
					switch(rps) {
					case "가위" :
						System.out.println("비겼습니다.");
						tie ++ ;
						break;
						
					case "바위" :
						System.out.println("이겼습니다.");
						win ++;
						break;
					case "보" : 
						System.out.println("졌습니다.");
						lose ++;
						break;
					}
				}else if (com.equals("바위")) {
					switch(rps) {
					case "바위" :
						System.out.println("비겼습니다.");
						tie ++;
						break;
						
					case "보" : 
						System.out.println("이겼습니다.");
						win ++;
						break;
					case "가위" :
						System.out.println("졌습니다.");
						lose ++ ;
						break;
					}
				}else if(com.equals("보")) {
					switch(rps) {
					case "보" :
						System.out.println("비겼습니다.");
						tie ++;
						break;
						
					case "가위" :
						System.out.println("이겼습니다.");
						win ++;
						break;
					case "바위" :
						System.out.println("졌습니다.");
						lose ++;
						break;
					}
				}
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}
