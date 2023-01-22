package Testng_concepts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass1 {
	
	@BeforeClass
	public void beforetest()
	{
		System.out.println("I am in testcalss1");
	}
	@Test(priority=1,groups="REgression")
	public void testcase1()
	{
		System.out.println("IN testclass1,testcase1 method,regression group");
	}

	@Test(priority=2,dependsOnMethods= {"firstrun"},groups="smoke")
	public void testcase2()
	{
		System.out.println("IN testclass1,testcase2 method");
	}
		
	@Test
	public void firstrun()
	{
		
		System.out.println("I run before testcase2 in testclass1");
	}
}

