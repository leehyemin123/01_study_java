package com.kh.variable;

import java.util.Scanner;

public class B_keyboardInput {

	/*
	 * 키보드로 값을 입력하는 방법
	 * Scanner를 사용한다!
	 * 즉 java.util.Scanner 클래스를 이용하는 것이다!
	 * Scanner 클래스 내부의 메소드를 호출하여 입력 받는 것 
	 */
	
	public void inputTest1() {
		
		// 스캐너 클래스의 객체 생성
		Scanner sc = new Scanner(System.in);
		// System.in은 입력받은 값을 바이트 단위로 받아들이겠다는 의미 
		// 출력시에는 System.out 이라는 구문을 사용 
		
		System.out.println("아무거나 입력해보세요 : ");
		String message = sc.nextLine();
		
		System.out.println("입력받은 내용 :" + message);
		
		sc.close();
		
	}
	
	public void inputTest2() {
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까? :");
		
		// 사용자가 입력한 값을 문자열로 받아오는 메소드 (nextLine(),next())
		// String name = sc.nextLine();
		// System.out.println("이름 : " + name);
		
		// next() : 사용자가 입력한 값 중 공백이 있을 경우 공백 이전까지의 값만 읽어온다.
		//          따라서 거주지처럼 공백이 있는 데이터는 제대로 된 값을 못 가져올 수 도 있다.
		
		String name = sc.nextLine();
		
		System.out.print("당신의 나이는 몇살입니까? : ");
		int age =sc.nextInt(); // 사용자가 입력한 값을 정수로 읽어들이는 메소드
		
		System.out.print("당신의 키는 몇입니까?(소숫점 첫째자리) : ");
		double height = sc.nextDouble(); // 사용자가 입력한 값을 실수로 읽어들이는 메소드
		
		// xxx님은 xx살이며 , 키는 xx.xcm 입니다.
		
		System.out.println(name + "님은" + age+ "살이며 , 키는 "+ height + "cm입니다.");
		
	}
	
	// 키보드로 값을 입력 받을 때 종종 발생되는 문제 
	public void inputTest3() {
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		// 버퍼에 남아있는 엔터 (\n)을 비워주지 못해서 오류 발생!! 
		sc.nextLine();
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		//xxx 님은 xx 살이며, 사는곳은 xxx 이고, 키는 xxx.xcm입니다.
		System.out.printf("%s님은 %d살이며, 사는곳은 %s이고, 키는 %.1fcm 입니다.", name,age,address,height);
	}
	
	public void inputTest4() {
		Scanner sc = new Scanner(System.in);
		
		// 문자열을 입력 받을 때 => sc.nextLine();
		// 문자만 입력 받을 때 => sc.next();
		// 정수값을 입력 받을 때 => sc.nextInt();
		// 실수값을 입력 받을 때 => sc.nextDouble();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		// char gender = sc.nextChar(); nextChar()와 같은 메소드는 존재하지 않는다.!!
		char gender = sc.nextLine().charAt(0);
		// ** 인덱스 : 순번 같은 존재, 단, 0부터 시작함 !! 
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		/*
		 * xxx님의 개인정보 
		 * 성별 : x
		 * 나이 : xx
		 * 키 : xxx.x
		 */
		
		System.out.println(name + "님의 개인정보");
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age );
		System.out.println("키 : " + height);
	}

	public void charAtTest() {
		String str = "Hello";
		
		// 변수에 기록하여 출력하는 방식
		char ch = str.charAt(4);
		System.out.println(ch);
		
		// 바로 출력하는 방식
		System.out.println(str.charAt(1));
		
		// 존재하지 않는 인덱스 : 오류발생 !!!
		// System.out.println(str.charAt(12));
		// StringIndexOutBoundsException 발생 
		
		/*
		 * ** 정리 **
		 * 1. 콘솔창 (모니터)에 출력하기 위해 : System.out.print[ln] () 메소드를 이용 
		 * 2. 콘솔창(키보드)에 입력하기 위해 : Scanner 이용해서 (nextLine(), next(), nextInt(), nextDouble(),..)
		 * 
		 * 		> 주의사항
		 * 		1) sc.nextXXX() 메소드 뒤에 sc.nextLine() 메소드가 와야 될 경우
		 * 			sc.nextLine() 메소드를 한번 더 써줘서 버퍼에 남아있는 "엔터"를 빼주는 과정이 필수 !! 
		 * 		2) "문자" 값을 입력받아야 될 경우 
		 * 			sc.nextLine() 메소드를 통해 우선 문자열로 입력 받고 
		 * 			그 뒤에 .charAt(인덱스값)메소드를 통해서 문자 하나 추출
		 */
	}
}
