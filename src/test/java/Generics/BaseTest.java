package Generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements AutoConstant

{
	public static WebDriver driver;
	@BeforeSuite
	public void executionstsrt()
	{
		System.out.println("Execution Start");
	}
	
	@BeforeTest
	public void setup()
	{
		//WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
//	@Parameters("browser")
//	@BeforeTest
//	public void setup(String browser)
//	{
//	if(browser.equalsIgnoreCase("chrome"))	
//	{
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get(url);
//	}
//	else if (browser.equalsIgnoreCase("edge")) 
//	{
//		driver=new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.get(url);
//	}
//	else 
//	{
//		driver=new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.get(url);
//	}
//	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
	@AfterSuite
	public void executioncomplete()
	{
		System.out.println("Execution Complete");
	}
	

}
