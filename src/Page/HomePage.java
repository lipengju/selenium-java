package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Page.*;

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
