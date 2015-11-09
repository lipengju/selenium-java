package TestCase;

import static org.junit.Assert.*;

import javax.management.DescriptorKey;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;




import org.openqa.selenium.chrome.*;

import Page.*;

public class TestLogin 
{
	/*
	 * 类
	 * */
	WebDriver driver;
	String loginPageUrl;
	
	UrlPage url=new UrlPage(this.driver);
	LoginPage page;
	DashPage dashPage=null;
	
//	//数据驱动的形式来实现登录的失败测试用例
//	String [][] data={
//			{"oo","xx","错误：无效用户名。忘记密码？"},
//			{"admin","","错误：密码一栏为空。"},
//			{"","admin","错误：用户名一栏为空。"}
//		};
	
	@Before
	public void setUp() throws Exception
	{
		this.driver=new FirefoxDriver();
		this.driver.manage().window().maximize();
		url.getLoginPageUrl();
		
	}


	@Test
	public void testLogin() throws InterruptedException 
	{
		
		String userName="liwangpingmysql@outlook.com";
		String password="194935/==";
		String niCheng="清晨无涯";
		page=new LoginPage(this.driver,url.getLoginPageUrl());
		dashPage=page.login(userName, password);
		//assertTrue(dashPage.currentUrl().contains(""));
		assertTrue(dashPage.getNiCheng().getText().contains(niCheng));
		
	}
	
//	@Test 
//	public void testLoginFailed()
//	{
//		//获取列表的数据
//		for(String[] item:this.data)
//		{
//			String userName=item[0];
//			String password=item[1];
//			String tip=item[2];
//			
//			LoginPage lPage=new LoginPage(this.driver,url.getLoginPageUrl());
//			LoginPage failPage=lPage.loginFailed(userName, password);
//			assertTrue(failPage.currentUrl().contains("wp-login"));
//			assertEquals(lPage.loginErrorDiv().getText(), tip);
//		}
//
//	}
//	
	
	@After
	public void tearDown() throws Exception 
	{
		driver.quit();
	}

}
