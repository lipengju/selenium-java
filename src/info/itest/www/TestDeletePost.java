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


import org.openqa.selenium.chrome.*;

public class TestDeletePost
{
	//�����
	WebDriver driver;
	
	@Before
	public void setUp() throws Exception
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/wordpress/wp-login.php");
	}

	@After
	public void tearDown() throws Exception 
	{
		driver.quit();
	}
	
	//@Test(expected=NoSuchElementException.class)
	public void testDeletePost()
	{
//		//ɾ���ĵ��Ĳ�������
//		String userName="admin";
//		String password="admin";
//		LibLogin loginLib=new LibLogin(driver);
//		loginLib.login(userName, password);
//		
//		//ɾ������ǰ��һ���ǵ��ȴ�������
//		//��ȡ���µ�ID
//		String postId=loginLib.createPost();
//		
//		//ɾ�����µĲ���
//		driver.get("http://localhost/wordpress/wp-admin/edit.php");
//		String rowId="post-"+postId;
//		//Ѱ�ҵ�row
//		WebElement row=driver.findElement(By.id(rowId));
//		//����ƶ���ȥ
//		Actions action=new Actions(driver);
//		action.moveToElement(row).perform();
//		//�����������վ,��row��Ѱ��
//		row.findElement(By.cssSelector(".trash a")).click();
//		//��������󣬿�ʼд����,����row��Ѱ�ң����ڣ�˵��ɾ���������ڣ�˵����ɾ����������isPostRowExists
//		//assertFalse(this.isPostRowExists(rowId));-->ȡ�����ԣ�ͨ��ע��ķ�ʽ��������֤����ʹ�����µķ���, ����ȡ������isPostRowExists,��е��ע��
//		driver.findElement(By.id(rowId));
		
	}
	
//	private boolean isPostRowExists(String rowId)
//	{
//		try{
//			driver.findElement(By.id(rowId));
//			return true;
//		}catch(NoSuchElementException e){
//			System.out.println("element does not exists");
//			return false;
//		}
//	}
//	
//	//��װ�������µ�����
//	public String createPost(String title,String content)
//	{
//		//��������
//		driver.get("http://localhost/wordpress/wp-admin/post-new.php");
//		driver.findElement(By.name("post_title")).sendKeys(title);
//		//���ı�����������
//		this.setContent(content);
//		driver.findElement(By.id("publish")).click();
//		//�õ����µ�ID
//		return this.fetchPostId();
//	}
//	
//	
//	//����createPost�ķ���
//	public String  createPost()
//	{
//		String title="Test title"+System.currentTimeMillis();
//		String content="Test content"+System.currentTimeMillis();
//		
////		driver.get("http://localhost/wordpress/wp-admin/post-new.php");
////		driver.findElement(By.name("post_title")).sendKeys(title);
////		this.setContent(content);
////		driver.findElement(By.id("publish")).click();
//		
//		//����4�д�����ͬ��Ϊ�˵��²�д����Ĵ��룬���ǵ����ѱ����صķ���(����ʱ�򣬿������õݹ�)
//		return this.createPost(title, content);
//	}
//	
//	
//	
//	//��������createPost�����testCreatePost�Ķ�������title������
//	public String createPost(String title)
//	{
//		String content="Test content"+System.currentTimeMillis();
//		return this.createPost(title, content);
//	}
//	
//	//���ı��Ĵ���
//	public void setContent(String content)
//	{
//		//���еĸ��ı��Ĵ���  id��iframe��id
//		String js = "document.getElementById('content_ifr').contentWindow.document.body.innerHTML='" + content + "'";
//		//ִ��as�Ĵ���
//		((JavascriptExecutor)driver).executeScript(js);
//	}
//	
//	
//	//��ȡ���µ�ID
//	public String fetchPostId()
//	{
//		String postUrl=driver.findElement(By.id("sample-permalink")).getText();
//		//��postUrl����ȡ�õ�ַhttp://localhost/wordpress/?p=15���ں������
//		//�л����Ϊһ������
//		String[]  arr=postUrl.split("=");
//		return arr[1];
//	}
	

}
