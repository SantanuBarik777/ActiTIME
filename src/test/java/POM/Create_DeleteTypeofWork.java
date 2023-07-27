package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.AutoConstant;
import Generics.BasePage;

public class Create_DeleteTypeofWork extends BasePage implements AutoConstant

{
	public WebDriver driver;
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement createtypeofwork;
	
	@FindBy(xpath="//a[.='SAN']/../..//a[contains(text(),'delete')]")
	private WebElement deletetname;
	
	
	public Create_DeleteTypeofWork(WebDriver driver)
	{
	    this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
	
	public void createtypeofworkMethod() throws InterruptedException
	{
		Thread.sleep(5000);
		javascriptclick(driver, createtypeofwork);
	}
	public void deletetypeofworknameMethod()
	{
		javascriptclick(driver, deletetname);
	}
	public void typeofworkpopupMethod()
	{
		alertaccept(driver);
	}
	
}
