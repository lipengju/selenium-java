package info.itest.www.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import info.itest.www.pages.*;

public class HomePage  extends BasePage
{
	By firstPostLocator=By.cssSelector(".entry-title>a");
	
	public HomePage(WebDriver driver,String url)
	{
		super(driver);
		this.url=url;
		this.goTo();
	}
	
	public WebElement getFirstPostLink()
	{
		return this.driver.findElement(firstPostLocator);
	}
}
