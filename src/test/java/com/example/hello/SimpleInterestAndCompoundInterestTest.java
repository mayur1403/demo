package com.example.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleInterestAndCompoundInterestTest {

	@Test
	public void test() {
		SimpleInterestAndCompoundInterest s=new SimpleInterestAndCompoundInterest();
		assertEquals(5,s.SimpleIntrest(10, 10, 5));
		assertEquals(19.6,s.CompoundIntrest(10, 5, 2, 2));
		
		
	}

}
