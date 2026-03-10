package com.capg.java;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase{
	
	Calculator obj;
	
	public void setUp() {
		obj = new Calculator();
	}
	
	public void testAll() {
		
		assertEquals(5,obj.addition(2, 3));
		
		assertEquals(6,obj.multiply(2, 3));
		
		assertEquals(1,obj.subtraction(2, 1));
		
		assertEquals(2,obj.divide(10,5));
	}
	
	public void tearDown() {
		obj = null;
	}
}