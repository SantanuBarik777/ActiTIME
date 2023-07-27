package TEST;

import java.io.IOException;

import org.testng.annotations.Test;

import Generics.BaseTest;
import POM.ActiTime_CreateNewProject;
import POM.ActiTime_DeleteProjectActions;
import POM.ActiTime_HomePage;
import POM.ActiTime_LoginPage;
import POM.ActiTime_TaskPage;

public class Actitime_LoginCreateProjectDeleteLogout extends BaseTest
{

	@Test
	public void LoginCreateProjectLogout() throws InterruptedException, IOException 
	{
		ActiTime_LoginPage loginpage=new ActiTime_LoginPage(driver);
		loginpage.loginmethod();

		ActiTime_HomePage homepage=new ActiTime_HomePage(driver);
		homepage.tasksMethod();


		ActiTime_TaskPage taskpage=new ActiTime_TaskPage(driver);
		taskpage.TaskspageaddnewbutonMethod();
		taskpage.NewProjectMethod();

		ActiTime_CreateNewProject newproject=new ActiTime_CreateNewProject(driver);
		newproject.createnewprojectMethod();
		newproject.customersuggestionMethod();
		newproject.createprojectbuttonMethod();
		taskpage.customersearchnameMethod();

		ActiTime_DeleteProjectActions deleteproject=new ActiTime_DeleteProjectActions(driver);
		deleteproject.DeleteprojectMethod();
		deleteproject.deletepermannentlybuttonMethod();
		homepage.logoutMethod();

	}

}
