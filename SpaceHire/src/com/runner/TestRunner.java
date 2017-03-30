package com.runner;

import org.testng.TestNG;

import space.testsuites.LoginFunction;

public class TestRunner {

	public static void main(String[] args) {
		
		System.out.println("hellooooooooo");
	
		TestNG testng = new TestNG();
		
		testng.setTestClasses(new Class[]{LoginFunction.class});

		testng.run();
	}

}
