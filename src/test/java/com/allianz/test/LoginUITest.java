package com.allianz.test;

import org.testng.annotations.Test;

public class LoginUITest {
	@Test(priority = 1)
	public void titleTest()
	{
		System.out.println("titleTest");
	}
	@Test(priority = 2)
	public void applicationDescriptionTest()
	{
		System.out.println("AppTest");
	}
	@Test(invocationCount = 2)
	public void CountTest()
	{
		System.out.println("countTestcaseExecutionTest");
	}
}
