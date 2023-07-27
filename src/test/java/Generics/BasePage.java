package Generics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage 
{
	//Select Class
   public void selectbyvisibletext(WebElement element,String text)
   {
	   Select select=new Select(element);
	   select.selectByVisibleText(text);
   }
   
   //Actions class
   public void movetoelement(WebDriver driver,WebElement element)
   {
	   Actions actions=new Actions(driver);
	   actions.moveToElement(element);
   }
   public void actionsclick(WebDriver driver,WebElement element)
   {
	   Actions actions=new Actions(driver);
	   actions.click(element).perform();
   }
   
   //Robot class
   public void robottab() throws AWTException
   {
	   Robot robot=new Robot();
	   robot.keyPress(KeyEvent.VK_TAB);
	   robot.keyRelease(KeyEvent.VK_TAB);
   }
   public void robotenter() throws AWTException
   {
	  Robot robot=new Robot();
	  robot.keyPress(KeyEvent.VK_ENTER);
	  robot.keyRelease(KeyEvent.VK_ENTER);
   }
   
   //javascript interface
   public void javascriptclick(WebDriver driver,WebElement element)
   {
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("arguments[0].click()", element);
   }
   
   //Alert interface
   public void alertaccept(WebDriver driver)
   {
	   driver.switchTo().alert().accept();
   }
   public void alertdismiss(WebDriver driver)
   {
	   driver.switchTo().alert().dismiss();
   }
   public void alertenter(WebDriver driver,String text)
   {
	   driver.switchTo().alert().sendKeys(text);
   }
   //WebDriver interface
   public void gettitle(WebDriver driver,String text)
   {
	   String actualtitle=driver.getTitle();
	   if(actualtitle.contains(text))
	   {
		   System.out.println("Titles are matching");
	   }
	   else
	   {
		   System.out.println("Titles are not matching");
	   }
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
