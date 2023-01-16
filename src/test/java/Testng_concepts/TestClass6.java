package Testng_concepts;

import org.testng.annotations.Test;

public class TestClass6 {
	
	
	@Test(priority=1,groups="REgression")
	public void testcase1()
	{
		System.out.println("IN testclass6,testcase1 method,regression group");
	}

	@Test(priority=2)
	public void testcase2()
	{
		System.out.println("IN testclass6,testcase2 method");
	}

}
