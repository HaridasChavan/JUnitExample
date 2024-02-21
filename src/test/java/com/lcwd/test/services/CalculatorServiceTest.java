//package com.lcwd.test.services;
//
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.springframework.context.annotation.Bean;
//
//import java.util.Date;
//
//import junit.framework.Assert;
//
//public class CalculatorServiceTest {
//	int counter=0;
//	
//	@BeforeClass //Before all test cases
//	public  static void init() {
//		System.out.println("Before all test Cases:");
//		System.out.println("Started test " + new Date());
//	}
//	@Before //excutes the method before each test case
//	public void beforEach() {
//		System.out.println("Before each test case");
//		counter=0;
//	}
//
//	// test method of addTwoNumbers
//
//	@Test(timeout = 2000)
//	public void addTwoNumbersTest() throws InterruptedException {
//		for(int i=0;i<=20;i++) {
//			 counter+=i;
//		}
//		Thread.sleep(3000);
//			
//		System.out.println("Test for addTwoNumberTest");
//		int result = CalulatorService.addTwoNumbers(12, 45);
//		int expected = 57;
//		System.out.println("counter in first test case:"+counter);
//		Assert.assertEquals(expected, result);
//		// actual rest
//
//		// expected result
//
//	}
//
//	@Test
//	public void sumAnyNumbersTest() {
//		for(int i=0;i<=100;i++) {
//			 counter+=i;
//		}
//		System.out.println("Test for sumAnyNumberTest");
//
//		int result = CalulatorService.sumAnyNumbers(2, 7, 8, 9);
//		int expectedResult = 26;
//		System.out.println("counter in second test case:"+counter);
//
//		Assert.assertEquals(expectedResult, result);
//	}
//
//	@Test
//	public void productTwoNumbersTest() {
//		System.out.println("Test for productTwoNumberTest");
//
//		int result = CalulatorService.productTwoNumbers(12, 2);
//		int expectedResults = 24;
//		Assert.assertEquals(expectedResults, result);
//	}
//
//	
//	@AfterClass //After all test cases
//	public  static void cleanup() {
//		System.out.println("After all Test Cases");
//		System.out.println("End the Test Cases:"+ new Date());
//	}
//
//}
