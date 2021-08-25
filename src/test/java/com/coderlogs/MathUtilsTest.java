package com.coderlogs;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {
	
	MathUtils maths;
	TestInfo testInfo;
	TestReporter testReported;
//	@BeforeAll
//	static void beforeAllInit()
//	{
//		System.out.println("This needs to run before all");
//	}
	
//	@EnabledOnOs
//	@EnabledOnJre
//	@EnabledIfEnvironmentVariable
	
	@BeforeEach
	void init(TestInfo testInfo, TestReporter testReported) {
		this.testInfo = testInfo;
		this.testReported = testReported;
		maths = new MathUtils();
		testReported.publishEntry("Running " + testInfo.getDisplayName() + " with tags " + testInfo.getTags());
	}
	
	@Test
	@DisplayName("This TDD is always disabled")
	@Disabled
	void disabledtest()
	{
		fail("Alwasy fails");
	}

	@Test
	@Tag("Math")
	void testAdd() {
		int expected = 2;
		int actual =  maths.add(1, 1);
		assertEquals(expected, actual,"the method should add two numbers");
		
	}
	
	@Test
	@DisplayName("Test for area of circle")
	@Tag("Area")
	void testCrcleradiues()
	{
//		boolean isServerUp = false;
//		assumeTrue(isServerUp);
//		System.out.println();
		assertEquals(314.1592653589793, maths.circleArea(10), " Should return the area of circle");
	}
	

	@Test
	@Tag("Math")
	void testDivide()
	{
		assertThrows(ArithmeticException.class, () -> maths.divide(1, 0), "Divide by zero should throw ex");
	}

}
