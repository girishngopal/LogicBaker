package com.mycompany.com.logicbaker.mathutil.substract;

import org.junit.Test;

import junit.framework.TestCase;

public class SubtractTest extends TestCase {
	
	@Test
	public void testSubtract(){
		assertEquals(Sub.sub(2, 1),1);		
	}
	
	@Test
	public void testNegativeSubtract(){
		assertEquals(Sub.sub(1, 2),-1);		
	}
	
	@Test
	public void testZeroSubtract(){
		assertEquals(Sub.sub(0, 0),0);		
	}

}
