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
	 * ��
	 * */
	WebDriver driver;
	String loginPageUrl;
	
	UrlPage url=new UrlPage(this.driver);
	LoginPage page;
	DashPage dashPage=null;
	
//	//������������ʽ��ʵ�ֵ�¼��ʧ�ܲ�������
//	String [][] data={
//			{"oo","xx","������Ч�û������������룿"},
//			{"admin","","��������һ��Ϊ�ա�"},
//			{"","admin","�����û���һ��Ϊ�ա�"}
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
		String niCheng="�峿����";
		page=new LoginPage(this.driver,url.getLoginPageUrl());
		dashPage=page.login(userName, password);
		//assertTrue(dashPage.currentUrl().contains(""));
		assertTrue(dashPage.getNiCheng().getText().contains(niCheng));
		
	}
	
//	@Test 
//	public void testLoginFailed()
//	{
//		//��ȡ�б������
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
