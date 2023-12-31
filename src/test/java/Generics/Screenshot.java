package Generics;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Screenshot implements ITestListener
{
	public void onTestFailure(ITestResult result) 
  {
	  TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;
	  File srcfile=ts.getScreenshotAs(OutputType.FILE);
	  String name=result.getName();
	  Date date=Calendar.getInstance().getTime();
	  String today=date.toString().replaceAll(":", "_");
	  File destfile=new File("./Failedscreenshot/"+name+today+".png");
	  
	  try
	  {
		  FileHandler.copy(srcfile, destfile);
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  }    
}
