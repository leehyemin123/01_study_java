package com.kh.run;

import java.util.Scanner;

import com.kh.variable.A_Variable;
import com.kh.variable.B_keyboardInput;
import com.kh.variable.C_Printf;
import com.kh.variable.D_Cast;

public class Run {

	public static void main(String[] args) {
		A_Variable a = new A_Variable();
		//a.printVariable();
		//a.declearVariable();
		
		B_keyboardInput b = new B_keyboardInput();
		//b.inputTest1();
		//b.inputTest2();
		//b.inputTest3();
		
		C_Printf c = new C_Printf();
		//c.printfTest();
		
		D_Cast d = new D_Cast();
		//d.autoCasting();
		d.forceCasting();

	}
}
