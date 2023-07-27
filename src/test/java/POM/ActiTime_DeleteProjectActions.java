package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.AutoConstant;
import Generics.BasePage;

public class ActiTime_DeleteProjectActions extends BasePage implements AutoConstant

{
	public WebDriver driver;
	@FindBy(xpath="(//div[.='ACTIONS'])[2]")
	private WebElement actionsbutton;
	
	@FindBy(xpath="(//div[.='Delete'])[3]")
	private WebElement deletebutton;
	
	@FindBy(xpath="//span[.='Delete permanently']/..")
	private WebElement deletepermannentlybutton;
	
	public ActiTime_DeleteProjectActions(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void DeleteprojectMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		javascriptclick(driver, actionsbutton);
		javascriptclick(driver, deletebutton);
		
	}
	public void deletepermannentlybuttonMethod()
	{
		javascriptclick(driver, deletepermannentlybutton);
		
	}

}
