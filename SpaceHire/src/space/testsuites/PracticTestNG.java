package space.testsuites;

import org.testng.annotations.Test;

public class PracticTestNG {

	// include, exclude
	/*@Test(priority=0,dependsOnMethods="ajay",invocationCount=3,enabled=false)
   public void bala(){
	   System.out.println("bala");
	}*/
	
	/*@Test(invocationCount=3)
	public void ajay(){
		System.out.println("ajay");
	}*/
	//alwaysRun=false
	
	@Test(groups="smoke")
	public void test1(){
		System.out.println("test1");
	}
	
	@Test(groups="smoke")
	public void test2(){
		System.out.println("test2");
	}
	
	@Test(groups="smoke")
	public void test3(){
		System.out.println("test3");
	}
	
	@Test(groups="sanity")
	public void test4(){
		System.out.println("test4");
	}
	
	@Test(groups="sanity")
	public void test5(){
		System.out.println("test5");
	}
	
	public void test6(){
		System.out.println("test6");
	}
	
	
}
