package TEST;

import java.io.IOException;

import org.testng.annotations.Test;

import Generics.BaseTest;
import POM.ActiTime_DeleteCustomerAction;
import POM.ActiTime_HomePage;
import POM.ActiTime_LoginPage;
import POM.ActiTime_TaskPage;
import POM.Create_new_customer;

public class Actitime_LoginCustomerDeleteLogout extends BaseTest 
{

	@Test 
	public void LoginNewCustomerLogout() throws InterruptedException, IOException
	{
		

		ActiTime_LoginPage loginpage=new ActiTime_LoginPage(driver);
		loginpage.loginmethod();

		ActiTime_HomePage homepage=new ActiTime_HomePage(driver);
		homepage.tasksMethod();

		ActiTime_TaskPage taskpage=new ActiTime_TaskPage(driver);
		taskpage.TaskspageaddnewbutonMethod();

		Create_new_customer newcustomer=new Create_new_customer(driver);
		taskpage.NewcustomerMethod();
		newcustomer.CreatenewcustomerMethod();
		homepage.tasksMethod();
		taskpage.customersearchnameMethod();
		
		ActiTime_DeleteCustomerAction deletecustomer=new ActiTime_DeleteCustomerAction(driver);
		deletecustomer.DeletecustomerMethod();
		homepage.logoutMethod();

	}

}
