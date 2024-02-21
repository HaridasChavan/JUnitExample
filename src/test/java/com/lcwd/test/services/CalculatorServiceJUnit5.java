package com.lcwd.test.services;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CalculatorServiceJUnit5 {

	// excute the logic before all test cases

	@BeforeAll //Before all test cases
	public static void init() {
		System.out.println("This is single time logic");
	}
	@AfterAll  //After all test cases
	public static void cleanup() {
		System.out.println("After all test case logic");
	}
	
	@BeforeEach  //excutes the method before each test case

	public void eachTestcase() {
		System.out.println("Before Each");
		
	}
	@AfterEach
	public void afterTestCase() {
		System.out.println("After Each");
		
	}

	@Test
	@DisplayName("This is Custome name")
	public void addTwoNumbersTest() {
		System.out.println("First Test Case:");
		int actualResult = CalulatorService.addTwoNumbers(12, 12);
		int expectedResult = 24;
		Assertions.assertEquals(expectedResult, actualResult, "Test Failed");

	}

	@Test
	public void sumAnyNumbersTest() {
		System.out.println("Second Test Case:");

		int result = CalulatorService.sumAnyNumbers(12, 1, 2, 3);
		int expected = 18;
		Assertions.assertEquals(expected, result);

	}
	@Test
	public void productTwoNumbersTest() {
		System.out.println("Third Test case");
		int result=CalulatorService.productTwoNumbers(12, 5);
		int expectedResult=60;
		Assertions.assertEquals(expectedResult, result);
	}
	@Test
	@Disabled
	public void dividTwoNumbersTest() {
		System.out.println("Fourth Test case:");
		int result=CalulatorService.divideTwoNumbers(60, 12);
		int expectedResult=5;
		Assertions.assertEquals(expectedResult,result);
	}


}
