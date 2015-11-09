package Page;

import org.openqa.selenium.WebDriver;


/*
 * ≤‚ ‘µÿ÷∑“≥√Ê¿‡UrlPage
 * */
public class UrlPage  extends BasePage
{
	public UrlPage(WebDriver driver)
	{
		super(driver);
	}
	
	public final String loginPageUrl="http://www.baidu.com/";

	public String getLoginPageUrl() 
	{
		return this.loginPageUrl;
	}
	
	
}
