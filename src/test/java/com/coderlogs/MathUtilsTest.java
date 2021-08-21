package com.coderlogs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	
	MathUtils maths;
	
	@BeforeEach
	void init() {
		maths = new MathUtils();
	}
	

	@Test
	void testAdd() {
		int expected = 2;
		int actual =  maths.add(1, 1);
		assertEquals(expected, actual,"the method should add two numbers");
	}
	
	@Test
	void testCrcleradiues()
	{
		assertEquals(314.1592653589793, maths.circleArea(10), " Should return the area of circle");
	}
	
	@Test
	void testDivide()
	{
		assertThrows(ArithmeticException.class, () -> maths.divide(1, 0), "Divide by zero should throw ex");
	}

}
