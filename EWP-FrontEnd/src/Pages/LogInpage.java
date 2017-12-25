package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utility.Utility;

public class LogInpage {
	
	WebDriver driver;
	public LogInpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void EnterUsername(String uname) throws Exception
	{
		driver.findElement(By.xpath(Utility.fetchLocatorValue("login_uname_id"))).sendKeys(uname);;
	}
	
	public void EnterPwd(String pwd) throws Exception
	{
		driver.findElement(By.xpath(Utility.fetchLocatorValue("login-pwd_id"))).sendKeys(pwd);;
	}
	
	public void clickSignIn() throws Exception
	{
		driver.findElement(By.xpath(Utility.fetchLocatorValue("SignIn-id"))).click();	
	}
	

}
