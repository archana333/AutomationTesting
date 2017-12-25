package assertions;

import org.openqa.selenium.WebDriver;

public class Compare {
	
	public boolean validatePageURL(WebDriver driver,String ExpURL) {
		boolean flag=false;
		if(driver.getCurrentUrl().equalsIgnoreCase(ExpURL)) 
		{
			flag=true;
		} return flag;
		
	}
	

}
