package info.itest.www;

import static org.junit.Assert.*;

import javax.management.DescriptorKey;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import info.itest.www.pages.*;


import org.openqa.selenium.chrome.*;

public class TestLogin
{
	//类变量
	WebDriver driver;
	String loginPageUrl;
	
	UrlPage url=new UrlPage(this.driver);
	
	//数据驱动的形式来实现登录的失败测试用例
	String [][] data={
			{"oo","xx","错误：无效用户名。忘记密码？"},
			{"admin","","错误：密码一栏为空。"},
			{"","admin","错误：用户名一栏为空。"}
		};
	
	@Before
	public void setUp() throws Exception
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		url.getLoginPageUrl();
	}

	@After
	public void tearDown() throws Exception 
	{
		driver.quit();
	}

	@Test
	public void testLogin() throws InterruptedException 
	{
		
		String userName="admin";
		String password="admin";
		LoginPage lPage=new LoginPage(this.driver,url.getLoginPageUrl());
		//用户登录后，返回到DashPage类
		DashPage dashboardPage=lPage.login(userName, password);
		
		assertTrue(dashboardPage.currentUrl().contains("wp-admin"));
		assertTrue(dashboardPage.getGreetingLink().getText().contains(userName));
	}
	
	@Test 
	public void testLoginFailed()
	{
		//获取列表的数据
		for(String[] item:this.data)
		{
			String userName=item[0];
			String password=item[1];
			String tip=item[2];
			
			LoginPage lPage=new LoginPage(this.driver,url.getLoginPageUrl());
			LoginPage failPage=lPage.loginFailed(userName, password);
			assertTrue(failPage.currentUrl().contains("wp-login"));
			assertEquals(lPage.loginErrorDiv().getText(), tip);
		}

	}
	
	
	//引入数据驱动的模式来进行
	@Test
	public void testLoginFailed2()
	{
		
	}
	

}
