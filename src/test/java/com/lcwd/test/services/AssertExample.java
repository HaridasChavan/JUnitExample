package com.lcwd.test.services;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertExample {
	// Assertion Validating actual result with expected result.
	// Assertions class

	@Test
	public void test1() {
		System.out.println("Testing some Assertion methods:");
		int actual = 12;
		int expected = 12;

		// Overloaded
//Assertions.assertEquals(expected, actual);
//int[] actualIntArray = { 1, 2, 3, 4, 5 };
//int[] expectedIntArray = { 1, 2, 3, 4, 5 };
//Assertions.assertArrayEquals(expectedIntArray,actualIntArray);
		
//String name=new String("Mangal");
//String expectedName=new String("Mangal");
		
//Assertions.assertSame(expectedName, name);
//String name="Mangal";
//String expectedName="Mangal";
//Assertions.assertEquals(expectedName,name);
		
//boolean value=true;
//Assertions.assertTrue(value);
		
		List<Integer>list1=Arrays.asList(1,2,3,4,5);
		List<Integer>list2=Arrays.asList(1,2,3,5,4);
		Assertions.assertIterableEquals(list2,list1);
		
	}

}