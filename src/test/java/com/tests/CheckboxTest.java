package com.tests;

import org.testng.annotations.Test;

import pageobject.CheckboxPage;
import pageobject.HerokuappPage;

public class CheckboxTest extends Hooks
{
	HerokuappPage heroku;
	CheckboxPage chkpage;

	@Test
	public void openCheckboxPage() throws InterruptedException
	{
		heroku = new HerokuappPage(driver);
		heroku.clickCheckbox().selectAllCheckbox().unselectAllCheckbox();
		/*chkpage = new CheckboxPage(driver);
		chkpage.selectAllCheckbox().unselectAllCheckbox();*/
	}
	

}
