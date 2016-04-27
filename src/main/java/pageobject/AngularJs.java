package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AngularJs {

	private WebDriver driver;
	private By checkboxcontrol = By.className("md-primary md-raised md-button md-ink-ripple");
	private By demobutton = By.className("md-primary md-raised md-button md-ink-ripple");
	
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
		WebElement t =driver.findElement(demobutton);
		System.out.println("1");
		return this;
	}
	
	public DemoCheckbox checkboxClick()
	{
		WebElement chkboxcontrol = driver.findElement(checkboxcontrol);
		System.out.println("2");
		return new DemoCheckbox(driver);
	}
}
