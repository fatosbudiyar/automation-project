package com.cybertek;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestGNDemo {
	@BeforeMethod
	public void setUpMethod() {
		System.out.println("runs before every method");
	}
	//@Ignore --->not gonna run this test with @ignore
	@Test
	public void testOne() {
		System.out.println("First one");
	}

	@Test
	public void testSecond() {
		System.out.println("Second one");
	}
	@AfterMethod
	public void teardownMethod() {
		System.out.println("runs after every method");
		
	}
	
	@BeforeClass
	public void setUpClass() {
		System.out.println("runs once before everything in this class");
	}

	@AfterClass
	public void tearDownClass() {
		System.out.println("runs once after everything in this class");
	}
}

