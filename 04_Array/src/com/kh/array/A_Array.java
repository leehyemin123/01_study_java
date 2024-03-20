package com.kh.array;

import java.util.Scanner;

public class A_Array {

	/*
	 * 변수 : 하나의 공간에 하나의 값을 담을 수 있음 
	 * 배열 : 하나의 공간에 여러개의 값을 담을 수 있는 개념
	 * 			=> "같은 자료형의 값" 으로만 담을 수 있음
	 * 			=> 정확히 얘기하자면 배열의 각 인덱스 자리에 실제 값이 담김!(인덱스는 0부터 시작!)
	 */
	
	public void method1() {
		// * 배열을 왜 쓰는지 
		
		// 변수라는 것만을 이용하게 되면 => 대량의 데이터를 보관하고자 할 때 각각의 변수를 만들어서 따로 관리 
		// int num1 = 0,1,2,3,4;
		
		//int num1 = 0;
		//int num2 = 1;
		//int num3 = 2;
		//int num4 = 3;
		//int num5 = 4;
		
		// 출력하고자 할 때도 => 일일히 출력해야됨
		//System.out.println(num1);
		//System.out.println(num2);
		//System.out.println(num3);
		//System.out.println(num4);
		//System.out.println(num5);
		
		//for(int i=1; i<=5; i++) {
		//	System.out.println(num i);
		//} 이거 안된다.
		
		// 총 합계를 구할때도 => 일일히 더해줘야함 (반복문 활용 불가)
		//int sum = num1 + num2 + num3 + num4 + num5;
		
		/*
		 * 1. 배열선언 (여러개의 값을 보관할 배열을 만들겠다 !! )
		 * [표현법]
		 * 자료형 배열명[];
		 * 자료형[] 배열명; => 사람들이 많이 씀 
		 */
		
		// int a;  변수 선언
		
		// int arr[];
		// int[] arr; // 오로지 int 값만 담을 수 있다!!
		
		/*
		 * 2. 배열 할당 => 크기지정(이 배열에 몇개의 값들을 보관할 건지 크기를 지정하는 과정, 그 개수만큼 방이 만들어진다.
		 * [표현법]
		 * 배열명 = new 자료형[배열크기]; 
		 */
		
		// arr = new int[5];
		
		// ** 배열 선언과 동시에 할당 (배열 만듬과 동시에 크기지정)
		int[] arr = new int[5];
		
		/*
		 * 3. 값 대입
		 * 		배열명[인덱스]=값;
		 */
		
		// 이거 반복문으로 써보는거 어떨까 ?
		
		/*
		 *  arr[0] = 0;
		 *  arr[1] = 1;
		 *  arr[2] = 2;
		 *  arr[3] = 3;
		 *  arr[4] = 4;
		 */
		
		// 1. 배열 장점 : 반복문 활용 가능 ! 
		for (int i = 0; i<=4 ; i++) {
			arr[i] = i;
		}
		/*
		   System.out.println(arr[0]);
		   System.out.println(arr[1]);
		   System.out.println(arr[2]);
		   System.out.println(arr[3]);
		   System.out.println(arr[4]);
		 */
		
		for(int i=0; i<=4 ; i++) {
			System.out.println(arr[i]);// 실제 arr이라는 박스에는 "주소값" 이라는게 담겨있음
		}
	}
	
	public void method2() {
		int i = 10;
		
		// 배애ㅕㄹ 선언과 동시에 할당
		int[] iArr = new int[5];
		
		System.out.println(iArr);
		
		double[] dArr = new double[3];
		System.out.println(dArr);
		
		/*
		 * 실제 값 (리터럴)을 곧바로 담을 수 있는 변수를 일반 변수라고 얘기하고, 
		 * 주소값을 담고 있는 변수는 참조변수 (레퍼런스 변수)라고 한다.
		 * 
		 * 기본자료형(boolean, char, byte, short, int, long, float, double) 으로 선언된 변수: 소문자 시작 소문자 끝
		 * 실제 값 (리터럴)을 바로 담는 변수 => 그냥 일반 변수 
		 * 
		 * 그 외 자료형(int[] , double[], char[], short[], 요런 배열형,...String..)으로 선언된 변수
		 * => 주소값을 담는 변수 => 참조 변수 (레퍼런스 변수)
		 */
	}
	
		public void method3() {
			int[] iArr = new int[3]; // 0~1번 인덱스
			double[] dArr = new double[4]; // 0~3번 인덱스
			// 배열 선언하고 크기지정(할당) 까지만 한상태 
			// 그럼 각각의 인덱스에 초기화가 돼있을까?
			
			// 각각의 인덱스에 값 안담고 출력해보기
			// iArr 배열 출력
			for (int i=0; i<3; i++) {
				System.out.println(iArr[i]);
			}
			
			System.out.println("=========================");
			
			// dArr 배열 출력
			for (int i=0; i<4; i++) {
				System.out.println(dArr[i]);
			}
			
			// 내가 각 인덱스에 초기화 (값대입) 을 하지 않아도 값들이 담겨있다. 왜일까?
			// heap 이라는 공간에 절때 빈공간이 존재할 수 없기 때문임
			// 따라서 공간이 만들어질때 JVM이 기본적으로 초기화를 진행해줌
			
		}
		
		public void method4() {
			int[] arr = new int[10];
			for (int i=0; i<arr.length; i++) {
				arr[i] = i+1;
			}
			// 값 출력
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
			System.out.println(arr);
			System.out.println(arr.hashCode());
			System.out.println("배열의 길이 : " + arr.length);
		}
		
		public void method5() {
			
			int[] arr = null;
			System.out.println(arr);
			System.out.println(arr[0]);
		}
		
		public void method6() {
			int[] arr = new int[5];
			int value =2; 
			for(int i=0; i<arr.length;i++) {
				arr[i] = value;
				value += 2 ;
				
			}
			
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
			System.out.println("arr의 해쉬코드 값 :" + arr.hashCode());
			System.out.println("arr의 길이 : " + arr.length);
			
			arr = new int[7];
			
			System.out.println("변경 후의 arr의 해쉬코드값 : " + arr.hashCode());
			System.out.println("변경 후 arr의 길이 : " + arr.length);
			// 주소값이 변경 됨 !! => 새로운 곳을 참조하고 있음!!
			
			/*
			 * 연결이 끊어진 기존 배열 Heap영역에 둥둥 떠다님.. (어디에도 참조 되어있지 않으므로 필요없는 존재임 == 지워주는게 좋음)
			 * => 일정 시간이 지나면 "가비지 컬렉터(GC)"가 알아서 지워줌 !! 
			 * => 자바에서의 "자동 메모리 관리" 특징!! == 개발자가 코드작성에만 신경 쓸 수 있음
			 */
			
			// 배열을 강제로 삭제 삭제시키고자 한다면 ?? ==> 연결고리를 끊으면 됨 
			arr = null;
			
			System.out.println(arr);// null
			
		}
		public void method7() {
			// 배열 선언, 할당, 초기화 다 동시에 하기 
			
			// 표현법1
			int[] arr1 = new int[] { 1, 2, 3, 4};
			
			// 표현법2
			int[] arr2 = {1, 2, 3, 4};
			
			System.out.println(arr1 == arr2); // false
			// 각각의 변수에 담겨있는 주소 값을 비교하기 때문 
		}
		
		public void method8() {
			// 1. 크기 10짜리 정수 배열 생성 후 
			int[] arr = new int[0];
			// 2. 반복문 활용해서 0번 인덱스~ 마지막 인덱스까지 순차적으로 접근하면서 값은 대입
			// 	  매번 1~100 사이에 발생되는 랜덤이
			
			for(int i=0; i<arr.length; i++) {
				arr[i] = (int)(Math.random()*100+1);// 시작수는 더하고 개수는 곱한다.
			}
			
			// 3. 반복문 활용해서 해당 배열의 0번 인덱스 ~ 마지막 인덱스까지 담겨 있는 값 출력
			// arr[x] : xx 
			
			for(int i=0; i<arr.length; i++) {
				System.out.println("arr["+i+"] : " + arr[i]);
				 
			}
		}
		
		public void method9() {
			// 1. 사용자에게 배열의 길이를 입력받은 후 
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("배열의 길이 입력 : ");
			int size = sc.nextInt();
			
			sc.nextLine();
			
			// 해당 그 크기 만큼 문자열 배열 생성 
			
			String[] arr = new String[size];
			
			// 2. 반복문 활용해서 매번 사용자에게 과일명 입력 받아 
			// 그 값을 매 인덱스자리에 대입 (0번~마지막인덱스)
			
			for(int i=0; i<arr.length; i++) {
				System.out.print("좋아하는 과일 입력 : ");
				arr[i] = sc.nextLine();
			}
			
			// 3. 반복문을 활용해서 0~마지막 인덱스까지 담긴 값을 출력
			// arr[x] = 사과
			
			for(int i=0; i<arr.length; i++) {
				System.out.println("arr[" + i + "] : " + arr[i] );
				
			}
			
		}
		
		public void method10() {
			// 1. 사용자에게 문자를 하나 입력 받은 후 => "apple"
			Scanner sc = new Scanner(System.in);
			
			System.out.print("문자 입력 : ");
			String str = sc.nextLine(); 
			
			System.out.print("찾고자 하는 문자 : ");
			char ch = sc.nextLine().charAt(0);
			
			// 2. char 배열 만들기 => 이때 배열의 크기 == 문자열의 길이만큼!! 
			// 각각의 인덱스에 있는 문자들을 char 배열에 옮겨 담기
			// 3. 반복문을 활용해서 해당 문자열에서 각 인덱스별로 문자 추출 후 배열에 넣기 
			
			char[] arr = new char[str.length()];
		
			for(int i=0; i<arr.length;i++) {
				arr[i] = str.charAt(i);
			}
			
			// 마지막 char 배열 출력 => arr[x] : x 
			
			// 반복문 활용해서 해당 배열의 0번~ 마지막 인덱스까지 담긴 값 출력
			// 찾고자 하는 문자가 존재할 경우 몇개 존재하는 지 알려주자
			
			int count = 0;
			
			for(int i=0; i<arr.length; i++) {
				System.out.println("arr[" + i + "] : " + arr[i] );
				
				if(ch == arr[i]) {
					count++;
				}
			}
			
			System.out.println("찾아진 문자 개수 : " + count);
		}
		
		public void method11() {
			
			// 1. 사용자에게 배열의 길이를 입력 받기.
			Scanner sc = new Scanner(System.in);
			
			System.out.print("배열의 길이 : ");
			int size = sc.nextInt();
		}
}
