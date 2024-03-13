package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_keyboardInput;

public class Run {

	public static void main(String[] args) {
		A_Variable a = new A_Variable();
		a.printVariable();
		a.declearVariable();
		
		B_keyboardInput b = new B_keyboardInput();
		//b.inputTest1();
		b.inputTest2();
	}

}
