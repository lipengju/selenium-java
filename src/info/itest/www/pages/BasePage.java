package info.itest.www.pages;

import org.openqa.selenium.*;

/*
 * 所有页面的基类
 * */
public class BasePage
{
	protected final WebDriver driver;
	protected  String url;
	
	//构造函数
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void goTo ()
	{
		this.driver.get(this.url);
	}
	
	//遵守不要暴露底层的代码给用户
	public String currentUrl()
	{
		return this.driver.getCurrentUrl();
	}
}
