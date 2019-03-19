package com.example.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class HousePricetest {

	@Test
	public void test() {
		HousePrice h=new HousePrice();
		assertEquals(1200000.00,h.ConstructionCost("normal", 1000, false));
		assertEquals(1500000.00,h.ConstructionCost("above", 1000, false));
		assertEquals(1800000.00,h.ConstructionCost("high", 1000, false));
		assertEquals(2500000.00,h.ConstructionCost("high", 1000, true));
	}

}
