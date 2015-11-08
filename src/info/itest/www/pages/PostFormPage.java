package info.itest.www.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PostFormPage extends BasePage {
	final String create_post_url = "http://localhost/wordpress/wp-admin/post-new.php";

	public PostFormPage(WebDriver driver) {
		super(driver);
	}

	By titleLocator = By.name("post_title");
	By publishBtnLocator = By.name("publish");
	By permalinkLocator = By.id("sample-permalink");

	public void setContent(String content) {
		String js = "document.getElementById('content_ifr').contentWindow.document.body.innerHTML='"
				+ content + "'";
		((JavascriptExecutor) driver).executeScript(js);

	}
	
	public WebElement getTitleTextField() {
		return this.driver.findElement(titleLocator);
	}

	public WebElement getPublishBtn() {
		return this.driver.findElement(publishBtnLocator);
	}

	public WebElement getPermalink() {
		return this.driver.findElement(permalinkLocator);
	}

	public String createPost(String title, String content) {
		this.driver.get(this.create_post_url);
		this.getTitleTextField().sendKeys(title);
		this.setContent(content);
		this.getPublishBtn().click();
		
		return this.fetchPostId();
	}
	
	public String fetchPostId(){
		String postUrl = this.getPermalink().getText();
		String[] arr = postUrl.split("=");
		return arr[1];
	}
	
	
	public String createPost() {
		String title = "Test title" + System.currentTimeMillis();
		String content = "Test content" + System.currentTimeMillis();
		return this.createPost(title, content);
	}
	
	public String createPost(String title) {
		String content = "Test content" + System.currentTimeMillis();
		return this.createPost(title, content);
	}

	
}
