package pageobject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage 
{
	private WebDriver driver;
	private By dropdownbutton = By.id("dropdown");
	public DropdownPage(WebDriver driver) 
	{
		String url = driver.getCurrentUrl();
		if(!url.contains("dropdown"))
		{
			System.out.println("Failed : This is not a drop down page");
		}
		this.driver = driver;
	}
	
	
	public String[] getAllValues()
	{
		//al.size() why this is given as parameter
		List<String> actualDropdownValues = new ArrayList<String>();
		List<WebElement>  dropdown = driver.findElement(dropdownbutton).findElements(By.tagName("option"));
		for(WebElement element:dropdown){
			actualDropdownValues.add(element.getText());
		}
		return actualDropdownValues.toArray(new String[actualDropdownValues.size()]);
		/*String list;
		Select se = new Select(driver.findElement(dropdownbutton));
		List<WebElement> dropdown = se.getOptions();
		for(WebElement we:dropdown)
		{
			list = we.getText();
			System.out.println(list);
		}
		return list;*/
	}
		
		public void selectValueByText() throws InterruptedException
		{
			Select se = new Select(driver.findElement(dropdownbutton));
			Thread.sleep(5000);
			se.selectByVisibleText("Option 1");
		}
		
		public void selectValueByIndex() throws InterruptedException
		{
			Select se = new Select(driver.findElement(dropdownbutton));
			Thread.sleep(5000);
			se.selectByIndex(2);
		}
		
	}
	
	
	


