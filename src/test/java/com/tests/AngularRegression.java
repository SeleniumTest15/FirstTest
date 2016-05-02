package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.DemoCheckbox;

public class AngularRegression extends Hooks
{
	@Test
	public void test() throws InterruptedException
	{
		DemoCheckbox d = new DemoCheckbox(driver);
		d.isChecked();
	}
	
	@Test
	public void test1()
	{
		String expected = "Checkbox 1: true";
		DemoCheckbox d = new DemoCheckbox(driver);
		Assert.assertEquals(d.verifyCheckboxText(),expected,"Failed: ");
	}
	
	//@Test
	/*public void test3() throws InterruptedException
	{
		DemoCheckbox d = new DemoCheckbox(driver);
		//d.isDependentCheckboxChecked();
		Assert.assertEquals(d.isDependentCheckboxChecked(), d.verifyIsDependentCheckBoxChecked(),"Failed : ");
	}*/
}
