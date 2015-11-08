package info.itest.www.pages;

import org.openqa.selenium.*;

/*
 * ����ҳ��Ļ���
 * */
public class BasePage
{
	protected final WebDriver driver;
	protected  String url;
	
	//���캯��
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void goTo ()
	{
		this.driver.get(this.url);
	}
	
	//���ز�Ҫ��¶�ײ�Ĵ�����û�
	public String currentUrl()
	{
		return this.driver.getCurrentUrl();
	}
}
