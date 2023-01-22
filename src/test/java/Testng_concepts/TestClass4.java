package Testng_concepts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass4 {
	@BeforeClass
	public void beforetest()
	{
		System.out.println("I am in testcalss4");
	}
	
	@Test(priority=1,groups="REgression")
	public void testcase1()
	{
		System.out.println("IN testclass4,testcase1 method,regression group");
	}

	@Test(priority=2)
	public void testcase2()
	{
		System.out.println("IN testclass4,testcase2 method");
	}
}
