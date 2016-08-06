package com.logicbaker.mathutil.Calc;

import com.logicbaker.mathutil.adder.Adder;

public class Calculator {
	
	
	public static void main(String args[]){
		
	/*	Abs abs = new Abs();
		System.out.println(abs.value(10.001893129));*/
		
		Adder adder = new Adder();
		System.out.println(adder.add(1, 3));
	}

}
