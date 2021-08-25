package com.coderlogs;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {
	
	MathUtils maths;
	
//	@BeforeAll
//	static void beforeAllInit()
//	{
//		System.out.println("This needs to run before all");
//	}
	
//	@EnabledOnOs
//	@EnabledOnJre
//	@EnabledIfEnvironmentVariable
	
	@BeforeEach
	void init() {
		maths = new MathUtils();
	}
	
	
	@Test
	@DisplayName("This TDD is always disabled")
	@Disabled
	void disabledtest()
	{
		fail("Alwasy fails");
	}

	@Test
	void testAdd() {
		int expected = 2;
		int actual =  maths.add(1, 1);
		assertEquals(expected, actual,"the method should add two numbers");
	}
	
	@Test
	@DisplayName("Test for area of circle")
	void testCrcleradiues()
	{
//		boolean isServerUp = false;
//		assumeTrue(isServerUp);
		assertEquals(314.1592653589793, maths.circleArea(10), " Should return the area of circle");
	}
	
	@Test
	void testDivide()
	{
		assertThrows(ArithmeticException.class, () -> maths.divide(1, 0), "Divide by zero should throw ex");
	}

}
