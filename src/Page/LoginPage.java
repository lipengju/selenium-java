package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.seleniumhq.jetty7.webapp.WebAppClassLoader;

import Page.*;

public class LoginPage extends BasePage 
{
	
	By loginLocator=By.xpath(".//*[@id='u1']/a[7]");
	By usernameLocator=By.id("TANGRAM__PSP_8__userName");
	By passwordLocator=By.id("TANGRAM__PSP_8__password");
	By loginbuttonLocator=By.id("TANGRAM__PSP_8__submit");
	By loginErrorLocator=By.xpath(".//*[@id='TANGRAM__PSP_8__error']");
	
	//构造函数
	public LoginPage(WebDriver driver,String Url)
	{
		super(driver);
		if(url==null | url=="")
		{
			System.out.println("URL address cannot be empty");
		}
		else
		{
			super.url=Url;
		}
		
		//调用基类的方法
		super.goTo();
	}
	
	
	public WebElement getLoginDiv() throws InterruptedException
	{
		super.waitTime();
		return this.driver.findElement(loginLocator);
	}
	
	public WebElement  getUsernameField() throws InterruptedException
	{
		super.waitTime();
		return this.driver.findElement(usernameLocator);
	}
	
	public WebElement  getPasswordField() throws InterruptedException
	{
		super.waitTime();
		return this.driver.findElement(passwordLocator);
	}
	
	public WebElement  getSubmitButton() throws InterruptedException
	{
		super.waitTime();
		return this.driver.findElement(loginbuttonLocator);
	}
	
	
	public WebElement getLoginErrorDiv() throws InterruptedException
	{
		super.waitTime();
		return this.driver.findElement(loginErrorLocator);
	}
	
	
	/*
	 * 封装登录的方法
	 * */
	private void LoginStep(String userName,String password) throws InterruptedException
	{
		this.getLoginDiv();
		this.getUsernameField().sendKeys(userName);
		this.getPasswordField().sendKeys(password);
		this.getSubmitButton().click();
		
	}
	
	/*
	 * 登录成功后，返回到新的页面,对象层类为DashPage
	 *  */
	public DashPage login(String userName,String password) throws InterruptedException
	{
		this.LoginStep(userName, password);
		//返回到用户登录成功后的页面DashPage
		return new DashPage(this.driver);
	}
	
	/*
	 * 登录失败后，返回到本页面
	 * */
	public LoginPage loginFailed(String userName,String password) throws InterruptedException
	{
		this.LoginStep(userName, password);
		return this;
	}
	
	
}
