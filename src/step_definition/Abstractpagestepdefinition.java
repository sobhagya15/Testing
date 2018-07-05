package step_definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Abstractpagestepdefinition
{
	protected static WebDriver driver;
	protected WebDriver getDriver()
	{
		if(driver==null)
		{
			driver=new FirefoxDriver();
			
		}return driver;
	}

}
