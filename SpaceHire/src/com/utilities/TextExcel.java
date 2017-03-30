package com.utilities;

import java.util.Arrays;

import org.testng.annotations.Test;

public class TextExcel {

	Object[][] obj;
	
	@Test
	public void test() throws Exception{
		obj = ReadExcel.readingExcel("D:\\Automation\\AutomationFramework1\\ZOB_NewWSP\\SeleniumProject1\\ReadExcel", "readData.xlsx", "applyleave");
	System.out.println(Arrays.deepToString(obj));
	}
}
