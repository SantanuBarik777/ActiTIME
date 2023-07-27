package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.AutoConstant;
import Generics.BasePage;

public class ActiTime_DeleteCustomerAction extends BasePage implements AutoConstant

{
	public WebDriver driver;
	@FindBy(xpath="(//div[.='ACTIONS'])[1]")
	private WebElement actionsbutton;
	
	@FindBy(xpath="(//div[.='Delete'])[2]")
	private WebElement deletebutton;
	
	@FindBy(xpath="//span[.='Delete permanently']/..")
	private WebElement deletepermanently;
	
	
	public  ActiTime_DeleteCustomerAction(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void DeletecustomerMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		javascriptclick(driver, actionsbutton);
		Thread.sleep(3000);
		javascriptclick(driver, deletebutton);
		Thread.sleep(4000);
		javascriptclick(driver, deletepermanently);
	}

}
