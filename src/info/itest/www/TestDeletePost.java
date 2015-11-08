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
	//类变量
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
//		//删除文档的测试用例
//		String userName="admin";
//		String password="admin";
//		LibLogin loginLib=new LibLogin(driver);
//		loginLib.login(userName, password);
//		
//		//删除文章前，一定记得先创建文章
//		//获取文章的ID
//		String postId=loginLib.createPost();
//		
//		//删除文章的操作
//		driver.get("http://localhost/wordpress/wp-admin/edit.php");
//		String rowId="post-"+postId;
//		//寻找到row
//		WebElement row=driver.findElement(By.id(rowId));
//		//鼠标移动上去
//		Actions action=new Actions(driver);
//		action.moveToElement(row).perform();
//		//点击移至回收站,从row中寻找
//		row.findElement(By.cssSelector(".trash a")).click();
//		//点击完整后，开始写断言,依据row来寻找，存在，说明删除，不存在，说明已删除，见方法isPostRowExists
//		//assertFalse(this.isPostRowExists(rowId));-->取消断言，通过注解的方式来断言验证，再使用如下的方法, 可以取消方法isPostRowExists,机械能注解
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
//	//封装创建文章的内容
//	public String createPost(String title,String content)
//	{
//		//创建文章
//		driver.get("http://localhost/wordpress/wp-admin/post-new.php");
//		driver.findElement(By.name("post_title")).sendKeys(title);
//		//富文本中输入内容
//		this.setContent(content);
//		driver.findElement(By.id("publish")).click();
//		//拿到文章的ID
//		return this.fetchPostId();
//	}
//	
//	
//	//重载createPost的方法
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
//		//如上4行代码相同，为了导致不写多余的代码，我们调用已被重载的方法(明显时候，可以利用递归)
//		return this.createPost(title, content);
//	}
//	
//	
//	
//	//继续重载createPost，解决testCreatePost的断言中有title的问题
//	public String createPost(String title)
//	{
//		String content="Test content"+System.currentTimeMillis();
//		return this.createPost(title, content);
//	}
//	
//	//富文本的处理
//	public void setContent(String content)
//	{
//		//所有的富文本的处理  id是iframe的id
//		String js = "document.getElementById('content_ifr').contentWindow.document.body.innerHTML='" + content + "'";
//		//执行as的代码
//		((JavascriptExecutor)driver).executeScript(js);
//	}
//	
//	
//	//获取文章的ID
//	public String fetchPostId()
//	{
//		String postUrl=driver.findElement(By.id("sample-permalink")).getText();
//		//切postUrl，获取该地址http://localhost/wordpress/?p=15等于后的数字
//		//切换后的为一个数组
//		String[]  arr=postUrl.split("=");
//		return arr[1];
//	}
	

}
