package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class DemoCheckbox {
	
	private WebDriver driver=null;
	private By demo = By.xpath("/html/body/md-sidenav/md-content/ul/li[3]/menu-toggle/button");
	public By chkboxbtn = By.xpath("/html/body/md-sidenav/md-content/ul/li[3]/menu-toggle/ul/li[5]/menu-link/a");
	//Matching 10 checkbox at the time of debugging displaying only 5 check box
	//public By chkbox = By.xpath(".//md-checkbox[@ng-checked='exists(item, selected)']");
	public By chkbox = By.xpath(".//md-checkbox[@ng-checked='exists(item, selected)' and @role = 'checkbox']");
	private By checkbox1_class = By.className("standard");
	private By checkbox1_xpath = By.xpath(".//following-sibling::*[@class='layout-wrap layout-gt-sm-row layout-column']//*[normalize-space(text())='Checkbox 1: true']");
	private By dependchkbox = By.xpath(".//*[@type='checkbox']");
	public DemoCheckbox(WebDriver driver)
	{
		String url=driver.getCurrentUrl();
		if(!url.contains("checkbox"))
		{
			System.out.println("Failed:This is not the Checkbox page");
		}
		this.driver=driver;
	}
	
	//Verify check box text when check box is checked
	//Need to ask if condition is true then else part is executing
	public String verifyCheckboxText()
	{
		WebElement we = driver.findElement(checkbox1_class).findElement(checkbox1_xpath);
		String actualText;
		if(we.isSelected())
		{
			we.click();
			actualText = we.getText();
		}
		else
		{
			actualText = we.getText();
		}
		
		return actualText;
	}
	
	public DemoCheckbox isChecked() throws InterruptedException
	{
		driver.findElement(demo).click();
		driver.findElement(chkboxbtn).click();
		Thread.sleep(3000);
		List <WebElement> a1 = driver.findElements(chkbox);
		int b = a1.size();
		System.out.println(b);
		for(int i=0;i<5;i++)
		{
			boolean flg = a1.get(i).isSelected();
			if(!flg)
			{
				a1.get(i).click();
			}
			//Thread.sleep(5000);
		}
		return this;
	}
	
	public boolean isDependentCheckboxChecked() throws InterruptedException
	{
		driver.findElement(demo).click();
		driver.findElement(chkboxbtn).click();
		Thread.sleep(3000);
		List <WebElement> a1 = driver.findElements(chkbox);
		int b = a1.size();
		System.out.println(b);
		for(int i=5;i<8;i++)
		{
			boolean flg = a1.get(i).isSelected();
			if(!flg)
			{
				a1.get(i).click();
			}
			//Thread.sleep(5000);
		}
		return true;
	}
	/*public boolean verifyIsDependentCheckBoxChecked()
	{
		List <WebElement> a1 = driver.findElements(dependchkbox);
		int b = a1.size();
		System.out.println(b);
		boolean a;
		for(int i=0;i<4;i++)
		{
			boolean flg = a1.get(i).isSelected();
			if(flg)
			{
				a = true;
			}
			else
			{
				a = false;
			}
		}
		return verifyIsDependentCheckBoxChecked();
	}*/
}
