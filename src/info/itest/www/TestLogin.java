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
	//�����
	WebDriver driver;
	String loginPageUrl;
	
	UrlPage url=new UrlPage(this.driver);
	
	//������������ʽ��ʵ�ֵ�¼��ʧ�ܲ�������
	String [][] data={
			{"oo","xx","������Ч�û������������룿"},
			{"admin","","��������һ��Ϊ�ա�"},
			{"","admin","�����û���һ��Ϊ�ա�"}
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
		//�û���¼�󣬷��ص�DashPage��
		DashPage dashboardPage=lPage.login(userName, password);
		
		assertTrue(dashboardPage.currentUrl().contains("wp-admin"));
		assertTrue(dashboardPage.getGreetingLink().getText().contains(userName));
	}
	
	@Test 
	public void testLoginFailed()
	{
		//��ȡ�б������
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
	
	
	//��������������ģʽ������
	@Test
	public void testLoginFailed2()
	{
		
	}
	

}
