package Testng_concepts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass2 {
	@BeforeClass
	public void beforetest()
	{
		System.out.println("I am in testcalss2");
	}
	@Test(priority=2,groups="REgression")
	public void testcase1()
	{
		System.out.println("IN testclass2,testcase1 method,regression group");
	}

	@Test(priority=1)
	public void testcase2()
	{
		System.out.println("IN testclass2,testcase2 method");
	}

}
