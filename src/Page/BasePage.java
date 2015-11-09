package Page;

import org.openqa.selenium.*;

/*
 * Ò³Ãæ»ùÀà
 * */
public class BasePage
{
	protected final WebDriver driver;
	protected  String url;
	
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void goTo ()
	{
		this.driver.get(this.url);
	}
	
	public String currentUrl()
	{
		return this.driver.getCurrentUrl();
	}
	
	public  void waitTime() throws InterruptedException
	{
		Thread.sleep(2000);
	}
}
