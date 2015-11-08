package info.itest.www.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.seleniumhq.jetty7.webapp.WebAppClassLoader;

import info.itest.www.pages.*;

public class LoginPage extends BasePage 
{
	private WebElement submitButton;
	
	By usernameLocator=By.id("user_login");
	By passwordLocator=By.id("user_pass");
	By loginbuttonLocator=By.id("wp-submit");
	By loginErrorLocator=By.id("login_error");
	
	public LoginPage(WebDriver driver,String url)
	{
		super(driver);
		if(url==null | url=="")
		{
			System.out.println("url不能为空");
		}
		else
		{
			this.url=url;
		}
		
		this.goTo();
	}
	
	public WebElement  getUserTextField()
	{
		return this.driver.findElement(usernameLocator);
	}
	
	public WebElement  getPasswordField()
	{
		return this.driver.findElement(passwordLocator);
	}
	
	public WebElement  getSubmitButton()
	{
		return this.driver.findElement(loginbuttonLocator);
	}
	
	public WebElement loginErrorDiv()
	{
		return this.driver.findElement(loginErrorLocator);
	}
	
	//登录成功后，返回用户的昵称，遵守的对象模式之一是：Methods return other PageObjects
	public DashPage login(String userName,String password)
	{
		this.doLoginStep(userName, password);
		return new DashPage(this.driver);
	}
	
	//登录失败的处理
	public LoginPage loginFailed(String userName,String password)
	{
		this.doLoginStep(userName, password);
		return this;
	}
	
	//公共的进行封装，减少代码量
	private void doLoginStep(String userName,String password)
	{
		this.getUserTextField().sendKeys(userName);;
		this.getPasswordField().sendKeys(password);;
		this.getSubmitButton().click();
	}
	
}
