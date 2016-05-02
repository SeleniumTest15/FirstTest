package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HerokuappPage 
{
	
	private WebDriver driver;
	private By checkboxlink = By.linkText("Checkboxes");
	private By dropdownlink = By.linkText("Dropdown");
	
	public HerokuappPage(WebDriver driver) 
	{
		String url = driver.getCurrentUrl();
		if(!url.contains("http://the-internet.herokuapp.com/"))
		{
			System.out.println("Failed:This is not the Herokuapp Page");
		}
		this.driver=driver;
	}
	
	public CheckboxPage clickCheckbox()
	{
		driver.findElement(checkboxlink).click();
		return new CheckboxPage(driver);
	}
	
	public DropdownPage clickDropdown()
	{
		driver.findElement(dropdownlink).click();
		return new DropdownPage(driver);
	}
	
}
