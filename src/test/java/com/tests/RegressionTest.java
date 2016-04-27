package com.tests;

import org.testng.annotations.Test;

import pageobject.AngularJs;
import pageobject.DemoCheckbox;

public class RegressionTest extends Hooks
{
	AngularJs angularjs;
	DemoCheckbox democheck;
	
	@Test
	public void openCheckboxPage()
	{
		angularjs = new AngularJs(driver);
		angularjs.demoButtonClick().checkboxClick();
	}
}
