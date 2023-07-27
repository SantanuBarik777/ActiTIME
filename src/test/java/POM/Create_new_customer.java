package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.AutoConstant;
import Generics.BasePage;
import Generics.ExcelLibrary;

public class Create_new_customer extends BasePage implements AutoConstant

{
	public WebDriver driver;
  @FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
  private WebElement Entercustomername;
  
  @FindBy(xpath="//div[.='Create Customer']")
  private WebElement createcustomerbutton;
  
  public Create_new_customer(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  
  public void CreatenewcustomerMethod() throws InterruptedException, IOException
  {
	  Thread.sleep(3000);
	  Entercustomername.sendKeys(ExcelLibrary.getexcellvalue(excelsheetname, 1, 3));
	  javascriptclick(driver, createcustomerbutton);
	  
  }
}
