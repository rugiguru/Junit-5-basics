package com.coderlogs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testAdd() {
		
		int expected = 2;
		MathUtils mthu = new MathUtils();
		int actual =  mthu.add(1, 1);
		assertEquals(expected, actual,"the method should add two numbers");
	}
	
	@Test
	void testCrcleradiues()
	{
		MathUtils maths = new MathUtils();
		assertEquals(314.1592653589793, maths.circleArea(10), " Should return the area of circle");
	}

}
