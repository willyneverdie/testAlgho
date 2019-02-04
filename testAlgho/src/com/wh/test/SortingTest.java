package com.wh.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class SortingTest {

	String s;
	
	@Before
	public void before() {
		System.out.println("Before;");
		s = "Hola";
	}
	
	@Test
	void test() {
		assertEquals(1,1);
	}

	@Test
	void testString() {
		assertEquals(s, s);
	}
}
