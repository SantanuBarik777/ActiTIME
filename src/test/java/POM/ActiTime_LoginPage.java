package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.AutoConstant;
import Generics.BasePage;
import Generics.ExcelLibrary;
import Generics.Helper;

public class ActiTime_LoginPage extends BasePage implements AutoConstant

{
	public WebDriver driver;
  //Declaration
	@FindBy(id="username")
	private WebElement usernametextfield;
	
	@FindBy(name="pwd")
	private WebElement passwordtextfield;
	
	@FindBy(id="keepLoggedInLabel")
	private WebElement keepmeloggedin;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginbutton;
	
	@FindBy(id="toPasswordRecoveryPageLink")
	private WebElement forgotpassword;
	
	@FindBy(xpath="//a['actiTIME Inc.'])[2]")
	private WebElement actitimeinclink;
	
	
  //Intilization
	public ActiTime_LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
  //Utilization
	public void loginmethod() throws IOException, InterruptedException
	{
		Helper.highlightelement(driver, usernametextfield);
		usernametextfield.sendKeys(ExcelLibrary.getexcellvalue(excelsheetname, 1, 0));
		Helper.highlightelement(driver, passwordtextfield);
		passwordtextfield.sendKeys(ExcelLibrary.getexcellvalue(excelsheetname, 1, 1));
		javascriptclick(driver, keepmeloggedin);
		javascriptclick(driver, loginbutton);
	}
	
	public void forgotpasswordmethod()
	{
		forgotpassword.click();
	}
	
	public void actitimeinclinkmethod()
	{
		actitimeinclink.click();
	}
	
}
