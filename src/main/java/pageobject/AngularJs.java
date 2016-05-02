package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AngularJs {

	private WebDriver driver;
	private By checkboxcontrol = By.xpath("//*[@id='docs-menu-Demos']/li[5]/menu-link/a");
	private By demobutton = By.xpath("/html/body/md-sidenav/md-content/ul/li[3]/menu-toggle/button");
	private By checkbox1_class = By.className("@class='standard'");
	private By checkbox1_xpath = By.xpath(".//following-sibling::*[@class='layout-wrap layout-gt-sm-row layout-column']//*[normalize-space(text())='Checkbox 1: true']");
	public AngularJs(WebDriver driver)
	{
		String url = driver.getCurrentUrl();
		if(!url.contains("https://material.angularjs.org/latest"))
		{
			System.out.println("Failed:This is not the AngularJS Material Page");
		}
		this.driver=driver;
	}
	
	public AngularJs demoButtonClick()
	{
		driver.findElement(demobutton).click();
		System.out.println("1");
		return this;
	}
	
	public DemoCheckbox checkboxClick()
	{
		driver.findElement(checkboxcontrol).click();
		System.out.println("2");
		return new DemoCheckbox(driver);
	}
	
	public String getCheckboxText()
	{
		WebElement we = driver.findElement(checkbox1_class).findElement(checkbox1_xpath);
		String actualText = we.getText();
		return actualText;
	}
	
	public void verifyCheckboxText()
	{
		WebElement we = driver.findElement(checkbox1_class).findElement(checkbox1_xpath);
		if(we.isSelected())
		{
			getCheckboxText();
		}
		else
		{
			we.click();
			getCheckboxText();
		}
		
		//return true;
	}
}
