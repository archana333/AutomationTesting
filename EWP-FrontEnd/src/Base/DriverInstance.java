package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utility.Utility;

public class DriverInstance {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void initiateDriverInstance() throws Exception
	{
		if(Utility.fetchproperty("bowserName").toString().equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else {
			System.setProperty("webdriver.chome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.get(Utility.fetchproperty("ApplicationURL").toString());
	}
	
	@AfterMethod
	public void closeDriverInstance()
	{
		driver.close();
	}

}
