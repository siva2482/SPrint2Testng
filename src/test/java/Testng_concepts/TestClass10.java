package Testng_concepts;

import org.testng.annotations.Test;

public class TestClass10 {
	
	@Test(priority=1,groups="REgression")
	public void testcase1()
	{
		System.out.println("IN testclass10,testcase1 method,regression group");
	}

	@Test(priority=2,dependsOnGroups="testing")
	public void testcase2()
	{
		System.out.println("IN testclass10,testcase2 method");
	}
	@Test(groups= {"testing"})
	public void testcase3()
	{
		System.out.println("IN testclass10,testcase3 method with group testing");
	}


}
