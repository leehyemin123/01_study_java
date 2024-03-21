package com.kh.practice.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		
		/*
		 * 길이가 10인 배열을 선언하고 
		 * 1부터 10까지의 값을 반복문을 이용하여 
		 * 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		 */
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			
			System.out.print((arr[i])+ " ");
		}
	}
	
	public void practice2() {
		/*
		 * 길이가 10인 배열을 선언하고 1부터 10까지의 값을 
		 * 반복문을 이용하여 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		 */
		
		int[] arr = new int[10];
		
		for(int i= 0; i<arr.length; i++) {
			arr[i] = 10 - i;
			System.out.print((arr[i])+ " ");
		}
	}
	
	public void practice3() {
		
		/*
		 * 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		 *  1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print((arr[i])+ " ");
		}
	}
	
	public void practice4() {
		
		/*
		 * 길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로
		 *  초기화 한 후 배열 인덱스를 활용해서 귤을 출력하세요.
		 */
		
		String[] arr = {"사과","귤","포도","복숭아","참외"};
		System.out.println(arr[1]);
	}
	
	public void practice5() {
		
		/*
		 * 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 
		 * 문자열에 몇 개 들어가 있는지 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
			
			for(int i=0 ; i<arr.length; i++) {
				arr[i] = str.charAt(i);
			}
			
			System.out.print("문자 : ");
			char ch = sc.nextLine().charAt(0);
			
			int count = 0;
			
			System.out.print(str + "에" + ch + "가 존재하는 위치 (인덱스) : ");
			
			for(int i =0 ; i< arr.length; i++) {
				if(arr[i] == ch) {
					System.out.print(i + " ");
					count++;
				}
			}
			
			System.out.println();
			System.out.println(ch + "개수 : " + count);
		}
	
	public void practice6() {
		
		/*
		 * “월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아 
		 * 입력한 숫자와 같은 인덱스에 있는
		 * 요일을 출력하고 범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0~6사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		char[] week = {'월','화','수','목','금','토','일'};
		
		if(num >= 0 && num < 7 ) {
			System.out.println(week[num] + "요일");
		}else { 
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0 ; i<arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i = 0; i< arr.length; i++) {
			System.out.println(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println();
		System.out.println("총 합 : " + sum);
		
	}
	
	public void practice8() {
		
		Scanner sc= new Scanner(System.in);
		int n ;
		
		while(true) {
			System.out.print("정수 : ");
			n = sc.nextInt();
			if(n%2 == 1 && n>=3) {
				break;
			}else {
				System.out.println("다시 입력하세요.");
			}
		}
		
		int[] arr = new int[n];
		for(int i = 0; i<n /2; i++) {
			arr[i] = i+ 1;
		}
		for(int i = n/2; i<n; i++) {
			arr[i] = n/2+1-(i-n/2);
		}
		
		for (int i=0;i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		// 배열생성
		String[] chickens = {"황금올리브","허니콤보","뿌링클"};
		
		// int count = 0 ;
		boolean flag = false; // 현재 플래그라는 박스에 펄스가 있음 (치킨이 없는 것)
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String chicken = sc.nextLine();
		
		for(int i=0; i<chickens.length; i++) {
			if(chickens[i].equals(chicken)) {
				// count++;
				flag = true; // (치킨이 있는 것)
			}
		}
		
		if(flag == true) { // 치킨이 있는 경우 // if(count == 1)로 풀수 도 있음.
			System.out.println(chicken + "치킨 배달 가능");
		}else { // 치킨이 없는 경우
			System.out.println(chicken + "치킨 배달 불가");
		}
	}
	
	public void practice10() {
		/*
		 * 주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
		 *	단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : "); // 스트링으로 받아야 함 - 때문에 
		String idNum = sc.nextLine();
		
		char[] arr = new char[idNum.length()];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = idNum.charAt(i);
		}
		
		char[] arrCopy = arr.clone();
		
		for(int i=8; i< arrCopy.length; i++) {
			arrCopy[i] = '*';
		}
		
		for (int i=0; i< arrCopy.length; i++) {
			System.out.println(arrCopy[i]);
		}
	}
	
	public void practice11() {
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 
		// 1~10 사이의 난수를 발생시켜 배열에 초기화 한 후 출력하세요.
		
		Random random = new Random();
		int[] array = new int[10];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10) + 1; // 1~10 사이의 난수 생성
		}
		
		for(int num : array) {
			System.out.print(num + " ");
			 
		}
	}
	
	public void practice12() {
		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 
		 * 1~10 사이의 난수를 발생시켜 배열에 초기화 후 
		 * 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		 */
		
		Random random = new Random(); 
			int[] array = new int[10];
			
			for(int i = 0 ; i< array.length; i++) {
				array[i] = random.nextInt(10)+1; // 1~10사이의 난수 생성
			}
			
			int max = array[0];
			int min = array[0];
			for(int num : array) {
				System.out.print(num + " ");
				if(num>max) {
					max = num;
				}
				if(num < min) {
					min = num;
				}
			}
			
			System.out.println("최소값 :" + min);
 		}
	
	public void practice13() {
		
		/*
		 * 0개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
			1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요
		 * 
		 */
		
		Random random = new Random();
		int[] array = new int[10];
		boolean[] isUsed = new boolean[10];
		
		int count = 0;
		while(count < 10) {
			int num = random.nextInt(10) + 1; // 1~10 사이의 난수 생성
			if(!isUsed[num-1]) {
				array[count] = num;
				isUsed[num-1]= true;
				count++;
			}
		}
		
		for(int num : array) {
			System.out.print(num + " ");
		}
		
 	}
	
	public void practice14() {
		int[] lotto = new int[6]; // 0~5번 인덱스 까지 있는 상태
		
		for(int i=0; i<lotto.length; i++) {
			
			lotto[i] = (int)(Math.random()*45+1);
			
			for(int j=0; j<i; j++) { // 앞전에 나온적이 있는지 검사하려고 for문 돌린다.
				if(lotto[i] == lotto[j]) {
					i--; // i를 계속 증가시키면 언저ㅔㄴ간 for문을 빠져나오기 때문에 감소시켜준다.
					// 끝나고 나서 다시한번 돌게 하기 위함
					// i를 감소시키면 한바퀴 더 돌릴 수 있음
				}
			}
		}
		
		Arrays.sort(lotto);//오름차순 정렬 해주는 메소드
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+ " ");
		}
	}
	
	public void practice15() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()]; // 글자 수 만큼 배열 생성됨
		int count = 0;
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = str.charAt(i); // 잘 들어갔는지 확인하고 싶다면 arr을 print로
			
			boolean flag = true;
			
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					flag = false;
				}
			}
			
			if(flag) { // 앞전에 그 글자가 있었기 때문 
				
				if(i == 0 ) {
					System.out.print(arr[i]);
					
				}else {
					
					System.out.print("," + arr[i]); // 맨앞은 항상 0번 인덱스임을 생각하기
					
				}
				
				count++;
			}
			
		}
			System.out.println("\n문자개수 : " + count);
		}
		
	
		public void practice16() {
	
			/*
			 * 사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
			  배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
			  단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
			  늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
			  사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
			 */
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("배열의 크기를 입력하세요 : ");
			int num = sc.nextInt();
			
			sc.nextLine();
			
			String[] origin = new String[num];
			
			// 배열 복사
			String[] copy = origin;
			
			for(int i=0; i<origin.length; i++) {
				System.out.printf("%d번째 문자열 : ", i+1);
				origin[i] = sc.nextLine();
			}
			
			while(true) {
				System.out.print("더 값을 입력하시겠습니다? (Y/N)");
				char ch = sc.nextLine().charAt(0);
				
				if(ch == 'y' || ch == 'Y') {// 더입력하고 싶은 경우
					
					System.out.print("더 입력하고 싶은 개수 : ");
					num = sc.nextInt();
					
					sc.nextLine();
					
					copy = Arrays.copyOf(origin, origin.length + num);
					
					for(int i= origin.length; i<copy.length; i++) {
						System.out.printf("%번째 문자열", i+1);
						copy[i] = sc.nextLine();
					}
				}
			}
					
		}
	
	}



