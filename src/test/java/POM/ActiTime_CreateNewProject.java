package POM;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.AutoConstant;
import Generics.BasePage;
import Generics.ExcelLibrary;

public class ActiTime_CreateNewProject extends BasePage implements AutoConstant

{
	public WebDriver driver;
	@FindBy(xpath="(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement enterprojectname;
	
	@FindBy(xpath="(//div[.='-- Please Select Customer to Add Project for  --'])[1]")
	private WebElement entercustomername;
	
	@FindBy(xpath="//div[@class='itemRow cpItemRow ']")
	private List<WebElement> suggestion;
	
	@FindBy(xpath="//div[.='Create Project']")
    private WebElement createprojectbutton;
	
	public ActiTime_CreateNewProject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createnewprojectMethod() throws InterruptedException, IOException
	{
		Thread.sleep(3000);
		enterprojectname.sendKeys(ExcelLibrary.getexcellvalue(excelsheetname, 1, 12));
		Thread.sleep(2000);
		javascriptclick(driver, entercustomername);
		
	}
	public void customersuggestionMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		for(int i=0;i<suggestion.size();i++)
		{
			if(suggestion.get(i).getText().equalsIgnoreCase("Big Bang Company"))
			{
				suggestion.get(i).click();
				break;
			}
	}
	}
	public void createprojectbuttonMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		javascriptclick(driver, createprojectbutton);
	}
	
    
}
