package com.logicbaker.mathutil.calculator;

import org.apache.commons.math3.analysis.function.Abs;

import com.logicbaker.mathutil.Adder;


public class Calculator {
	
  public static void main(String args[]){
	  Abs abs = new Abs();
	  System.out.println(abs.value(1.00));
	  
	  Adder adder = new Adder();
	  System.out.println(adder.add(1, 2));
	  
  }
  
  

}
