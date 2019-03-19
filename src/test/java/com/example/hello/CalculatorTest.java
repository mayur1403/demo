/**
 * 
 */
package com.example.hello;

import static org.junit.Assert.*;


import org.junit.Test;

/**
 * @author PC
 *
 */
public class CalculatorTest {

	@Test
	public void test() {
		Calculator c=new Calculator();
		assertEquals(3,c.add(1, 2));
		assertEquals(1,c.subtract(2, 1));
		assertEquals(2,c.multiply(1, 2));
		assertEquals(1,c.divide(2, 2));
	}

}
