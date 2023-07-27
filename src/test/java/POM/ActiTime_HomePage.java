package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.AutoConstant;
import Generics.BasePage;

public class ActiTime_HomePage extends BasePage implements AutoConstant 

{
	public WebDriver driver;
	@FindBy(xpath="//div[.='Switch to actiPLANS'])[1]")
	private WebElement switchtoactiplans;	
	
	@FindBy(id="container_tt")
	private WebElement timetrack;
	
	@FindBy(id="container_tasks")
	private WebElement tasks;
	
	@FindBy(id="container_reports")
	private WebElement reports;
	
	@FindBy(id="container_users")
	private WebElement users;
	
	@FindBy(xpath="//div[@class='popup_menu_icon'])[1]")
	private WebElement calendarbuttton;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingbutton;
	
	@FindBy(id="popup_menu_item_9")
	private WebElement workflowsetting;
	
	@FindBy(id="popup_menu_item_2")
	private WebElement typesofwork;
	
	@FindBy(id="popup_menu_item_3")
	private WebElement leavetypes;
	
	@FindBy(id="popup_menu_item_5")
	private WebElement notification;
	
	@FindBy(id="popup_menu_item_5")
	private WebElement logosetting;
	
	@FindBy(xpath="//div[@class='popup_menu_icon'])[3]")
	private WebElement integrationbuttton;
	
	@FindBy(xpath="//div[@class='popup_menu_icon'])[4]")
	private WebElement helpsupportbutton;
	
	@FindBy(xpath="//div[@class='popup_menu_icon'])[5]")
	private WebElement highlightbutton;
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logoutbutton;

  public ActiTime_HomePage(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);;
  }
 
  public void homepageMethod() throws InterruptedException
  {
	  Thread.sleep(3000);
	  timetrack.click();
	  reports.click();
//	  users.click();
  }
  
  public void tasksMethod() throws InterruptedException
  {
	  Thread.sleep(3000);
	  javascriptclick(driver, tasks);
  }
  
  public void settingMethod() throws InterruptedException
  {
	  Thread.sleep(5000);
	  settingbutton.click();
  }
  
  public void typesofworkMethod() throws InterruptedException
  {
	  Thread.sleep(3000);
	  typesofwork.click();
  }
  
  public void leavetypesMethod()
  {
	  leavetypes.click();
  }
  
  public void logoutMethod() throws InterruptedException
  {
	  Thread.sleep(2000);
	  javascriptclick(driver, logoutbutton);
  }

}

  
  
  
  
  