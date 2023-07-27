package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.AutoConstant;
import Generics.BasePage;
import Generics.ExcelLibrary;

public class ActiTime_TaskPage extends BasePage implements AutoConstant


{
	public WebDriver driver;
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnew;

	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newcustomer;
	
	@FindBy(xpath="//div[.='+ New Project']")
	private WebElement newproject;
	
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]")
	private WebElement searchcustomer;
	
	@FindBy(xpath="//span[@class='highlightToken']")
	private WebElement clickonname;
	
	@FindBy(xpath="//span[.='SAN']/../../..//div[@class='editButton']")
	private WebElement editbutton;
	
	
	
	
	public ActiTime_TaskPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void TaskspageaddnewbutonMethod() throws InterruptedException
	{
		Thread.sleep(4000);
		javascriptclick(driver, addnew);
	}
	public void NewcustomerMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		javascriptclick(driver, newcustomer);
	}
	
	public void NewProjectMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		newproject.click();
	}
	public void customersearchnameMethod() throws InterruptedException, IOException
	{
		Thread.sleep(3000);
		searchcustomer.sendKeys(ExcelLibrary.getexcellvalue(excelsheetname, 1, 6));
		Thread.sleep(3000);
		javascriptclick(driver, clickonname);
		Thread.sleep(3000);
		javascriptclick(driver, editbutton);
	}
	public void serchNameTextFieldMethod()
	{
		searchcustomer.clear();
	}
	
	
}





