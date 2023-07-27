
package TEST;

import java.io.IOException;

import org.testng.annotations.Test;

import Generics.BaseTest;
import POM.ActiTime_Createnewtyoeofwork;
import POM.ActiTime_HomePage;
import POM.ActiTime_LoginPage;
import POM.Create_DeleteTypeofWork;

public class Actitime_LoginCreateTypesOfWorkDeleteLogout extends BaseTest
{

	@Test
	public void LoginCreateTypesOfWorkLogout() throws InterruptedException, IOException
	{

		ActiTime_LoginPage loginpage=new ActiTime_LoginPage(driver);
		loginpage.loginmethod();

		ActiTime_HomePage homepage=new ActiTime_HomePage(driver);
		homepage.settingMethod();

		Create_DeleteTypeofWork typeofwork=new Create_DeleteTypeofWork(driver);
		homepage.typesofworkMethod();
		typeofwork.createtypeofworkMethod();

		ActiTime_Createnewtyoeofwork newtypeofwork=new ActiTime_Createnewtyoeofwork(driver);
		newtypeofwork.CreatenewtyoeofworkMethod();
		typeofwork.deletetypeofworknameMethod();
		typeofwork.typeofworkpopupMethod();
		homepage.logoutMethod();
		

	}

}
