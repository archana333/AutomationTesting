package TestCases;

import org.testng.annotations.Test;

import Base.DriverInstance;
import Pages.LogInpage;

public class TC_001_LogInFunctionality extends DriverInstance {
	@Test
	public void LogInFunctionality() throws Exception
	{
		LogInpage logIn = new LogInpage(driver);
		logIn.EnterUsername("uname1");
		logIn.EnterPwd("pwd");
		logIn.clickSignIn();
	}

}
