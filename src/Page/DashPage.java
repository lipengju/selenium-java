package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/*
 * ��¼�ɹ�����ת��ҳ��
 * */
public class DashPage extends BasePage 
{
	By niChengLocator=By.cssSelector(".user-name");
	
	public DashPage(WebDriver driver)
	{
		super(driver);
	}
	
	public WebElement getNiCheng() throws InterruptedException
	{
		super.waitTime();
		return this.driver.findElement(niChengLocator);
	}
}
