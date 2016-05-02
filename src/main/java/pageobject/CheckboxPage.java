package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxPage 
{
	private WebDriver driver = null;
	private By checkbox = By.xpath(".//*[@type='checkbox']");
	
	public CheckboxPage(WebDriver driver) 
	{
		String url = driver.getCurrentUrl();
		if(!url.contains("testboxes"))
		{
			System.out.println("This is not a Checkbox Page");
		}
		this.driver = driver;
	}
	public CheckboxPage selectAllCheckbox() throws InterruptedException
	{
		List<WebElement> we = driver.findElements(checkbox);
		for(WebElement check : we)
		{
			if(!check.isSelected())
			{
				Thread.sleep(5000);
				check.click();
			}
			
		}
		return this;
	}
	public CheckboxPage unselectAllCheckbox() throws InterruptedException
	{
		List<WebElement> we = driver.findElements(checkbox);
		for(WebElement check : we)
		{
			if(check.isSelected())
			{
				Thread.sleep(5000);
				check.click();
			}
			
		}
		return this;
	}
}
