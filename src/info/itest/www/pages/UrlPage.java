package info.itest.www.pages;

import org.openqa.selenium.WebDriver;

public class UrlPage  extends BasePage
{
	public UrlPage(WebDriver driver)
	{
		super(driver);
	}
	
	public final String loginPageUrl="http://localhost/wordpress/wp-login.php";

	public String getLoginPageUrl() {
		return loginPageUrl;
	}
	
	
}
