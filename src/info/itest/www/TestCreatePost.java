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

public class TestCreatePost
{
	//¿‡±‰¡ø
	WebDriver driver;
	final String homePageUrl="http://localhost/wordpress/";
	final String loginPageUrl="http://localhost/wordpress/wp-login.php";
	
	@Before
	public void setUp() throws Exception
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception 
	{
		driver.quit();
	}
	
	
	@Test
	public void testCreatePost()
	{
		String userName="admin";
		String password="admin";

		
		LoginPage theLoginPage=new LoginPage(this.driver,this.loginPageUrl );
		theLoginPage.login(userName, password);
		
		PostFormPage createPostPage=new PostFormPage(this.driver);
		String title="Test Title"+System.currentTimeMillis();
		createPostPage.createPost(title);
		
		HomePage home=new HomePage(this.driver,this.homePageUrl);
		assertEquals(title, home.getFirstPostLink().getText());
	}
}
