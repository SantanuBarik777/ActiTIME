package TEST;

import java.io.IOException;

import org.testng.annotations.Test;

import Generics.BaseTest;
import POM.ActiTime_HomePage;
import POM.ActiTime_LoginPage;

public class Actitime_LoginLogout extends BaseTest
{

	@Test
	public void Loginlogout() throws IOException, InterruptedException 
	{

		ActiTime_LoginPage loginpage=new ActiTime_LoginPage(driver);
		loginpage.loginmethod();

		ActiTime_HomePage homePage=new ActiTime_HomePage(driver);
		homePage.logoutMethod();
	}

}
