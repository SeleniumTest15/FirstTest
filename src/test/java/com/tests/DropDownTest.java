package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.DropdownPage;
import pageobject.HerokuappPage;

public class DropDownTest extends Hooks
{
	HerokuappPage heroku;
	DropdownPage dropdownpage;

	@Test
	public void compareDropdownValues() throws InterruptedException
	{
		String[] expectedValuesList = {"Please select an option","Option 1", "Option 2"};
		heroku = new HerokuappPage(driver);
		heroku.clickDropdown();
		dropdownpage = new DropdownPage(driver);
		Assert.assertEquals(dropdownpage.getAllValues(), expectedValuesList,"Failed : Drop Down values does not matched");
		dropdownpage.selectValueByText();
		dropdownpage.selectValueByIndex();
	}
	
	
}



