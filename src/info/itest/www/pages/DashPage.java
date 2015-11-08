package info.itest.www.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/*
 * 登录成功后跳转的页面
 * */
public class DashPage extends BasePage 
{
	By greetingLocator=By.cssSelector("#wp-admin-bar-my-account .ab-item");
	
	public DashPage(WebDriver driver)
	{
		super(driver);
	}
	
	public WebElement getGreetingLink()
	{
		return this.driver.findElement(greetingLocator);
	}
}
