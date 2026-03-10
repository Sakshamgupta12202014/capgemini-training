package com.capg.java;
import junit.framework.TestCase;

public class CalculationTest extends TestCase{
	public void testAdd() {
		Calculation call = new Calculation();
		int result = call.addition(2, 3);
		
		assertEquals(5, result);
		
		// assertEquals(5, new Calculation().addition(2, 3));
		
		assertEquals(10, new Calculation().substraction(15, 5));
	}
}
