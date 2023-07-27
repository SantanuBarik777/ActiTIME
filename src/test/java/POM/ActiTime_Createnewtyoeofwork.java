package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.AutoConstant;
import Generics.BasePage;
import Generics.ExcelLibrary;

public class ActiTime_Createnewtyoeofwork extends BasePage implements AutoConstant 

{
	public WebDriver driver;
   @FindBy(name="name")
   private WebElement nametextbox;
   
   @FindBy(xpath="//input[@type='submit']")
   private WebElement createtypeofworkbutton;
   
   
   public ActiTime_Createnewtyoeofwork(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   
   public void CreatenewtyoeofworkMethod() throws IOException
   {
	   nametextbox.sendKeys(ExcelLibrary.getexcellvalue(excelsheetname, 1, 9));
	   javascriptclick(driver, createtypeofworkbutton);
   }
	
}
